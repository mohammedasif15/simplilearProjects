<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page errorPage="error.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Update Product</title>
</head>
<body>
<form align="center" action="update">
Enter Id<input type="number" name="id">
Enter Name<input type="text" name="name">
Enter Type<input type="text" name="type">
Enter Price<input type="text" name="price">
Enter Location<input type="text" name="location">
<input type="submit" value="update">
</form>
</body>
</html>