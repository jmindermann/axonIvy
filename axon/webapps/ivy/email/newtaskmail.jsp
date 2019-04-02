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
<jsp:useBean id="ivyServer" class="ch.ivyteam.ivy.webserver.ServerLimited" scope="application"/>
<jsp:useBean id="cms" class="ch.ivyteam.ivy.webserver.IvyCommonsCmsAccessorBean" scope="request"/>
<% 
	String baseUri = request.getContextPath()+"/";		
		
	IApplication app = (IApplication) request.getAttribute("ch.ivyteam.ivy.ivymailservlet.application");	
	IUser user = (IUser) request.getAttribute("ch.ivyteam.ivy.ivymailservlet.user");
	long taskId = ((Long)request.getAttribute("ch.ivyteam.ivy.ivymailservlet.task")).longValue();
	IWorkflowContext wfContext = WorkflowNavigationUtil.getWorkflowContext(app);
	
	if (app == null || user == null || taskId <= 0)
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
	ITask task = wfContext.findTask(taskId);	
%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
       "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta http-equiv="content-type" content="text/html; charset=utf-8">
	<title><%=cms.co("/EMailNotification/NewTask/Title")%></title>
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
					<td><span style="color:#6B6B6B;"><%=cms.co( "/EMailNotification/NewTask/Title")%></span></td>
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
						<p><%=cms.co( "/EMailNotification/NewTask/Description")%></p>
<%  	
	int taskStateId = task.getState().intValue();	
	String taskStateName = cms.co( "/EMailNotification/Common/TaskStates/" + taskStateId);
	int taskPriorityId = task.getPriority().intValue();
	String taskPriorityName = cms.co( "/EMailNotification/Common/TaskPriorities/" + taskPriorityId);
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
						<table class="resulttable" width="100%" cellspacing="1" cellpadding="0" border="0">
							<tr>
								<th align="left" width="150" ><%=cms.co( "/EMailNotification/Common/TaskName")%></th>
								<td><%=taskName%></td>
							</tr>
							<tr>
								<th align="left" width="150" ><%=cms.co( "/EMailNotification/Common/TaskDescription")%></th>
								<td><%=taskDescription%></td>
							</tr>							
							<tr>
								<th align="left" width="150" ><%=cms.co( "/EMailNotification/Common/TaskActivator")%></th>
								<td><%=HtmlSnippets.createIconLabelTable(taskActivatorIsUser ? baseUri + "images/user.gif" : baseUri + "images/role.gif", "", taskActivatorName, null) %></td>
							</tr>							
							<tr>
								<th align="left" width="150" ><%=cms.co( "/EMailNotification/Common/TaskPriority")%></th>
								<td><%=HtmlSnippets.createIconLabelTable(baseUri + "images/priority/" + taskPriorityId + ".gif", "", taskPriorityName, null) %></td>
							</tr>
							<tr>
								<th align="left" width="150" ><%=cms.co( "/EMailNotification/Common/TaskState")%></th>
								<td><%=HtmlSnippets.createIconLabelTable(baseUri + "images/state/" + taskStateId + ".gif", "", taskStateName, null) %></td>
							</tr>								
							<tr>								
								<th align="left" width="150" ><%=cms.co( "/EMailNotification/Common/TaskCreatedDate")%></th>
								<td><%=taskStartDate%></td>
							</tr>
							<tr>								
								<th align="left" width="150"><%=cms.co( "/EMailNotification/Common/TaskExpiryDate")%></th>
								<td><%=taskExpiryDate%></td>
							</tr>
							<tr>								
								<th align="left" width="150"><%=cms.co( "/EMailNotification/Common/StartTaskShort")%></th>
								<td><%=HtmlSnippets.createIconLabelTable(baseUri + "images/start.gif", "", cms.co( "/EMailNotification/Common/StartTask"), taskStartUri) %></td>
							</tr>														
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
					<td style="font-size:8pt; color:#6B6B6B"><%=cms.co( "/EMailNotification/Common/Footer")%></td>
				</tr>
			</table>		
		</td>
	</tr>
</table>

</body>
</html>