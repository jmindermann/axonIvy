<%@ page import="ch.ivyteam.ivy.application.IApplication"%>
<%@ page import="ch.ivyteam.ivy.application.IProcessModel"%>
<%@ page import="ch.ivyteam.ivy.application.IProcessModelVersion"%>
<%@ page import="ch.ivyteam.ivy.webserver.IServerLimited"%>
<%@ page import="ch.ivyteam.ivy.project.IIvyProject"%>
<%@ page import="ch.ivyteam.ivy.project.IvyProjectNavigationUtil"%>
<%@ page import="ch.ivyteam.ivy.workflow.IStartElement"%>
<%@ page import="ch.ivyteam.ivy.workflow.IWebServiceProcess"%>
<%@ page import="ch.ivyteam.ivy.workflow.IWebServiceProcessStartElement"%>
<%@ page import="ch.ivyteam.ivy.security.ISecurityConstants"%>
<%@ page import="ch.ivyteam.ivy.request.RequestUriFactory"%>
<%@ page import="ch.ivyteam.ivy.bpm.engine.restricted.IBpmEngine"%>
<%@ page import="ch.ivyteam.ivy.service.ServiceState"%>
<%@ page import="java.util.Iterator"%>
<%@ page import="java.util.Set"%>
<%@ page import="java.util.Map"%>
<%@ page import="java.util.HashMap"%>
<%@ page import="java.util.List"%>
<%@ page import="java.util.ArrayList"%>
<jsp:useBean id="ivyServer" class="ch.ivyteam.ivy.webserver.ServerLimited" scope="application"/>

<%
IIvyProject configProject = null;
boolean running;
boolean showSystem = Boolean.parseBoolean(request.getParameter("showSystemApp"));
long applicationId = -1L;
if (request.getParameter("applicationId") != null)
{
	applicationId = Long.parseLong(request.getParameter("applicationId"));
}
%>

<div role="navigation" id="sidebar" class="col-xs-3 col-sm-3 sidebar-offcanvas" style="padding-top: 28px">
	<div data-offset-bottom="60" data-offset-top="150" data-spy="affix" class="bs-sidebar hidden-print affix"> 
		<ul class="nav bs-sidenav">
<%

for (IApplication app : ivyServer.getApplicationConfigurationManager().getApplicationsSortedByName(showSystem))
{
	if (applicationId == -1 || app.getId() == applicationId)
	{
%>
		<li>
			<a href="#app-<%=app.getName().toLowerCase()%>" ><%=app.getName()%></a>
			<ul class="nav subnav">
		<%	
		
		for (IProcessModel pm : app.getProcessModels())
		{
			IProcessModelVersion pmv = pm.getReleasedProcessModelVersion();
			if (pmv != null)
			{
			  	IIvyProject project = IvyProjectNavigationUtil.getIvyProject(pmv.getProject());
				IBpmEngine processEngine = ivyServer.getBpmEngineManager().getBpmEngine(pmv);
				boolean processEngineRunning = (processEngine.getServiceState()==ServiceState.RUNNING);
				
				%>
				<li>
					<a href="#pm-<%=app.getName().toLowerCase()%>-<%=pm.getName().toLowerCase()%>"><%=pm.getName()%></a>
				</li>
			<%
			}
	 	}
		%>
			</ul>
		</li>
	<%
	}
}
%>
		<li>
			<br>
			<a class="top-nav-item" href="#headerdiv">Back to top</a>
		</li>
		</ul>
	</div>
</div>
<script type="text/javascript">
	$('body').scrollspy({ target: '#sidebar' });
</script>