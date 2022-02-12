<%@page import="com.controller.User"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
       <%@ page errorPage="error.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>insert title here</title>
</head>
<body>
<h1 align="center">Welcome Adim</h1>
<form align="right" action="GET">
<input type="number" name="id">
<input type="submit" value="Search SHOE">
</form><br><br>

<form align="center" action="userlist"  >
<input type="submit" value="User List">
</form>
<br><br>

<form align="center" action="insertsportshoe.jsp"  >
<input type="submit" value="ADDPRODUCT">
</form>
<br><br>
<form align="center" action="getallshoes"  >
<input type="submit" value="SHOWPRODUCT">
</form>
<br><br>

<form align="center" action="orderlist">
<input type="submit" value="ORDERS">
</form>

</html>