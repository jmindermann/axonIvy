<%@ page import="java.util.*"%>
<%@ page import="ch.ivyteam.ivy.workflow.IProcessStart"%>
<%@ page import="ch.ivyteam.ivy.request.restricted.WorkflowServletConstants"%>
<div id="Caption"><h2>Process List</h2></div>
<div id="Content">
<table class="table table-hover table-condensed">
	<tr>
		<th>Identifier</th>
		<th>Name</th>
		<th>Description</th>
	</tr>
<%
List<IProcessStart> processStarts = (List<IProcessStart>)request.getAttribute(WorkflowServletConstants.PROCESS_STARTS_ATTR);
for (IProcessStart processStart:processStarts) {
  String startLink = ch.ivyteam.ivy.request.RequestUriFactory.createRequestUri(request, processStart).toASCIIString();
%>
	<tr>
		<td>
		<a href="<%= startLink %>" >
				<img src="../../images/start.gif" width="16" height="16" alt="Run Process" border="0">
				<%= processStart.getFullUserFriendlyRequestPath() %>
			</a>
		</td>
		<td><%= processStart.getName() %></td>
		<td><%= processStart.getDescription() %></td>
	</tr>
<% 
}
%>
</table>	
</div>
