<%@page import="com.Product"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
Product p=new Product();
p.setPid(Integer.parseInt(request.getParameter("pid")));
p.setPname(request.getParameter("pname"));
out.print("Product Added Successfully");


%>
</body>
</html>