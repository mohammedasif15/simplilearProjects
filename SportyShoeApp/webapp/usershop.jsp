<%@page import="com.controller.SportShoe"%>
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
<h1 align="center" >Welcome To the Shop</h1>
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
<td><form align="center" action="addtocart.jsp">
<input type="submit" value="ADD TO CART">
</form></td>
</tr>

<%} %>
</table>
<br><br>
<form align="center" action="getorder">
<input type="submit" value="View Cart">


</body>
</html>