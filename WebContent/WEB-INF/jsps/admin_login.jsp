<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
<meta charset="utf-8" />
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<title>Exam Portal-Login</title>
<meta name="viewport" content="width=device-width, initial-scale=1">
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
			<li class="nav_list nav_link float_right dropdown active">Login
				<div class="dropdown-content nav_list r">
					<a class="nav_link" href="admin_login.htm">Login as Admin</a> <a class="nav_link"
						href="login.htm">Login as User</a>
				</div>
			</li>
			<li class="nav_list float_right"><a href="register.htm"
				class="nav_link">Register</a></li>
		</ul>
	</nav>

	<div>
		<h2 class="page_header">LOGIN</h2>
		<p class="pageAlert"><c:out value="${requestScope.invalidAdminLoginCredentials}"/></p>
		<form action="adminLogin.htm" id="admin_login_form"
			onsubmit="return validateAdminLogin();" name="admin_login_form"
			method="POST">
			<table class="form_table">
				<tr>
					<td class="form_field_label">Email Id:</td>
					<td><input type="email" class="form_input" id="adminLoginId"
						name="email" pattern="[a-z0-9._]+@[a-z0-9._]+\.[a-z]{2,3}$"
						placeholder="Enter your Email id"> <br> <label
						id="adminLoginId_error" class="error_fields"></label></td>
				</tr>
				<tr>
					<td class="form_field_label">Password:</td>
					<td><input type="password" class="form_input"
						id="adminLoginPassword" name="password"
						placeholder="Enter your password"> <br> <label
						id="adminLoginPassword_error" class="error_fields"></label></td>
				</tr>
				<tr>
					<td colspan=2><input type="submit" value="Login"
						class="big_button"></td>
				</tr>
			</table>
		</form>
	</div>
	<script>
		var error_flag = true;
		var reqd_error = "This field cannot be empty";

		function validateAdminLogin() {

			var login_id = document.getElementById('adminLoginId').value;
			var login_pwd = document.getElementById('adminLoginPassword').value;

			var login_id_error = document.getElementById('adminLoginId_error');
			var login_pwd_error = document
					.getElementById('adminLoginPassword_error');

			if (login_id == "null" || login_id == "") {
				login_id_error.innerHTML = reqd_error;
				error_flag = false;
			} else {
				login_id_error.innerHTML = "";
			}

			if (login_pwd == "null" || login_pwd == "") {
				login_pwd_error.innerHTML = reqd_error;
				error_flag = false;
			} else {
				login_pwd_error.innerHTML = "";
			}

			return error_flag;
		}
	</script>
</body>
</html>