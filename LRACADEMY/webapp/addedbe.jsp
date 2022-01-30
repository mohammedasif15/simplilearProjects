<%@page import="com.be.*"%>
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
SubjectBeanBe b=new SubjectBeanBe();
b.setId(Integer.parseInt(request.getParameter("sbid")));
b.setSubject(request.getParameter("sname"));
b.setTeacher(request.getParameter("Tname"));
CRUDBE c=new CRUDBE();
int i=c.insert(b);

if(i>0){
	out.print("Inserted new Subject Successfully......");%><br><br>
	<a href="displaybtech.jsp">Display</a>
	<a href="index.jsp">Menu</a>
<% }
else{
	out.print("Insertion Failed");
}



%>
</body>
</html>