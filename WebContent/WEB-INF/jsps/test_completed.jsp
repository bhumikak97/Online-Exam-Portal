<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8" />
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<title>Exam Portal-Test Completed!</title>
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" type="text/css" media="screen"
	href="resources/index.css" />
<script src="resources/main.js"></script>
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
	<form class="form_table report_border">
		<h2 class="page_header">Thank You!!!</h2>
		<p class="page_header big_labels">
			You have <label id="student_level_cleared">${status}</label> the
			exam.
		</p>

		<input type="submit" id="student_view_report"
			class="big_button test_completed_buttons" value="View Report"
			onclick="action='report_card.htm'"><br>
		<% 
		int level = (Integer)session.getAttribute("testLevel");
		System.out.println("Test completed->"+level);
		if(session.getAttribute("status").toString().equals("Passed"))
		{
		%>
		<input type="submit" id="go_to_next_level" class="big_button test_completed_buttons" 
			value="Next Level" onclick="action='nextTest.htm?'"></input>
		<%
		}
		%>	
	</form>
</body>
</html>