<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>JA-Lesson-06-Homework</title>

<style type="text/css">
*{
	color: gray;
	margin-top: 5px;
}
</style>

</head>
<body>
	<jsp:include page="welcomeToLogin.jsp"></jsp:include>
	
	<form action="registration" method="post">
		<label for="firstname">First Name :</label> <input name="firstname">
		<br>
		<label for="lastname">Last Name :</label> <input name="lastname">
		<br>
		<label for="email">Email :</label> <input name="email">
		<br>
		<label for="password">Password :</label> <input name="password">
		<br>
		<input type="submit" value="submit"> 
	</form>
	
	
</body>
</html>
