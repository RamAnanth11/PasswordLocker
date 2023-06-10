<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<h2><%=(String)session.getAttribute("savemessage1")%></h2>
	<h1>User Login</h1>
	<form action="userlogin" method = "post">
		email = <input type = "text" name =  "email"> <br><br>
		password = <input type = "text" name = "password">  <br><br>
		<input type = "submit">
	</form>
	
	<br><br>
	<a href = "home.jsp">Back to Home Page</a>
	
</body>
</html>