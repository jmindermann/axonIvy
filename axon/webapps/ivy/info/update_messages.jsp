<%@ page import="ch.ivyteam.ivy.update.restricted.IUpdateManager"%>
<%@ page import="ch.ivyteam.ivy.update.restricted.Release"%>
<%@ page import="ch.ivyteam.di.restricted.*"%>
<%@ page import="ch.ivyteam.util.Version"%>
<%
IUpdateManager updateManager = DiCore.getGlobalInjector().getInstance(IUpdateManager.class);
boolean newerServiceReleaseAvailable = updateManager.isNewerServiceReleaseAvailable();
boolean newerReleaseAvailable = updateManager.isNewerReleaseAvailable();
if (newerServiceReleaseAvailable || newerReleaseAvailable)
{
%>
<div class="alert alert-warning affix-top" role="alert">
<%
if (newerServiceReleaseAvailable)
{
  Release release = updateManager.getLatestServiceReleaseForCurrentRelease();
%>
    <p>New service release <%=release.getDisplayVersion()%> available. 
    Download it from our <a href="<%=release.getDownloadUri()%>">download site</a></p>
<%
}

if (newerReleaseAvailable)
{
  Release release = updateManager.getLatestRelease();
%>
    <p>New release <%=release.getDisplayVersion()%> available. 
    Download it from our <a href="<%=release.getDownloadUri()%>">download site</a></p>
<%
}
%>
</div> 
<%
}
%>