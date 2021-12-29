<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8" />
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<title>Online Exam-Logout</title>
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" type="text/css" media="screen"
	href="resources/index.css" />
<script src="resources/main.js"></script>
</head>
<body>
	<nav id="nav_bar">
		<ul class="nav_ul">
			<li class="nav_list float_left"><a href="index.htm"
				class="nav_link">Home</a></li>
			<li class="nav_list float_left"><a href="about.htm"
				class="nav_link">About Us</a></li>
			<li class="nav_list nav_link float_right dropdown">Login
				<div class="dropdown-content nav_list r">
					<a class="nav_link" href="admin_login.htm">Login as Admin</a> <a
						class="nav_link" href="login.htm">Login as User</a>
				</div>
			</li>
			<li class="nav_list float_right"><a href="register.htm"
				class="nav_link">Register</a></li>
		</ul>
	</nav>
	<div id="logout_div_border">
		<p id="logout_p">You have been successfully logged out!</p>
	</div>
</body>
</html>