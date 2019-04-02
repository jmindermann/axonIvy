<jsp:useBean id="ivyServer" class="ch.ivyteam.ivy.webserver.ServerLimited" scope="application"/>
<%@ page import="ch.ivyteam.ivy.cluster.restricted.IClusterNode"%>
<%@ page import="ch.ivyteam.ivy.cluster.restricted.ClusterNodeState"%>
<%@ page import="ch.ivyteam.ivy.cluster.restricted.ClusterNodeCommunicationState"%>
<%@ page import="java.text.DateFormat"%>
<div id="Caption">
	<h2>Cluster Nodes</h2>
</div>
<div id="Content">
<table class="table table-hover table-condensed">
<tr>
  <th align="left">Name&nbsp;</th>
  <th align="left">Host&nbsp;</th>
  <th align="left">State&nbsp;</th>
  <th align="left">Communication&nbsp;</th>
  <th align="left">Is Master&nbsp;</th>
  <th align="left">Is Local&nbsp;</th>
  <th align="left">Start Timestamp&nbsp;</th>  
  <th align="left">Stop Timestamp&nbsp;</th>
  <th align="left">Fail Timestamp&nbsp;</th>
</tr>
<%
for (IClusterNode node : ivyServer.getClusterManager().getClusterNodes())
{
	%>
	<tr>
	  <td><a href="index.jsp?pageId=clusternode_panel&clusterNodeId=<%=node.getId()%>"><%=node.getName()%></a></td>
	  <td><%=node.getHostName()%></td>	  	  	 
	  <td><span style="color: <%=node.getState()==ClusterNodeState.DOWN?"red": (node.getState()==ClusterNodeState.RUNNING ? "green" : "orange")%>"><%=node.getState()%></span></td>
	  <td><span style="color: <%=node.getCommunicationState()==ClusterNodeCommunicationState.DOWN?"red": (node.getCommunicationState()==ClusterNodeCommunicationState.UP ? "green" : "orange")%>"><%=node.getCommunicationState()%></span></td>
	  <td><%=node.isMaster()?"yes":"no"%></td>
	  <td><%=node.isLocal()?"yes":"no"%></td>
	  <td><%=node.getLastStartTimestamp()==null?"-":DateFormat.getDateTimeInstance(DateFormat.SHORT, DateFormat.SHORT).format(node.getLastStartTimestamp())%></td>
	  <td><%=node.getLastStopTimestamp()==null?"-":DateFormat.getDateTimeInstance(DateFormat.SHORT, DateFormat.SHORT).format(node.getLastStopTimestamp())%></td>
	  <td><%=node.getLastFailTimestamp()==null?"-":DateFormat.getDateTimeInstance(DateFormat.SHORT, DateFormat.SHORT).format(node.getLastFailTimestamp())%></td>	  
	</tr>
	<%
}
%>
</table>
</div>        
