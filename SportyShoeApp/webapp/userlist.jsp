<%@page import="com.controller.User"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%List <User> list=(List<User>)request.getAttribute("list") ;%>
<table align="center" border=2>
<tr><th>Id</th><th>User</th><th>Phone</th><th>Address</th></tr>
<%for(User u:list){ %>
<tr><td>
<%=u.getId() %></td><td>
<%=u.getUsername() %></td><td>
<%=u.getPhone() %></td>
<td>
<%=u.getAddress() %></td>
</tr>
<%} %>
</table><br><br>
</body>
</html>