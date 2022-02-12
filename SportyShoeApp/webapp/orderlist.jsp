<%@page import="com.controller.OrderDetails"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>ORDER LIST</title>
</head>
<body>
<body>
<%List<OrderDetails> s=(List<OrderDetails>)request.getAttribute("list"); %>
<table align="center" border=2>
<tr><th>Order ID</th><th>Customer Name</th><th>Product</th><th>Price</th><th>Delivery Address</th></tr>
<%for(OrderDetails e:s){ %>
<tr><td>
<%=e.getId() %></td>
<td><%=e.getName() %></td>
<td><%=e.getPname() %></td>
<td><%=e.getPrice() %></td>
<td><%= e.getAddress()%></td>


</tr>

<%} %>
</table>
</body>
</html>