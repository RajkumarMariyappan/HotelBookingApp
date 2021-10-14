<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<title>BookingHotel</title>
<link rel="stylesheet" href="dummy.css">
<style type="text/css">
body {
	background-color:pink;
	background-size: contain;
}

button {
	border-radius: 2%;
	margin-top: 5%;
	width: 200px;
	height: 40px;
}

section {
	border: 5px solid rgb(252, 249, 249);
	height: 90vh;
	background-color: lightgreen;
	
	
	max-width: 500px;
	width: 100%;
	margin: auto;
	height: 60vh;
	display: block;
	align-items: center;
	text-align: center;
	justify-content: center;
}

.button {
	text-decoration: none;
	font-weight: 500;
	font-size: 20px;
	padding: 2%;
}

h1 {
	text-align: center;
	color: ivory;
	font-size: 30px;
	font-variant: small-caps;
}
</style>
</head>
<body>
<body>

	<h1 style="color: Darkviolet">Welcome to Raj Hotel</h1>
	<br>
	<br>
	<br>
	<br>
	<div class="image" style="padding-bottom: 7%;">
		<section>

			<h1 style="color:Red">welcome !</h1>
			<div class="con">
				<br>
				<br>
				<br>
				<button>
					<a class="button" href="RegistrationPage.jsp">Register</a>
				</button>
				<br>
				<br>
				<button>
					<a class="button" href="Login.jsp">Login </a>
				</button>

			</div>

		</section>
	</div>
	<style>
* {
	box-sizing: border-box;
}

/* Create three equal columns that floats next to each other */
.column {
	float: left;
	width: 33.33%;
	padding: 30px;
	height: 300px; /* Should be removed. Only for demonstration */
}

/* Clear floats after the columns */
.row:after {
	content: "";
	display: table;
	clear: both;
}
</style>
</body>
</html>