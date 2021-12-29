<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8" />
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<title>Exam Portal-View Reports</title>
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" type="text/css" media="screen"
	href="resources/index.css" />
</head>
<body>
	<nav id="nav_bar">
		<ul class="nav_ul">
			<li class="nav_list float_left"><a href="userHome.htm"
				class="nav_link">Welcome ${user}</a></li>
			<li class="nav_list float_left"><a href="about.htm"
				class="nav_link">About Us</a></li>
			<li class="nav_list float_right"><a href="logout.htm"
				class="nav_link">Logout</a></li>
		</ul>
	</nav>
	<div id="user_view_reports_div">
		<form method="POST">
			<h2 class="page_header">RESULTS</h2>
			<table id="reports_table" class="view_reports_table">
				<tr class="view_reports_table_tr">
					<th class="view_reports_table_td">Name</th>
					<th class="view_reports_table_td">Exam Name</th>
					<th class="view_reports_table_td">Level</th>
					<th class="view_reports_table_td">Score</th>
					<th class="view_reports_table_td">Correct Answers</th>
					<th class="view_reports_table_td">Wrong Answers</th>
				</tr>
				<c:forEach items="${requestScope.userList}" var="userl">
					<tr class="view_reports_table_tr">
						<td class="view_reports_table_td">${userl.reg_name}</td>
						<td class="view_reports_table_td">${userl.exam_name}</td>
						<td class="view_reports_table_td">${userl.level_type}</td>
						<td class="view_reports_table_td">${userl.score}</td>
						<td class="view_reports_table_td">${userl.count_correct_ans}</td>
						<td class="view_reports_table_td">${userl.count_wrong_ans}</td>

					</tr>
				</c:forEach>
				<tr>
					<td colspan=6 class="add_question_td"><input type="submit" value="Back"
						class="big_button" onclick="action='userHome.htm'"></td>
				</tr>
			</table>

		</form>
	</div>
</body>
</html>