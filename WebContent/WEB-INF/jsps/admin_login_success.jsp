<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8" />
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<title>Exam Portal-Welcome</title>
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" type="text/css" media="screen"
	href="resources/index.css" />
<script src="resources/main.js"></script>
</head>
<body>
	<nav id="nav_bar">
		<ul class="nav_ul">
			<li class="nav_list float_left"><a href="#"
				class="nav_link active">Welcome ${admin}</a></li>
			<li class="nav_list float_right"><a href="logout.htm"
				class="nav_link">Logout</a></li>
		</ul>
	</nav>
	<div class="form_table home_buttons">
		<form>
			<input type="submit" id="test_details" class="big_button nav_button"
				value="View Test Details" onclick="action='insertExamPage.htm'">
			<br> <input type="submit" id="view_reports"
				class="big_button nav_button" value="View Reports"
				onclick="action='show_stud.htm'">
		</form>
	</div>
</body>
</html>