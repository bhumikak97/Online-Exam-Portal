<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8" />
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>Exam Portal-Welcome</title>
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" type="text/css" media="screen"
	href="resources/index.css" />

</head> 
<body>
	<nav id="nav_bar">
		<ul class="nav_ul">
			<li class="nav_list float_left"><a href="#"
				class="nav_link active">Welcome ${user}</a></li>
			<li class="nav_list float_right"><a href="logout.htm"
				class="nav_link">Logout</a></li>
		</ul>
	</nav>
	<div class="form_table home_buttons">
		<form>
			<input type="submit" id="view_report" class="big_button nav_button"
				value="View Report" onclick="action='user_report.htm'"> <br>
			<input type="submit" class="big_button nav_button" value="New Exam"
				onclick="action='exam.htm'">
		</form>
	</div>
</body>
</html>