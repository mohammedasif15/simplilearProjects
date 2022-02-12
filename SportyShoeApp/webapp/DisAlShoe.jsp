<%@page import="com.controller.SportShoe"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>LIST OF SHOES</title>
</head>
<body>
<%List<SportShoe> s=(List<SportShoe>)request.getAttribute("list"); %>
<table align="center" border=2>
<tr><th>Product ID</th><th>Product Name</th><th>Type</th><th>Price</th><th>Date</th><th>Location</th><th>Action</th></tr>
<%for(SportShoe e:s){ %>
<tr><td>
<%=e.getId() %></td>
<td><%=e.getName() %></td>
<td><%=e.getType() %></td>
<td><%=e.getPrice() %></td>
<td><%= e.getDate()%></td>
<td><%=e.getLocation()%></td>
<td><form align="center" action="deleshoes.jsp">
<input type="submit" value="DELETE"></form></td>
<td><form align="center" action="update.jsp">
<input type="submit" value="EDIT"></form></td>
</tr>

<%} %>
</table><br><br>
<a align="center"  href=displayuser.jsp> Return To Menu </a>
</body>
</html>