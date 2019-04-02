<%@ page import="java.util.*"%>
<%@ page import="java.text.DateFormat"%>
<%@ page import="org.apache.commons.lang.StringEscapeUtils"%>
<%@ page import="ch.ivyteam.text.html.HtmlSnippets"%>
<%@ page import="ch.ivyteam.ivy.request.RequestUriFactory"%>
<%@ page import="ch.ivyteam.ivy.workflow.*"%>
<%@ page import="ch.ivyteam.ivy.security.*"%>
<%@ page import="ch.ivyteam.ivy.request.restricted.WorkflowServletConstants"%>
<% 
	DateFormat formatter = DateFormat.getDateTimeInstance(DateFormat.SHORT, DateFormat.SHORT, Locale.GERMAN); 
	List<ITask> tasks = (List<ITask>)request.getAttribute(WorkflowServletConstants.USER_TASKS_ATTR);
	int i = 0;
%>
<div id="Caption">
<h2>Task List</h2>
</div>
<div id="Content">
<table class="table table-hover table-condensed">
	<tr>
		<th width="16"><!-- Priority Icon--></th>
		<th width="16"><!-- State Icon--></th>
		<th width="55%">Name</th>
		<th width="15%">Responsible</th>
		<th width="15%">Created</th>
		<th width="15%">Expiry Date</th>
		<th width="16"><!-- State Icon--></th>
	</tr>
<%
  for (ITask task : tasks)
  {
	long taskId = task.getId();	
	int taskStateId = task.getState().intValue();	
	String taskStateName = task.getState().name();
	int taskPriorityId = task.getPriority().intValue();
	String taskPriorityName = task.getPriority().name();
	String taskName = StringEscapeUtils.escapeHtml(task.getName());
	String taskDescription = StringEscapeUtils.escapeHtml(task.getDescription() != null ? task.getDescription() : "");
	ISecurityMember taskActivator = task.getActivator();
	String taskActivatorName = ISecurityConstants.TOP_LEVEL_ROLE_NAME; 
	if (taskActivator != null)
	{
		if (taskActivator.isUser())
		{
			taskActivatorName = ((IUser)taskActivator).getName();
		}
		else
		{
			taskActivatorName = ((IRole)taskActivator).getName();
		}
	} 
	taskActivatorName = StringEscapeUtils.escapeHtml(taskActivatorName);
	
	boolean taskActivatorIsUser = task.getActivator() != null && task.getActivator().isUser();
	String taskStartDate = StringEscapeUtils.escapeHtml(task.getStartTimestamp() != null ? formatter.format(task.getStartTimestamp()) : "");
	String taskExpiryDate = StringEscapeUtils.escapeHtml(task.getExpiryTimestamp() != null ? formatter.format(task.getExpiryTimestamp()) : "");
	String taskStartUri = RequestUriFactory.createTaskStartUri(request, task).toASCIIString();
%>							
	<tr>
		<td><img src="../../images/priority/<%=taskPriorityId%>.gif" alt="<%=taskPriorityName%>" title="<%=taskPriorityName%>" /></td>
		<td><img src="../../images/state/<%=taskStateId%>.gif" alt="<%=taskStateName%>" title="<%=taskStateName%>"> </td>
		<td><%=taskName%></td>
		<td><%=HtmlSnippets.createIconLabelTable(taskActivatorIsUser ? "../../images/user.gif" : "../../images/role.gif", "", taskActivatorName, null) %></td>
		<td><%=taskStartDate%></td>
		<td><%=taskExpiryDate%></td>
		<td><a href="<%=taskStartUri%>"><img border="0" src="../../images/start.gif"></a></td>
	</tr>
							
							
<%
  }
%>	
</table>											
</div>