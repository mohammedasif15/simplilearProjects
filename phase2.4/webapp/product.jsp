<%@page import="com.product.Product"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="com.product.CRUD"%>
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
Product p=new Product();
p.setPid(Integer.parseInt(request.getParameter("pid")));
CRUD c=new CRUD();
ResultSet rs=c.select(p);
if(rs!=null){
%>
<table border=1>
<tr><th>PRODUCT ID</th>
<th>PRODUCT NAME</th>
<th>PRODUCT DATE</th>
<th>PRODUCT ADDRESS</th></tr>

<% while(rs.next()){%>
<tr>
	<td><% out.print(rs.getInt(1));%></td>
	<td><% out.print(rs.getString(2));%></td>
	<td><% out.print(rs.getDate(3));%></td>
	<td><% out.print(rs.getString(4));%></td><% 
}

}
else{
	out.print("No Item Available");
}


%>

</table>
</body>
</html>