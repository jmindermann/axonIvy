<jsp:useBean id="ivyApplication" type="ch.ivyteam.ivy.application.IApplication" scope="request"/>
<div id="Caption"><h2>Home</h2></div>
<div id="Content">
<p>This is the home of the application <%= ivyApplication.getName() %>.</p>
</div>

