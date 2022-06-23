<%
	String session_username = (String)session.getAttribute("username");
	
%>


<% if(session_username != null){ %>
<div>
	<div style="float: left">
		<a href="${pageContext.request.contextPath}/add">Add</a> 
		<a href="${pageContext.request.contextPath}/listing">List</a>
	</div>
<%} %>

	<div style="float: right">
	<%if(session_username == null) {%>
	
		<a href="${pageContext.request.contextPath}/login" style="font-size: 20px">Login</a>
	<%} %>
	
	<% if(session_username != null){ %>
			Welcome <%= session.getAttribute("username") %> |
			<a href="${pageContext.request.contextPath}/logout">Logout</a>
	<%} %>
	</div>
</div>
<br>
<br>

<center>
	<header style="background-color: gray; color: white; height: 50px" >
		<h1>Students CRUD App</h1>
	</header>
</center>