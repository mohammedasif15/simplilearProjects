<%@page import="com.bsc.CRUD"%>
<%@page import="com.bsc.SubjectBean"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page errorPage="error.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
SubjectBean b=new SubjectBean();
b.setId(Integer.parseInt(request.getParameter("sbid")));
b.setSubject(request.getParameter("sname"));
b.setTeacher(request.getParameter("Tname"));
CRUD c=new CRUD();
int i=c.insert(b);

if(i>0){
	out.print("Inserted new Subject Successfully......");%><br><br>
	<a href="subTea.jsp">Display</a>
<% }
else{
	out.print("Insertion Failed");
}



%>
</body>
</html>