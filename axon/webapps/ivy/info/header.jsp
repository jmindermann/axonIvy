<%@ page import="ch.ivyteam.licence.*"%>
<%@ page import="ch.ivyteam.ivy.application.IApplication"%>
<%@ page import="ch.ivyteam.ivy.update.restricted.IUpdateManager"%>
<%@ page import="ch.ivyteam.ivy.update.restricted.Release"%>
<%@ page import="ch.ivyteam.di.restricted.*"%>
<%@ page import="ch.ivyteam.util.Version"%>
<%@ page import="ch.ivyteam.ivy.Advisor"%>
<jsp:useBean id="ivyServer" class="ch.ivyteam.ivy.webserver.ServerLimited" scope="application"/>
<div class="navbar navbar-top <%=Advisor.getAdvisor().isReleaseCandidate() ? "navbar-rc" : ""%>" role="navigation">
  <div class="container" id="headerdiv">
    <div class="navbar-header">
      <a class="ivy-logo" href="../info/index.jsp">
        <img src="../shared/images/axon_ivy_logo.png" alt="Axon.ivy" />
      </a>
    </div>
  </div>
</div>
<%
String pageId = (String) request.getParameter("pageId");
if (pageId == null)
{
  pageId = "info_panel";
}
%>
<div class="navbar ivy-subnav">
  <div class="navbar-inner">
    <div class="container">
      <div class="row">
        <ul class="nav nav-pills">
          <li class="<%=pageId.startsWith("info") ? "active" : ""%>"><a href="index.jsp" target="_top">Server</a></li>
<%
	boolean hasEngineConfigUi = ivyServer.getApplicationConfigurationManager().findProcessModelVersion(IApplication.SYSTEM_APPLICATION_NAME, "EngineConfigUi", 0) != null;
	if (hasEngineConfigUi)
	{
%>
          <li><a href="../pro/System/EngineConfigUi/157E64657EEBDD9C/start.ivp">Config</a></li>
<%
	}
%>
          <li class="<%=pageId.startsWith("admin") ? "active" : ""%>"><a href="index.jsp?pageId=admin_panel" target="_top">Admin</a></li>
<%
	if (ivyServer.getClusterManager().isClusterServer())
	{
%>
          <li class="<%=pageId.startsWith("cluster") ? "active" : ""%>"><a href="index.jsp?pageId=cluster_panel" target="_top">Cluster</a></li>
<%
	}
	boolean portalApp = ivyServer.getApplicationConfigurationManager().findApplication(IApplication.PORTAL_APPLICATION_NAME) != null;
	if (portalApp)
	{
%>
          <li><a href="../pro/Portal/PortalTemplate/1549F58C18A6C562/PortalStart.ivp" target="_top">Portal</a></li>
<%	
	}
%>
        </ul>
      </div>
    </div>
  </div>
</div>
