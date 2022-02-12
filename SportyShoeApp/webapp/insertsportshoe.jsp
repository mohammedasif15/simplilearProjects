<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page errorPage="error.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add Product</title>
</head>
<body>
<form align="center" action="insertshoe">
Enter Product  Name<input type="text" name="name"><br><br>
Enter Product Price<input type="text" name="price"><br><br>
Enter Product Type<input type="text" name="type"><br><br>
Enter Date<input type="date" name="date"><br><br>
Enter Location<input type="text" name="location"><br><br>
<input type="submit" value="insert">
</form>
</body>
</html>