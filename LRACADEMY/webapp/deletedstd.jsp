<%@page import="com.std.CRUDSTD"%>
<%@page import="com.std.StudentBean"%>
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
StudentBean b=new StudentBean();
CRUDSTD c=new CRUDSTD();
b.setSid(Integer.parseInt(request.getParameter("sid")));
int i=c.delete(b);
if(i>0){
	out.print("Deleted Successfully.....");%><br><br>
	
	<form action="subTea.jsp">
	<input type="submit" value="updated list">
	</form>
	
<% 	
}
else{
	out.print("Deletion failed....");
}

%><br><br><br>
<a href="displaystd.jsp">UPDATED LIST </a>
</body>
</html>