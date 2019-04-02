@echo off

SET IIS_DIR=%SystemRoot%\System32\inetsrv
SET SITE=Default Web Site
SET VDIR=ivy
SET CFG_DIR=%~dp0
SET LOG_DIR=%CFG_DIR%ssoConfigLog
SET LOG_FILE="%LOG_DIR%\ScriptLog.txt"
SET IIS_INST_LOG="%LOG_DIR%\IISInstallLog"

NET SESSION >nul 2>&1
IF %ERRORLEVEL% EQU 0 (
    ECHO Administrator privileges detected 
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


( dir /b /a "%IIS_DIR%" | findstr . ) > nul || (
  ECHO IIS is not installed.
  ECHO.
  ECHO First install IIS and configure it as proxy for 
  ECHO Axon.ivy.
  ECHO.
  ECHO You can do this with the script autoconfig.bat.
  ECHO.
  PAUSE
  EXIT
) 

IF EXIST %LOG_FILE% (
	ECHO This Script was already run on this machine. 
	ECHO Consult the file %LOG_FILE% for results.
	PAUSE
	EXIT
)

ECHO This will configure Single Sign On (SSO) for an IIS.
ECHO The IIS must have an Virtual Directory named ivy 
ECHO which acts as proxy to the Axon.ivy Engine.
ECHO.
ECHO The Result of the configuration is logged to 
ECHO %LOG_FILE%
ECHO.


choice /M "Do you want to continue"
if ERRORLEVEL 2 EXIT

ECHO Please wait. This takes up to 10 minutes.
MKDIR "%LOG_DIR%"
PATH %PATH%;%IIS_DIR%

ECHO == Install SSO == >> %LOG_FILE%
ECHO Consult %IIS_INST_LOG% for more information about the installation process >> %LOG_FILE%
PKGMGR.EXE /l:%IIS_INST_LOG% /iu:IIS-WindowsAuthentication >> %LOG_FILE%
ECHO .

ECHO. >> %LOG_FILE%
ECHO. >> %LOG_FILE%
ECHO == Enable Windows Authentication for virtual directory ivy == >> %LOG_FILE%
appcmd.exe set config "%SITE%/%VDIR%" -section:system.webServer/security/authentication/anonymousAuthentication /enabled:"False" /commit:apphost >> %LOG_FILE%
appcmd.exe set config "%SITE%/%VDIR%" -section:system.webServer/security/authentication/windowsAuthentication /enabled:"True"  /-"providers.[value='Negotiate']" /commit:apphost >> %LOG_FILE%
ECHO .

ECHO. >> %LOG_FILE%
ECHO. >> %LOG_FILE%
ECHO == Restart IIS == >> %LOG_FILE%
iisreset.exe /restart >> %LOG_FILE%
ECHO .

ECHO Done. Consult the log file: %LOG_FILE% for results.

PAUSE