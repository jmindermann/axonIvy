<%@page import="ch.ivyteam.ivy.Advisor"%>

<%
String desc = request.getParameter("desc");
String description = desc == null ? "" : desc;
description = org.apache.commons.lang3.StringEscapeUtils.escapeHtml4(description);
%>

<head>
  <meta http-equiv="X-UA-Compatible" content="IE=edge">
  <meta name="viewport" content="width=device-width, initial-scale=1">

  <link rel="shortcut icon" href="../images/ivy_favicon_48.png" />
  <link href="../shared/css/bootstrap.min.css" rel="stylesheet">
  <link href="../shared/css/ivy-common-6.css" rel="stylesheet">
  <link href="../shared/css/style.css" rel="stylesheet">
</head>
<html>
<head>
	<title>Session Time Out</title>
<head>
<jsp:include page="header.jsp" flush="true"/>
<body>
<div class="container">
  <h3 style="color:red">The session has expired</h3>
  <i><%=description%></i>
  <jsp:include page="footer.jsp" flush="true"/>
</div>
</body>
</html>