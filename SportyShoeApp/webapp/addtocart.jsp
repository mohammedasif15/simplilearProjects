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
<form align="center" action="addcart">
<input type="number" name="id"><br><br>
<label for="shoes">Choose a Size:</label>
<select name="size" id="size">
 
   <option value="5">UK5</option>
    <option value="6">UK6</option>
     <option value="7">UK7</option>
      <option value="8">UK8</option>
       <option value="9">UK9</option>
</select><br><br>
<label for="shoes">Quantity:</label>
<select name="size" id="size">
 
   <option value="5">1</option>
    <option value="6">2</option>
     <option value="7">3</option>
      <option value="8">4</option>
       <option value="9">5</option>
</select><br><br>
<input type="submit" value="ADD TO CART">
</form>
</body>
</html>