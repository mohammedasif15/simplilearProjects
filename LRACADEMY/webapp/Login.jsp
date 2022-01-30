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

        String name = request.getParameter("user");
        String pwd = request.getParameter("pass");
        
        if (name == null || name.equals("") || pwd == null || pwd.equals("")) {
        	out.print("invalid Credentials");
                response.sendRedirect("index.jsp");
        } else {
                
                session.setAttribute("name", name);
                response.sendRedirect("display.jsp");
                
        }
%>

</body>
</html>