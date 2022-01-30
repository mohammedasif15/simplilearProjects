<%@page import="java.sql.ResultSet"%>
<%@page import="com.crud.CRUD"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1 align="center">List Of Classes</h1>
<%
CRUD crud=new CRUD();
ResultSet rs=crud.select();%>



<table align="center" border=2>
    <tr>
        <th>cid</th>
        <th>cname</th>
        <th>Action</th>
        </tr>
     <%  while(rs.next()){
	
	  %> 
	      <td> <%out.print(rs.getInt(1));%></td>
	      <td><%out.print(rs.getString(2));%></td> 
	      <td><a href="edit.jsp">EDIT</a></td>
	      <td><a href="delete.jsp">DELETE</a></td>
	      </tr>		<tr>
<%	
}
%>

</table><br><br>

<form align="center" action="newclass.jsp">
<input type="submit" value="Add New Class">
</form><br><br>

<h1 Align="center">Subject And Teacher Details</h1>

<table align="center" border=2>
    <tr>
        <th>Cource NAME</th>
        <th>COURCE SUBJECTS</th>
        <th>Reports</th>
        </tr>
       
    <tr>
        <td>B.COM</td>
        <td><a href="displaybco.jsp">Subject And Teachers</a></td>
        <td><a href="reportbco.jsp">class Report</a></td>
        
         </tr>
         <tr>
        <td>B.TECH</td>
        <td><a href="displaybtech.jsp">Subject And Teachers</a></td>
        <td><a href="reportbtech.jsp">class Report</a></td>
         </tr>
         <tr>
        <td>BSC.CS</td>
        <td><a href="subTea.jsp">Subject And Teachers</a></td>
        <td><a href="reportbsc.jsp">class Report</a></td>
         </tr>
       


</table><br><br>
<form  align="center" action="displaystd.jsp">
<h1>STUDENT INFORMATION</h1>
<input type="submit" value="STUDENT DETAILS">
</form><br><br>

<form  align="center" action="index.jsp">

<input type="submit" value="logout">
</form><

</body>
</html>