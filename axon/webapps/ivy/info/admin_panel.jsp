<%@ page import="ch.ivyteam.ivy.Advisor"%>
<jsp:useBean id="ivyServer" class="ch.ivyteam.ivy.webserver.ServerLimited" scope="application"/>

<script type="text/javascript" >
function runAdmininstration()
{
    document.location.href = "../pro/System/Administration/115D746C75FAF428/start1.ivp";
}

window.onload=runAdmininstration;
</script>
<jsp:include page="update_messages.jsp" flush="true"/>
<div id="Caption">
	<h2>Administration</h2>
</div>
<div id="Content">
	<div id="Wait">
Please wait while starting the <%=Advisor.getAdvisor().getApplicationName() %> Administration application ... 
	</div>
	<h3>Troubleshooting</h3>
	If the Administration application does not start on your client machine follow the steps below:
	<ol>
		<li>Your web browser should download automatically a *.jnlp file. If it does not press <a href="../pro/System/Administration/115D746C75FAF428/start1.ivp">here</a>!</li>
		<li>Your web browser should automatically open the downloaded *.jnlp file with the java web start application. <br/>You can notice that the java web start application is starting by an appearing java splash screen.<br/>If java web start is not started press <a href="http://www.java.com" target="_blank">here</a> to install the latest java runtime environment!</li>
	</ol>
</div>        
