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
CRUDBE c=new CRUDBE();
b.setId(Integer.parseInt(request.getParameter("sid")));
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

%>
<a href="displaybtech.jsp">UPDATE</a>
</body>
</html>