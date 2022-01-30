<%@page import="com.crud.CRUD"%>
<%@page import="com.bean.ClassBean"%>
<%@ page errorPage="error.jsp" %>
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
ClassBean b=new ClassBean();
CRUD crud=new CRUD();
b.setCid(Integer.parseInt(request.getParameter("cid")));
b.setCname(request.getParameter("cname"));
int i=crud.insert(b);
if(i>0){
	out.print("Inserted new Class Successfully......");%><br><br>
	<a href="display.jsp">Display</a>
<% }
else{
	out.print("Insertion Failed");
}



%>
</body>
</html>