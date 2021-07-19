<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login</title>
<style type="text/css">
*{
	color: gray;
	margin-top: 5px;	
}

h3 {
	font-size: 15px;
	color: black;
}

</style>


</head>
<body>

<jsp:include page="welcomeToLogin.jsp"></jsp:include>
	
	<form action="login" method="post">
		<label for="login">Login (email) :</label> <input name="login">
		<br>
		<label for="password">Password :</label> <input name="password">
		<br>
		<input type="submit" value="submit"> 
	</form>
	

</body>
</html>