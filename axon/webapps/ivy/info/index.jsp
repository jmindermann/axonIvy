<%@ page import="ch.ivyteam.ivy.Advisor"%>
<%@ page import="ch.ivyteam.util.Version"%>
<%@ page import="ch.ivyteam.ivy.request.RequestUriFactory"%>
<jsp:useBean id="ivyServer" class="ch.ivyteam.ivy.webserver.ServerLimited" scope="application"/>
<!DOCTYPE html>
<html>
<head>
  <meta http-equiv="X-UA-Compatible" content="IE=edge">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <title><%=Advisor.getAdvisor().getApplicationName()%> <%=Advisor.getAdvisor().getVersion().getVersionString(Version.DETAIL_PATCH,Version.FORM_SHORT)%></title>

  <link rel="shortcut icon" href="../shared/images/ivy_favicon_48.png" />

  <!-- Bootstrap -->
  <link href="../shared/css/bootstrap.min.css" rel="stylesheet">
  <link href="../shared/css/ivy-common-6.css" rel="stylesheet">
  <link href="../shared/css/docs.custom.css" rel="stylesheet">
  
  <link href="../shared/css/style.css" rel="stylesheet">
  
  <script src="../shared/js/jquery.min.js"></script>
  <script src="../shared/js/bootstrap.min.js"></script>

  <!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->
  <!--[if lt IE 9]>
    <script src="https://oss.maxcdn.com/html5shiv/3.7.2/html5shiv.js"></script>
    <script src="https://oss.maxcdn.com/respond/1.4.2/respond.js"></script>
  <![endif]-->	
	<%
	String pageId = (String) request.getParameter("pageId");
	if (pageId == null)
	{
		pageId = "info_panel";
	}
	
	boolean redirectToLogin = false;
	
	// set redirectToLogin = true if license page is requested and admin is not logged in.
	if (pageId.equals("license")) 
	{
		ch.ivyteam.ivy.security.ISession systemSession = ivyServer.getApplicationConfigurationManager().getSystemApplication().getSecurityContext().getSessionFor(request); 
		//System administrators are the only users in the system application, no futher checks necessary
		if (systemSession == null || systemSession.isSessionUserUnknown())
		{
		  redirectToLogin = true;
		}
	}
	
	if (redirectToLogin) 
	{
		String redirectUrl = RequestUriFactory.createRedirectToWfLoginUri(request).toASCIIString();
	%>
		<meta http-equiv="refresh" content="0; URL=<%=redirectUrl %>" /></head></html>
	<%
		return;
	}

	java.util.Set<String> validPageIds = new java.util.HashSet<>();
	validPageIds.add("admin_panel");
	validPageIds.add("cluster_panel");
	validPageIds.add("clusternode_panel");
	validPageIds.add("info_nav_panel");
	validPageIds.add("info_panel");
	validPageIds.add("license_messages");
	validPageIds.add("license");
	validPageIds.add("licenseViolationLegend");
	validPageIds.add("time_out");
	validPageIds.add("update_messages");
	if (!validPageIds.contains(pageId))
	{	  
	  response.sendError(404);
	  return;
	}
	%>
</head>
<body>
  <jsp:include page="header.jsp" flush="true"/>	
  <div class="container">
    <jsp:include page="license_messages.jsp" flush="true"/> 
    <jsp:include page="<%=pageId + \".jsp\"%>" flush="true"/>
    <jsp:include page="footer.jsp" flush="true"/>
  </div>
</body>
</html>