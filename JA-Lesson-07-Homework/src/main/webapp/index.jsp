<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!doctype html>
<html lang="en">
<head>
<!-- Required meta tags -->
<meta charset="utf-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">

<!-- 
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.2.1/css/bootstrap.min.css"
	integrity="sha384-GJzZqFGwb1QTTN6wy59ffF1BuGJpLSa9DkKMp0DgiMDm4iYMj70gZWKYbI706tWS"
	crossorigin="anonymous">  -->

<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC"
	crossorigin="anonymous">

<link rel="stylesheet" href="css/login.css">

<title>i-store</title>
</head>
<body>
	<jsp:include page="welcomeToLogin.jsp"></jsp:include>

	<div class="login-page">
		<div class="form">
			<form class="register-form">
				<input class="firstName" type="text" placeholder="first name" /> 
				<input class="lastName " type="text" placeholder="last name" /> 
				<input class="password" type="password" placeholder="password" /> 
				<input class="cpassword" type="password" placeholder="confirm password" />
				<input class="email" type="text" placeholder="email address" />

				<button class="register">create</button>
				<p class="message"> Already registered? <a href="#">Sign In</a> </p>
			</form>
			<form class="login-form">
				<input class="email" type="text" placeholder="email address" />
				<input class="password" type="password" placeholder="password" />
				<button class="login">login</button>
				<p class="message"> Not registered? <a href="#">Create an account</a></p>
			</form>
		</div>

		<div class="alert alert-success alert-dismissible fade show"
			role="alert">
			<b>Success</b> You are registered!
			<button type="button" class="btn-close" data-bs-dismiss="alert"
				aria-label="Close"></button>
		</div>
	</div>

	<jsp:include page="footer.jsp"></jsp:include>

	<!-- Optional JavaScript -->
	<!-- jQuery first, then Popper.js, then Bootstrap JS -->
	<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js"
		integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo"
		crossorigin="anonymous"></script>
	<script
		src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.9.2/dist/umd/popper.min.js"
		integrity="sha384-IQsoLXl5PILFhosVNubq5LC7Qb9DXgDA9i+tQ8Zj3iwWAwPtgFTxbJ8NT4GN1R8p"
		crossorigin="anonymous"></script>
	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.min.js"
		integrity="sha384-cVKIPhGWiC2Al4u+LWgxfKTRIcfu0JTxR+EQDz/bgldoEyl4H0zUF0QKbrJ0EcQF"
		crossorigin="anonymous"></script>
	<script
		src="https://cdnjs.cloudflare.com/ajax/libs/jquery/2.1.3/jquery.min.js"></script>

	<script src="js/login.js"></script>
</body>
</html>







<!-- 
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
	</form> -->

