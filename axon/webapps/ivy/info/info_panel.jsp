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
<%@ page import="ch.ivyteam.ivy.casemap.runtime.model.ICaseMap"%>
<%@ page import="ch.ivyteam.ivy.casemap.runtime.repo.restricted.ICaseMapRepository"%>
<%@ page import="ch.ivyteam.ivy.casemap.runtime.CaseMapWebLinkFactory"%>
<%@ page import="ch.ivyteam.ivy.request.RequestUriFactory"%>
<%@ page import="ch.ivyteam.ivy.bpm.engine.restricted.IBpmEngine" %>
<%@ page import="ch.ivyteam.ivy.service.IService"%>
<%@ page import="ch.ivyteam.ivy.service.ServiceState"%>
<%@ page import="ch.ivyteam.ivy.webserver.workflow.jsp.JspCaseMapHelper"%>
<%@ page import="java.util.Iterator"%>
<%@ page import="java.util.Set"%>
<%@ page import="java.util.List"%>
<jsp:useBean id="ivyServer" class="ch.ivyteam.ivy.webserver.ServerLimited" scope="application"/>
<div id="panel" class="row row-offcanvas row-offcanvas-right">

<div class="col-xs-9 col-sm-9">
<div id="Caption">
	<h2>Applications</h2>
</div>
<div id="Content" >
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
<%

for (IApplication app : ivyServer.getApplicationConfigurationManager().getApplicationsSortedByName(showSystem))
{
	if (applicationId == -1 || app.getId() == applicationId)
	{
%>
	  <h3><a href="../wf/<%=app.getName()%>/" id="app-<%=app.getName().toLowerCase()%>"><%=app.getName()%></a></h3>
<%		
		for (IProcessModel pm : app.getProcessModels())
		{
			IProcessModelVersion pmv = pm.getReleasedProcessModelVersion();
			if (pmv != null)
			{
				IIvyProject project = IvyProjectNavigationUtil.getIvyProject(pmv.getProject());
				IService pmvService = (IService)project.getProcessModelVersion().getAdapter(IService.class);
			  	IBpmEngine bpmEngine = ivyServer.getBpmEngineManager().getBpmEngine(pmv);
			  	IService modelService = bpmEngine.getModelService();
			  	IService webserviceStartEventEngine = ivyServer.getProcessStartWSBeanEngineManager().getWebServiceProcessBeanEngine(pmv);
			  	boolean processEngineRunning = 
			  	        pmvService.getServiceState()==ServiceState.RUNNING &&
			  	        bpmEngine.getServiceState()==ServiceState.RUNNING &&
			  	        modelService.getServiceState()==ServiceState.RUNNING &&
			  	        webserviceStartEventEngine.getServiceState()==ServiceState.RUNNING;
				%>
				<h4 id="pm-<%=app.getName().toLowerCase()%>-<%=pm.getName().toLowerCase()%>"><%=pm.getName()%></h4>
				<table class="startTable">
					<tr>
						<td>Version:</td>
						<td class="WithIcon16 IconAbout"><%=pmv.getVersionName()%></td>
					</tr>
					<tr>
						<td nowrap>Process Engine:</td>
						<td class="WithIcon16 <%=processEngineRunning ? "IconGearOk" : "IconGearStop"%>">
							<%=processEngineRunning ? "Running" : "Not running"%>
						</td>
					</tr>

					
					<%
					List<ICaseMap> caseMaps = ICaseMapRepository.getInstance().allOf(project.getWorkflowProcessModelVersion());
					if (!caseMaps.isEmpty()) {
					%>
					<tr>
						<td nowrap>Case Map Starts:</td>
						<td>
							<table>
							<%
							for (ICaseMap caseMap : JspCaseMapHelper.sortByFullyQualifiedName(caseMaps))
							{
								String link = CaseMapWebLinkFactory.createCaseMapStartLink(caseMap, request).getRelativeEncoded();
								String icon = processEngineRunning ? "../images/run.gif" : "../images/runStop.gif";
								%>
								<tr>
									<td style="padding-right:4px"><a href="<%= link %>"><img src="<%= icon %>" width="16" height="16" alt="Start Case Map" border="0" /></a></td>
									<td>
										<a href="<%= link %>" title="Click to start the case map">
											<%= caseMap.getFilename().getFullyQualifiedNameWithExtension() %>
										</a>
									</td>
								</tr>
								<%
							}
							%>
							</table>
						</td>
					</tr>
					<% } %>
                    
                    <tr>
                        <td nowrap>Process Starts:</td>
                        <td>
                            <table class="prozessStartTable">
                            <%
                            for (IStartElement startElement : project.getWorkflowProcessModelVersion().getStartElements())
                            {
                                if (startElement.isVisible() && 
                                        (startElement.getActivator() == null || (startElement.getActivator().getMemberName().equals(ISecurityConstants.TOP_LEVEL_ROLE_NAME) && !startElement.getActivator().isUser())))
                                {
                                
                                    String displayName = startElement.getName() != null && startElement.getName().trim().length() > 0 ? startElement.getName() : startElement.getUserFriendlyRequestPath();
                                    String link = "<a href=\"" + RequestUriFactory.createRequestUri(request, startElement).toASCIIString() + "\">";
                                    String icon = processEngineRunning ? "../images/run.gif" : "../images/runStop.gif";
                                %>
                                    <tr>
                                        <td style="padding-right:4px"><%=link%><img src="<%=icon%>" width="16" height="16" alt="Run Process" border="0" /></a></td>
                                        <td><%=link%><%=displayName%></a></td>
                                        <td><%=startElement.getDescription()%></td>
                                    </tr>
                                <%
                                }
                            }
                            %>
                            </table>
                        </td>
                    </tr>
                    
                    <%
                    Set<IWebServiceProcess> wsProcesses = project.getWorkflowProcessModelVersion().getWebServiceProcesses();
                    if (wsProcesses.size() > 0)
                    {
                    %>               
                    <tr>
                        <td nowrap>Web Services:</td>
                        <td>
                            <table>
                            <%
                                for (IWebServiceProcess wsProcess : wsProcesses)
                                {
                                    String link = RequestUriFactory.createWebServiceUri(request, wsProcess).toASCIIString() + "?WSDL";
                                    String processName = "";
                                    String linkTitle = "";
                                    if (wsProcess.getWebServiceProcessStartElements().size() > 0)
                                    {
                                      	IWebServiceProcessStartElement startElement = wsProcess.getWebServiceProcessStartElements().iterator().next();
                                        processName = startElement.getUserFriendlyRequestPath();
                                        processName = processName.substring(0, processName.indexOf(startElement.getProcessElementId()) -1);
                                    }
                                    else
                                    {
                                        processName = wsProcess.getProcessIdentifier();
                                    }
                                    String icon = processEngineRunning ? "../images/document_view.gif" : "../images/document_view_stop.gif";
                                %>
                                    <tr>
                                        <td><a href="<%=link%>"><img src="<%=icon%>" width="16" height="16" alt="View WSDL" border="0" /></a></td>
                                        <td><a href="<%=link%>"><%=processName%>?WSDL</a></td>
                                        <td><%=wsProcess.getName() %></td>
                                    </tr>
                                <%
                                }
                            %>
                            </table>
                        </td>
                    </tr>
                    <%
                    }
                    %>
				</table>
			<%
			}
	 	} 
	}
}	
%>
</div>

</div>
<jsp:include page="info_nav_panel.jsp" flush="true"/>

</div>