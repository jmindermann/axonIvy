@echo off

SET IIS_DIR=%SystemRoot%\System32\inetsrv
SET SITE=Default Web Site
SET VDIR=ivy
SET CFG_DIR=%~dp0
SET LOG_DIR=%CFG_DIR%installLog
SET LOG_FILE="%LOG_DIR%\ScriptLog.txt"
SET TMP_PS=tmpPsScript.ps1
SET IIS_INST_LOG="%LOG_DIR%\IISInstallLog"

NET SESSION >nul 2>&1
IF %ERRORLEVEL% EQU 0 (
    ECHO Administrator privileges detected. 
	ECHO.
) ELSE (
 	ECHO You need Administrator priviledges to run this script.
	PAUSE
	EXIT
)


systeminfo | find "Microsoft Windows Server 2008 R2" > nul
IF %ERRORLEVEL% EQU 0 (
	ECHO Microsoft Windows Server 2008 R2 Operating System detected.
	ECHO.
	GOTO SUPPORTED_OS
)

systeminfo | find "Microsoft Windows Server 2012" > nul
IF %ERRORLEVEL% EQU 0 (
	ECHO Microsoft Windows Server 2012 Operating System detected.
	ECHO.
	GOTO SUPPORTED_OS
)

ECHO This Script is only tested with Microsoft Windows Server 2008 R2 and Microsoft Windows Server 2012.
ECHO Continue at your own risk.
ECHO.
CHOICE /M "Do you want to continue?"
IF ERRORLEVEL 2 EXIT
ECHO.
ECHO.

:SUPPORTED_OS


( dir /b /a "%IIS_DIR%" | findstr . ) > nul && (
  ECHO IIS is already Installed.
  ECHO.
  ECHO Changes in the configuration made through this script in the 
  ECHO existing IIS installation may lead to errors either in already 
  ECHO running web application or the redirect to Axon.ivy.
  ECHO.
  ECHO Consult the Axon.ivy Engine Guide if you want  
  ECHO to manually configure a running IIS.
  ECHO. 
  CHOICE /M "Do you want to continue and reconfigure the existing IIS installation?"
  IF ERRORLEVEL 2 EXIT
  ECHO.
  ECHO.
) 

IF EXIST %LOG_FILE% (
	ECHO Configuration aborted:
	ECHO This Script has already run on this machine. 
	ECHO Consult the file %LOG_FILE% for results.
	PAUSE
	EXIT
)




ECHO.
ECHO.
ECHO This will install and configure the IIS as proxy for the Axon.ivy Engine.
ECHO.
ECHO The virtual directory %SITE%/%VDIR% will redirect to Axon.ivy 
ECHO after this script has run sucessfully.
ECHO.
ECHO The directory this script is located in, is used for the 
ECHO virtual directoy. Ensure that it is not going to be removed.
ECHO.
ECHO The results of the configuration will be logged to 
ECHO %LOG_FILE%
ECHO.


choice /M "Do you want to continue"
if ERRORLEVEL 2 EXIT

ECHO Please wait. This takes up to 15 minutes.
MKDIR "%LOG_DIR%"
PATH %PATH%;%IIS_DIR%

ECHO == Install IIS == >> %LOG_FILE%
ECHO Consult %IIS_INST_LOG% for more information about the installation process >> %LOG_FILE%
PKGMGR.EXE /l:%IIS_INST_LOG% /iu:IIS-WebServerRole;IIS-WebServer;IIS-CommonHttpFeatures;IIS-StaticContent;IIS-DefaultDocument;IIS-DirectoryBrowsing;IIS-HttpErrors;IIS-ApplicationDevelopment;IIS-CGI;IIS-ISAPIExtensions;IIS-ISAPIFilter;IIS-HealthAndDiagnostics;IIS-HttpLogging;IIS-RequestMonitor;IIS-Security;IIS-WindowsAuthentication;IIS-RequestFiltering;IIS-Performance;IIS-HttpCompressionStatic;IIS-WebServerManagementTools;IIS-ManagementScriptingTools;IIS-ManagementService >> %LOG_FILE%
ECHO .

ECHO. >> %LOG_FILE%
ECHO. >> %LOG_FILE%
ECHO == Set Feature Delegation for Handler Mappings to Read/Write == >> %LOG_FILE%
powershell -ExecutionPolicy unrestricted -ImportSystemModules Set-WebConfiguration //System.webServer/handlers -metadata overrideMode -value Allow -PSPath IIS:/ >> %LOG_FILE%
ECHO .

ECHO. >> %LOG_FILE%
ECHO. >> %LOG_FILE%
ECHO == set cgi restriction for isapi dll == >> %LOG_FILE%
appcmd.exe set config /section:isapiCgiRestriction /+[@start,description='Tomcat',path='"%CFG_DIR%isapi_redirect-1.2.42.dll"',allowed='true'] >> %LOG_FILE%
ECHO .

ECHO. >> %LOG_FILE%
ECHO. >> %LOG_FILE%
ECHO == Create ISAPI filter ==  >> %LOG_FILE%
appcmd.exe set config /section:isapiFilters /+[@start,name='Tomcat',path='"%CFG_DIR%isapi_redirect-1.2.42.dll"'] >> %LOG_FILE%
ECHO .


REM Does string have a trailing slash? if so remove it 
IF %CFG_DIR:~-1%==\ SET CFG_DIR=%CFG_DIR:~0,-1%

ECHO. >> %LOG_FILE%
ECHO. >> %LOG_FILE%
ECHO == Create Virtual directory == >> %LOG_FILE%
appcmd.exe add vdir /app.name:"%SITE%/" /path:/%VDIR% /physicalPath:"%CFG_DIR%" >> %LOG_FILE%
ECHO .

ECHO. >> %LOG_FILE%
ECHO. >> %LOG_FILE%
ECHO == Configure handler Access Policy for Virtual Directory == >> %LOG_FILE%
appcmd.exe set config "%SITE%/%VDIR%" /section:system.webServer/handlers /accessPolicy:Read,Write,Execute >> %LOG_FILE%
ECHO .

ECHO. >> %LOG_FILE%
ECHO. >> %LOG_FILE%
ECHO == Configure error page: show error pages from ivy-engine (instead of error page from IIS) == >> %LOG_FILE%
appcmd.exe set config "%SITE%/%VDIR%" /section:system.webServer/httpErrors /errorMode:Detailed >> %LOG_FILE%
ECHO .

ECHO. >> %LOG_FILE%
ECHO. >> %LOG_FILE%
ECHO == Restart IIS == >> %LOG_FILE%
iisreset.exe /restart >> %LOG_FILE%
ECHO .

ECHO Done. Consult the log file: %LOG_FILE% for results.

PAUSE