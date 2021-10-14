<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Room Booking Registration</title>
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
	<form action="register" method="post">
		FirstName :<input type="text" name="FirstName" required><br>
		<br> LastName :<input type="text" name="LastName" required><br>
		<br> UserName :<input type="text" name="UserName" required><br>
		<br> Password :<input type="password" name="Password" required><br>
		<br> DOB :<input type="date" name="DOB" required><br>
		<br> phoneNumber :<input type="number" name="PhoneNumber"  max="9900000000" required><br>
		<br> <input type="submit" value="Register" ></input><br>
		<br> <a style="text-decoration: none" href="Login.jsp">Login
			here for Login</a>
	</form>
</body>
</html>