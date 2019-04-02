<%@ page import="java.util.*"%>
<%@ page import="java.text.DateFormat"%>
<%@ page import="ch.ivyteam.licence.*"%>

<% 
String baseUri = request.getContextPath()+"/";

//init	
List<LicenceEvent> events = LicenceEventManager.getInstance().getUnsentLicenceEvents();
DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.SHORT, DateFormat.SHORT);
%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
       "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta http-equiv="content-type" content="text/html; charset=utf-8">
	<title>License Violations</title>
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
					<td><span style="color:#6B6B6B;">License Violations</span></td>
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
						<p>The license used on Engine <%= SignedLicence.getParam(LicenceConstants.PARAM_HOST_NAME) %> is not sufficient. Following the unconfirmed violations are listed. Please contact your sales contact to upgrade your license.
						</p>
						<p><b>License Violations:</b></p>
						<table class="resulttable" width="100%" cellspacing="0" cellpadding="1" border="1" bordercolor="white">
							<tr bgcolor="#E8E8E8" style="color:#6B6B6B;">
								<th width="16">Level</th>
								<th width="16">Time</th>
								<th width="16">Description</th>
							</tr>
<%
int i = 0;
for (LicenceEvent event : events)
  {
%>							
							<tr <%=(i%2 == 1 ? "bgcolor=\"#E8E8E8\"" : "")%>>
								<td><%= event.getLevel() %></td>
								<td><%= dateFormat.format(event.getTimestamp()) %></td>
								<td><%= event.getMessage() %></td>
							</tr>
							
							
<%
							i++;
	}
%>	
						</table>
						<p>Clear the license violation list on the <a href="<%= baseUri + "info/index.jsp?pageId=license" %>"> Engine</a>
						<p><b>Legend:</b></p>
						<jsp:include page="../info/licenseViolationLegend.jsp" />
						<p></p>
					</td>
				</tr>
			</table>
		
		</td>
	</tr>

	<tr><td>
		<jsp:include page="../info/footer.jsp" flush="true"/>
		</td>
	</tr>
</table>
</body>
</html>