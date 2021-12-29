<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8" />
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<title>Exam Portal-New Exam</title>
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" type="text/css" media="screen"
	href="resources/index.css" />
<script src="main.js"></script>
</head>
<body>
	<nav id="nav_bar">
		<ul class="nav_ul">
			<li class="nav_list float_left"><a href="userHome.htm"
				class="nav_link">Welcome ${user}</a></li>
			<li class="nav_list float_right"><a href="logout.htm"
				class="nav_link">Logout</a></li>
		</ul>
	</nav>
	<br>
	<form action="instructions.htm" id="selectExam_form">
		<table class="form_table exam_div">
			<tr>
				<td colspan=3 id="select_exam">Select Exam:</td>
			</tr>
			<tr>
				<td><button type="submit" class="big_button" name="testName" value="Java">Java</button></td>
				<td><button type="submit" class="big_button" name="testName" value="SQL">SQL</button></td>
				<td><button type="submit" class="big_button" name="testName" value="PHP">PHP</button></td>
			</tr>
			<tr>
				<td><button type="submit" class="big_button" name="testName" value="C/C++">C/C++</button></td>
				<td><button type="submit" class="big_button" name="testName" value="Python">Python</button></td>
				<td><button type="submit" class="big_button" name="testName" value="C#/.net">C#/.net</button></td>
			</tr>
		</table>
	</form>
</body>
</html>