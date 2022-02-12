<%@page import="com.controller.SportShoe"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>List SHOES</title>
</head>
<body>
<table align="center" border=2>
<tr><th>Product Name</th><th>Price</th><th>Date</th><th>Location</th></tr>



<%SportShoe s=(SportShoe)request.getAttribute("record"); %>
<tr>
<td><%=s.getName() %></td>
<td><%=s.getPrice() %></td>
<td><%=s.getDate() %></td>
<td><%=s.getLocation() %></td>
</td></tr>

</table>
</body>
</html>