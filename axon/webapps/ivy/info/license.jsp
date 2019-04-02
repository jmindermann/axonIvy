<%@ page import="java.util.*"%>
<%@ page import="java.text.DateFormat"%>
<%@ page import="ch.ivyteam.licence.*"%>
<%
String confirm = request.getParameter("confirm");
String checked = request.getParameter("checked");
		
if (confirm != null && checked!=null) {
  LicenceEventManager.getInstance().confirmAll(request.getRemoteUser());
}

DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.SHORT, DateFormat.SHORT);

List<LicenceEvent> events = LicenceEventManager.getInstance().getUnconfirmedLicenceEvents();
%>
<div id="Caption">
	<h2>License Violations</h2>
</div>
<div id="Content">
	<p>The license is not sufficient. Below the unconfirmed violations are listed. Please contact your sales contact to upgrade your license.</p>
	<table class="table table-hover table-condensed">
		<tr bgcolor="#000032" style="color: white;">
			<th width="10%">Level</th>
			<th width="15%">Time</th>
			<th width="75%">Description</th>
				</tr>
	<%
	int i = 0;
	for (LicenceEvent event : events)
	  {
	%>							
			<tr>
				<td><%= event.getLevel() %></td>
				<td><%= dateFormat.format(event.getTimestamp()) %></td>
				<td><%= event.getMessage() %></td>
			</tr>
	<%
			i++;
		}
	%>	
	</table>
	<h4>Legend:</h4>
	<jsp:include page="licenseViolationLegend.jsp"/>
	<p/>
	<h4>Clear License Violation Messages</h4>
	<form method="post" >
	<table>
	<tr>
		<td valign="top"><input type="checkbox" name="checked" /></td>
		<td>&nbsp;I noticed the license violations and I am aware that this may lead to malfunctions such as the Engine does not start any more.</td>
	<tr>
	<tr>	
		<td colspan="2"><input type="submit" name="confirm" value="clear list" /><%= (checked==null && confirm!=null)?"<b>Please confirm having noticed the liecense violations</b>":"" %></td>
	</tr>
	</table>
	</form>
	<p/>
</div>
