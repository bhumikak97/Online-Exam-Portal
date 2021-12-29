<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8" />
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<title>Exam Portal-Instructions</title>
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" type="text/css" media="screen"
	href="resources/index.css" />
<script src="resources/main.js"></script>
</head>
<body>
	<nav id="nav_bar">
		<ul class="nav_ul">
			<li class="nav_list float_left"><a href="userHome.htm" class="nav_link">Welcome ${user}</a></li>
			<li class="nav_list float_right"><a href="logout.htm" class="nav_link">Logout</a></li>
		</ul>
	</nav>
	<form id="instr_div" name="instr_div" class="form_table">
		<p id="instructions_header">
			<strong>Instructions for Technical Test</strong>
		</p>
		<ul id="instructions_list">
			<li>Total number of questions: <strong>10</strong></li>
			<br>
			<li>Time alloted: <strong>15</strong> minutes</li>
			<br>
			<li>Each question carries 1 mark, no negative marking</li>
			<br>
			<li>DO NOT click anywhere outside this window</li>
			<br>
			<li>DO NOT use the keyboard during the test</li>
			<br>
			<li>Questions marked for review will also be considered for
				evaluation</li>
		</ul>
		<p align="center"><a href="test.htm?level=1" class="anchor_button">Continue</a></p>
	</form>
</body>
</html>