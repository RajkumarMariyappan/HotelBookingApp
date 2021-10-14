<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login</title>
<link rel="stylesheet" href="Login.css">
<style type="text/css">
body {
	background-color: lightyellow;
	background-size: contain;
}
</style>
</head>
<body>
	<nav>

		<ul class="topnav" id="dropdownclick">
			<li class="logopad"><img src="D:\projectWork\logo.jpg"
				class="logo"></li>
			<li class="titlelogo">Raj<span>Hotel</span></li>

		</ul>
	</nav>
	<br>
	<br>
	<form action="login" method="get">
		<h4>Login here..</h4>
		<br> UserName :<input type="text" name="UserName" required /><br>
		<br> Password :<input type="password" name="Password" required><br>
		<br> <input type="submit" value="Login"><br> <br>
		<a style="text-decoration: none" href="RegistrationPage.jsp">Click
			here to Register</a>

	</form>

</body>
</html>