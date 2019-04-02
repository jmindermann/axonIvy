<%@ page import="java.util.*"%>
<%@ page import="java.text.DateFormat"%>
<%@ page import="org.apache.commons.lang.StringEscapeUtils"%>

<%@ page import="ch.ivyteam.text.html.HtmlSnippets"%>
<%@ page import="ch.ivyteam.ivy.application.*"%>
<%@ page import="ch.ivyteam.ivy.process.engine.*"%>
<%@ page import="ch.ivyteam.ivy.project.IIvyProject"%>
<%@ page import="ch.ivyteam.ivy.request.RequestUriFactory"%>
<%@ page import="ch.ivyteam.ivy.security.*"%>
<%@ page import="ch.ivyteam.ivy.webserver.IServerLimited"%>
<%@ page import="ch.ivyteam.ivy.workflow.*"%>
<%@ page import="ch.ivyteam.ivy.cm.*"%>
<%@ page import="ch.ivyteam.logicalexpression.RelationalOperator"%>
<jsp:useBean id="cms" class="ch.ivyteam.ivy.webserver.IvyCommonsCmsAccessorBean" scope="request"/>
<% 
	String baseUri = request.getContextPath()+"/";	
			
	IApplication app = (IApplication) request.getAttribute("ch.ivyteam.ivy.ivymailservlet.application");	
	IUser user = (IUser) request.getAttribute("ch.ivyteam.ivy.ivymailservlet.user");
	IWorkflowContext wfContext = WorkflowNavigationUtil.getWorkflowContext(app);
	
	if (app == null || user == null)
	{
		out.write("Invalid arguments! Do not call this JSP directly!");
		return;
	}
	
	Locale userLocale = user.getEMailLanguage();
	if (userLocale == null)
	{
		// Use application default if no specific locale was set on user
		userLocale = app.getDefaultEMailLanguage();
	}	
	DateFormat formatter = DateFormat.getDateTimeInstance(DateFormat.SHORT, DateFormat.SHORT, userLocale); 
	
	// TODO Maybe only show first 100 tasks!
	List<ITask> tasks = wfContext.findWorkTasks(user, 0, -1).getResultList();
	int i = 0;
%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
       "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta http-equiv="content-type" content="text/html; charset=utf-8">
	<title><%=cms.co("/EMailNotification/DailySummary/Title")%></title>
	<style type="text/css">
		<jsp:include page="mailstyle.css"/>
	</style>
</head>
<body>
<!-- Use of really ugly old HTML and table-layouts is intended since Microsoft Outlook 2007 doesn't support any modern web standard! -->
<table width="100%" border="0" cellspacing="0" cellpadding="0">
	
	<tr id="Header">
		<td><a href="http://www.axonivy.com">
			<img src="<%=baseUri%>images/header_ivy.png" alt="ivy Logo" height="50" border="0" /></a>
		</td>
	</tr>

	<tr>
		<td>&nbsp;</td>
	</tr>
	
	<tr bgcolor="#E8E8E8">
		<!-- Title bar-->
		<td>
			<table cellspacing="0" cellpadding="5">
				<tr>
					<td><span style="color:#6B6B6B;"><%=cms.co("/EMailNotification/DailySummary/Title")%></span></td>
				</tr>
			</table>
		
		</td>
	</tr>
	
	<tr>
		<!-- Content -->
		<td>
			<table cellspacing="0" cellpadding="5" width="100%">
				<tr>
					<td>
						<p><%=cms.co("/EMailNotification/DailySummary/Description")%></p>
				
						<table class="resulttable" width="100%" cellspacing="0" cellpadding="1" border="1" bordercolor="white">
							<tr bgcolor="#E8E8E8" style="color:#6B6B6B;">
								<th width="16"><!-- Priority Icon--></th>
								<th width="16"><!-- State Icon--></th>
								<th width="55%"><%=cms.co("/EMailNotification/Common/TaskName")%></th>
								<th width="15%"><%=cms.co("/EMailNotification/Common/TaskActivator")%></th>
								<th width="15%"><%=cms.co("/EMailNotification/Common/TaskCreatedDate")%></th>
								<th width="15%"><%=cms.co("/EMailNotification/Common/TaskExpiryDate")%></th>
								<th width="16"><!-- State Icon--></th>
							</tr>
<%
  for (ITask task : tasks)
  {
	long taskId = task.getId();	
	int taskStateId = task.getState().intValue();	
	String taskStateName = cms.co("/EMailNotification/Common/TaskStates/" + taskStateId);
	int taskPriorityId = task.getPriority().intValue();
	String taskPriorityName = cms.co("/EMailNotification/Common/TaskPriorities/" + taskPriorityId);
	String taskName = StringEscapeUtils.escapeHtml(task.getName());
	String taskDescription = StringEscapeUtils.escapeHtml(task.getDescription() != null ? task.getDescription() : "");
	ISecurityMember taskActivator = task.getActivator();
	String taskActivatorName = ISecurityConstants.TOP_LEVEL_ROLE_NAME; 
	if (taskActivator != null)
	{
		taskActivatorName = taskActivator.getDisplayName();
	}
	taskActivatorName = StringEscapeUtils.escapeHtml(taskActivatorName);
	
	boolean taskActivatorIsUser = task.getActivator() != null && task.getActivator().isUser();
	String taskStartDate = StringEscapeUtils.escapeHtml(task.getStartTimestamp() != null ? formatter.format(task.getStartTimestamp()) : "");
	String taskExpiryDate = StringEscapeUtils.escapeHtml(task.getExpiryTimestamp() != null ? formatter.format(task.getExpiryTimestamp()) : "");
	String taskStartUri = RequestUriFactory.createTaskStartUri(request, task).toASCIIString();
%>							
							<tr <%=(i%2 == 1 ? "bgcolor=\"#E8E8E8\"" : "")%>>
								<td><img src="<%=baseUri%>images/priority/<%=taskPriorityId%>.gif" alt="<%=taskPriorityName%>" title="<%=taskPriorityName%>" /></td>
								<td><img src="<%=baseUri%>images/state/<%=taskStateId%>.gif" alt="<%=taskStateName%>" title="<%=taskStateName%>"> </td>
								<td><%=taskName%></td>
								<td><%=HtmlSnippets.createIconLabelTable(taskActivatorIsUser ? baseUri + "images/user.gif" : baseUri + "images/role.gif", "", taskActivatorName, null) %></td>
								<td><%=taskStartDate%></td>
								<td><%=taskExpiryDate%></td>
								<td><a href="<%=taskStartUri%>"><img border="0" src="<%=baseUri%>images/start.gif"></a></td>
							</tr>
							
							
<%
							i++;
	}
%>	
						</table>											
					</td>
				</tr>
			</table>
		
		</td>
	</tr>

	<tr>
		<!-- Footer-->
		<td>
			<table cellspacing="0" cellpadding="5">
				<tr>
					<td style="font-size:8pt; color:#6B6B6B"><%=cms.co("/EMailNotification/Common/Footer")%></td>
				</tr>
			</table>		
		</td>
	</tr>
</table>

</body>
</html>