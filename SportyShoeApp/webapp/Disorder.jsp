<%@page import="com.controller.Cart"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>YOUR ORDERS</title>
</head>
<body>
<%List<Cart> s=(List<Cart>)request.getAttribute("list"); %>
<table align="center" border=2>
<tr><th>Product ID</th><th>Product Name</th><th>Type</th><th>Price</th></tr>
<%for(Cart e:s){ %>
<tr><td>
<%=e.getId() %></td>
<td><%=e.getName() %></td>
<td><%=e.getType() %></td>
<td><%=e.getPrice() %></td>

</tr>

<%} %>
</table>
<br><br>
<form align="center" action="buy.jsp">
<input type="submit" value="BUY">
</form>
</body>
</html>