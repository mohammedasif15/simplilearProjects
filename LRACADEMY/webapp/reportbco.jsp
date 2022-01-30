<%@page import="java.sql.ResultSet"%>
<%@page import="com.report.DisplayDetails"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1 align="center">B.COM DETAILS</h1><br><br>
<%
DisplayDetails d=new DisplayDetails();
ResultSet rs=d.displaybco();

%>
<table border=2 align="center">
    <tr>
        <th>Sl.No</th>
        <th>Subjects</th>
        <th>Teachers</th>
        </tr>
     <%  while(rs.next()){
	
	  %>
  
	      <td> <%out.print(rs.getInt(1));%></td>
	      <td><%out.print(rs.getString(2));%></td> 
	      <td><%out.print(rs.getString(3));%></td> 
	  </tr>
      		
<%	
}
rs=d.displaybcostd();%>

</table>
<br><br><br><br>
<table align="center" border=2>
<tr>
    <th>STUDENT ID</th>
    <th>FIRST NAME</th>
     <th>LAST NAME</th>
    <th>DATE OF BIRTH</th>
    <th>ADRESS</th>
    <th>PHONE NUMBER</th>
    <th>CLASS</th>
    </tr>
 <%  while(rs.next()){

  %> 
      <td> <%out.print(rs.getInt(1));%></td>
      <td><%out.print(rs.getString(2));%></td> 
      <td><%out.print(rs.getString(3));%></td> 
      <td><%out.print(rs.getDate(4));%></td>
      <td><%out.print(rs.getString(5));%></td>
      <td><%out.print(rs.getLong(6));%></td>
      <td><%out.print(rs.getString(7));%></td> 

</tr>
<%} %>     

</table>
<br><br>
<a align="center" href="display.jsp">RETURN TO MENU</a>
</body>
</html>