<%@ page import="ch.ivyteam.ivy.cluster.restricted.IClusterNode"%>
<%@ page import="ch.ivyteam.ivy.cluster.restricted.ClusterNodeState"%>
<%@ page import="ch.ivyteam.ivy.cluster.restricted.ClusterNodeCommunicationState"%>
<%@ page import="java.text.DateFormat"%>
<jsp:useBean id="ivyServer" class="ch.ivyteam.ivy.webserver.ServerLimited" scope="application"/>
<%
IClusterNode clusterNode = null;
IClusterNode masterNode = null;
String clusterNodeId;

clusterNodeId = request.getParameter("clusterNodeId");
if (clusterNodeId != null)
{
	try
	{
		clusterNode = ivyServer.getClusterManager().findClusterNode(Long.parseLong(clusterNodeId));
	}
	catch(NumberFormatException ex)
	{
	}
}
if (clusterNode != null)
{
  masterNode = clusterNode.getMasterClusterNode();
%>
<div id="Caption">
	<h2>Cluster Node Detail <%=clusterNode.getName()%></h2>
</div>
<div id="Content">
<table class="table table-condensed">
<tr>
  <th width="15%">Name</th>
  <td><%=clusterNode.getName()%></td>
</tr>
<tr>
  <th>Host</th>
  <td><%=clusterNode.getHostName()%></td>
</tr>
<tr>
  <th>IP Address</th>
  <td><%=clusterNode.getIpAddress()%></td>
</tr>
<tr>
  <th>IP Port</th>
  <td><%=clusterNode.getIpPort()%></td>
</tr>
<tr>
  <th>Local Identifier</th>
  <td><%=clusterNode.getLocalIdentifier()%></td>
</tr>
<tr>
  <th>Jvm Route</th>
  <td><%=clusterNode.getJvmRouteName()%></td>
</tr>
<tr> 
  <th>State</th>
  <td><span style="color: <%=clusterNode.getState()==ClusterNodeState.DOWN?"red": (clusterNode.getState()==ClusterNodeState.RUNNING ? "green" : "orange")%>"><%=clusterNode.getState()%></span></td>
</tr>
<tr>  
  <th>Communication</th>
  <td><span style="color: <%=clusterNode.getCommunicationState()==ClusterNodeCommunicationState.DOWN?"red": (clusterNode.getCommunicationState()==ClusterNodeCommunicationState.UP ? "green" : "orange")%>"><%=clusterNode.getCommunicationState()%></span></td>
</tr>
<tr>  
  <th>Communication Address</th>
  <td><%=clusterNode.getCommunicationAddress()==null?"-":clusterNode.getCommunicationAddress()%></span></td>
</tr>
<tr>  
  <th>Is Master</th>
  <td><%=clusterNode.isMaster()?"yes":"no"%></td>
</tr>
<tr>  
  <th>Master Cluster Node</th>
  <td>
<%
  if (masterNode == null)
  {
%>-<%
  }
  else
  {
%>  
		<a href="index.jsp?pageId=clusternode_panel&clusterNodeId=<%=masterNode.getId()%>"><%=masterNode.getName()%></a></td>
<%
  }
%>
</tr>
<tr>  
  <th>Is Local</th>
  <td><%=clusterNode.isLocal()?"yes":"no"%></td>
</tr>
<tr>  
  <th>Last Start Timestamp</th>  
  <td><%=clusterNode.getLastStartTimestamp()==null?"-":DateFormat.getDateTimeInstance(DateFormat.SHORT, DateFormat.SHORT).format(clusterNode.getLastStartTimestamp())%></td>
</tr>
<tr>  
  <th>Last Stop Timestamp</th>
  <td><%=clusterNode.getLastStopTimestamp()==null?"-":DateFormat.getDateTimeInstance(DateFormat.SHORT, DateFormat.SHORT).format(clusterNode.getLastStopTimestamp())%></td>
</tr>
<tr>  
  <th>Last Fail Timestamp</th>
  <td><%=clusterNode.getLastFailTimestamp()==null?"-":DateFormat.getDateTimeInstance(DateFormat.SHORT, DateFormat.SHORT).format(clusterNode.getLastFailTimestamp())%></td>	  
</tr>
<tr>  
  <th>Axon.ivy Version</th>
  <td><%=clusterNode.getIvyVersion()%></td>	  
</tr>
<tr>  
  <th>Operating System Name</th>
  <td><%=clusterNode.getOperatingSystemName()%></td>	  
</tr>
<tr>  
  <th>Operating System Version</th>
  <td><%=clusterNode.getOperatingSystemVersion()%></td>	  
</tr>
<tr>  
  <th>Operating System Architecture</th>
  <td><%=clusterNode.getOperatingSystemArchitecture()%></td>	  
</tr>
<tr>  
  <th>Java Version</th>
  <td><%=clusterNode.getJavaVersion()%></td>	  
</tr>
<tr>  
  <th>Java Virtual Machine Name</th>
  <td><%=clusterNode.getJavaVirtualMachineName()%></td>	  
</tr>
</table>
</div>
<%
}
else
{
%>
<div id="Caption">
	<h2>Cluster Node not found</h2>
</div>
<%
}
%>        
