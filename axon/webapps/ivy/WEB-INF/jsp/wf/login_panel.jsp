<%@ page
	import="ch.ivyteam.ivy.request.restricted.WorkflowServletConstants"%>
<%@ page import="org.apache.commons.lang3.StringEscapeUtils"%>

<div id="Caption">
	<h2>Login</h2>
</div>
<div id="Content">
	<%
		String originalUrl = (String) request.getAttribute(WorkflowServletConstants.ORIGINAL_URL_ATTR);
		String oldUsername = request.getParameter(WorkflowServletConstants.USERNAME_ATTR);
		if (oldUsername == null) oldUsername = "";
		boolean loginFailed = oldUsername.length() > 0;
		if(loginFailed){ 
	%>
	<div class="alert alert-danger" role="alert">Incorrect user name or password!</div>
	<%} %>
	<p>Enter your user name and password to authenticate yourself</p>
	<form method="post" action="<%=WorkflowServletConstants.loginCommandRef(originalUrl)%>">
		<table class="loginFormTable">
			<tr>
				<td class="formRequired">User name</td>
				<td><input type="text" name="username"
					value="<%=StringEscapeUtils.escapeHtml4(oldUsername)%>" /></td>
			</tr>
			<tr>
				<td class="formRequired">Password</td>
				<td><input type="password" name="password" value="" /></td>
			</tr>
			<tr>
				<td>&nbsp;</td>
				<td><input type="submit" value="Login" /></td>
			</tr>
		</table>
	</form>
</div>