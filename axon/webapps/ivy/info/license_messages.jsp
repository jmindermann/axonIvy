<%@ page import="ch.ivyteam.licence.*"%>
<%@ page import="ch.ivyteam.ivy.Advisor"%>
<%@ page import="ch.ivyteam.ivy.application.IApplication"%>
<jsp:useBean id="ivyServer" class="ch.ivyteam.ivy.webserver.ServerLimited" scope="application"/>
<%
if (ch.ivyteam.licence.SignedLicence.isDemo())
{
%>
  <div class="alert alert-danger" role="alert">Demo Mode - No license installed.
<%
	boolean hasEngineConfigUi = ivyServer.getApplicationConfigurationManager().findProcessModelVersion(IApplication.SYSTEM_APPLICATION_NAME, "EngineConfigUi", 0) != null;
	if (hasEngineConfigUi)
	{
%>
Please use the <a href="../pro/System/EngineConfigUi/157E64657EEBDD9C/start.ivp">Engine Configuration</a> to set up your <%=Advisor.getAdvisor().getApplicationName()%>.
<%
	}
%>
</div>
<%
}
//init  
java.util.List<LicenceEvent> events = LicenceEventManager.getInstance().getUnconfirmedLicenceEvents();
// parameter checked is set in license.jsp when the license violation messages are going to be cleared. 
if (!events.isEmpty() && request.getParameter("checked") == null) { 
%>
  <div class="alert alert-danger" role="alert">License exceeded! <a href="index.jsp?pageId=license">show details</a></div>
<%
}
%>