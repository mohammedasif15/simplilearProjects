<%@page import="com.bcom.CRUDBCO"%>
<%@page import="com.bcom.SubjectBeanBco"%>
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
SubjectBeanBco b=new SubjectBeanBco();
b.setId(Integer.parseInt(request.getParameter("sbid")));
b.setSubject(request.getParameter("sname"));
b.setTeacher(request.getParameter("Tname"));
CRUDBCO c=new CRUDBCO();
int i=c.insert(b);

if(i>0){
	out.print("Inserted new Subject Successfully......");%><br><br>
	<a href="displaybco.jsp">Display</a>
<% }
else{
	out.print("Insertion Failed");
}



%>
</body>
</html>