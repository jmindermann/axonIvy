<%@ page import="ch.ivyteam.licence.*"%>
<%@ page import="ch.ivyteam.ivy.update.restricted.IUpdateManager"%>
<%@ page import="ch.ivyteam.ivy.update.restricted.Release"%>
<%@ page import="ch.ivyteam.di.restricted.*"%>
<%@ page import="ch.ivyteam.util.Version"%>
<%@ page import="ch.ivyteam.ivy.request.restricted.WorkflowServletConstants"%>
<%@ page import="ch.ivyteam.ivy.Advisor"%>
<jsp:useBean id="ivyServer" class="ch.ivyteam.ivy.webserver.ServerLimited" scope="application"/>
<jsp:useBean id="ivySession" type="ch.ivyteam.ivy.security.ISession" scope="request"/>
<div class="navbar navbar-top <%=Advisor.getAdvisor().isReleaseCandidate() ? "navbar-rc" : ""%>" role="navigation">
  <div class="container" id="headerdiv">
    <div class="navbar-header">
      <a class="ivy-logo" href="../../info/index.jsp">
        <img src="../../shared/images/axon_ivy_logo.png" alt="Axon.ivy" />
      </a>
    </div>
    <p class="navbar-text navbar-right pull-right">
<%
if(ivySession.getSessionUser() != null)
{
%>
      Logged in as <%= ivySession.getSessionUserName() %> |
      <a href="<%= WorkflowServletConstants.LOGOUT_REF %>" class="navbar-link">Logout</a>
<%
}
%>
    </p>
  </div>
</div>

<%
String pageId = (String) request.getParameter("pageId");
if (pageId == null)
{
  pageId = WorkflowServletConstants.APPLICATION_HOME_REF;
}
%>
<div class="navbar ivy-subnav">
  <div class="navbar-inner">
    <div class="container">
      <div class="row">
        <ul class="nav nav-pills">
			    <li class="<%=pageId.equals(WorkflowServletConstants.APPLICATION_HOME_REF) ? "active" : ""%>"><a href="<%= WorkflowServletConstants.APPLICATION_HOME_REF %>">Home</a></li>
			    <li class="<%=pageId.equals(WorkflowServletConstants.TASK_LIST_REF) ? "active" : ""%>"><a href="<%= WorkflowServletConstants.TASK_LIST_REF %>">Task List</a></li>
          <li class="<%=pageId.equals(WorkflowServletConstants.PROCESS_START_LIST_REF) ? "active" : ""%>"><a href="<%= WorkflowServletConstants.PROCESS_START_LIST_REF %>">Process List</a></li>
<%
if(ivySession.getSessionUser() == null)
{
%>
          <li class="<%=pageId.equals(WorkflowServletConstants.LOGIN_REF) ? "active" : ""%>"><a href="<%= WorkflowServletConstants.LOGIN_REF %>">Login</a></li>
<%
}
%>
        </ul>
      </div>
    </div>
  </div>
</div>
