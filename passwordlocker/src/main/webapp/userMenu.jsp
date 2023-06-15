<%@page import="com.passwordlocker.repository.UserServiceImplementation"%>
<%@page import="com.passwordlocker.entity.User"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%User user = (User) session.getAttribute("LoggedUser"); 
	if(user!=null){
	%>
	
	<h1>Welcome to User Menu</h1>
	
	<h4><a href = "saveaccount.jsp">Save Account</a></h4>
	<h4><a href = "updateaccount.jsp">Update Account</a></h4>
	<h4><a href = "deleteaccount">Delete Account</a></h4>
		
	
	
	<%} else{%>
	<h1>Please Login to access User Functions :/
	<a href="userLogin.jsp">User Login?</a></h1>
	<%} %>
	 
	<a href = "userLogout">Log Out</a>
</body>
</html>