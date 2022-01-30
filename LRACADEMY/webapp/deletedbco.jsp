<%@page import="com.bcom.CRUDBCO"%>
<%@page import="com.bcom.SubjectBeanBco"%>
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
SubjectBeanBco b=new SubjectBeanBco();
CRUDBCO c=new CRUDBCO();
b.setId(Integer.parseInt(request.getParameter("sid")));
int i=c.delete(b);
if(i>0){
	out.print("Deleted Successfully.....");%><br><br>
	
	
	
<% 	
}
else{
	out.print("Deletion failed....");
}

%>
<br>
<a href="displaybco.jsp">UPDATE</a>
</body>
</html>