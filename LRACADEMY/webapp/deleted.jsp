<%@page import="com.crud.CRUD"%>
<%@page import="com.bean.ClassBean"%>
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
ClassBean b=new ClassBean();
CRUD crud =new CRUD();
b.setCid(Integer.parseInt(request.getParameter("cid")));
int i=crud.delete(b);
if(i>0){
	out.print("Deleted Successfully.....");%><br><br>
	
	<form action="display.jsp">
	<input type="submit" value="updated list">
	</form>
	
<% 	
}
else{
	out.print("Deletion failed....");
}




%>
</body>
</html>