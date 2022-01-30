<%@page import="com.std.CRUDSTD"%>
<%@page import="java.text.SimpleDateFormat"%>
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
b.setSid(Integer.parseInt(request.getParameter("sid")));
b.setFname(request.getParameter("fname"));
b.setLname(request.getParameter("lname"));
String dob=request.getParameter("dob");
SimpleDateFormat sdf=new SimpleDateFormat("yyyy-mm-dd");
java.util.Date dobfinal=sdf.parse(dob);
b.setDob(dobfinal);
b.setAddress(request.getParameter("add"));
b.setPhone(request.getParameter("pno"));
b.setClasss(request.getParameter("clas"));
CRUDSTD c=new CRUDSTD();
int i=c.insert(b);
if(i>0){
	out.print("ADDED STUDENT INTO CLASS.......");
	%><br><br>  
	
	<form  action="displaystd.jsp">
<input type="submit" value="DISPLAY UPDATED LIST">
</form>
	
	<%
}
else{
	out.print("STUDENT UPDATION FAILED");
}

%>



</body>
</html>