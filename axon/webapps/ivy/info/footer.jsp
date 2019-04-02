<%@ page import="java.util.Date"%>
<%@ page import="java.text.DateFormat"%>
<%@ page import="java.util.Locale"%>
<%@ page import="ch.ivyteam.ivy.Advisor"%>
<%
DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.MEDIUM, DateFormat.SHORT, Locale.GERMAN);
Date date = new Date();
String dateTime = dateFormat.format(date);
%>
<hr/>
<footer>
Powered by <a href="http://developer.axonivy.com"><%=ch.ivyteam.ivy.Advisor.getAdvisor().getApplicationName()%></a><%=ch.ivyteam.ivy.Advisor.getAdvisor().isReleaseCandidate() ? " RC-" : " " %><%=ch.ivyteam.ivy.Advisor.getAdvisor().getVersion()%>
Copyright
<%=ch.ivyteam.ivy.Advisor.getAdvisor().getCopyrightHtml()%>
<div class="pull-right">
  <%=dateTime%>
</div>
</footer>