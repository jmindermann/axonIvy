<%@ page import="ch.ivyteam.ivy.Advisor"%>
<%@ page import="ch.ivyteam.util.Version"%>
<%@ page import="ch.ivyteam.ivy.request.restricted.WorkflowServletConstants"%>
<jsp:useBean id="ivyApplication" type="ch.ivyteam.ivy.application.IApplication" scope="request"/>
<!DOCTYPE html>
<html>
<head>
  <meta http-equiv="X-UA-Compatible" content="IE=edge">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <title><%=Advisor.getAdvisor().getApplicationName()%> <%=Advisor.getAdvisor().getVersion().getVersionString(Version.DETAIL_PATCH,Version.FORM_SHORT)%></title>

  <link rel="shortcut icon" href="../../shared/images/ivy_favicon_48.png" />

  <!-- Bootstrap -->
  <link href="../../shared/css/bootstrap.min.css" rel="stylesheet">
  <link href="../../shared/css/ivy-common-6.css" rel="stylesheet">
  
  <link href="../../shared/css/style.css" rel="stylesheet">

  <!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->
  <!--[if lt IE 9]>
    <script src="https://oss.maxcdn.com/html5shiv/3.7.2/html5shiv.js"></script>
    <script src="https://oss.maxcdn.com/respond/1.4.2/respond.js"></script>
  <![endif]-->
</head>
<body>
<%
  String pageId = (String) request.getParameter("pageId");
  if (pageId == null)
  {
    pageId = WorkflowServletConstants.APPLICATION_HOME_REF;
  }
  String panelUri = pageId + "_panel.jsp";
%>

  <jsp:include page="header.jsp" flush="true"/> 
  <div class="container">
    <jsp:include page="<%=panelUri%>" flush="true"/>
    <jsp:include page="footer.jsp" flush="true"/>
  </div>
</body>
</html>
