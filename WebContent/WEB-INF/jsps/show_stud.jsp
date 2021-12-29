<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8" />
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<title>Exam Portal-Search Students</title>
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" type="text/css" media="screen"
	href="resources/index.css" />
<script src="resources/main.js"></script>
</head>
<body>

	<nav id="nav_bar">
		<ul class="nav_ul">
			<li class="nav_list float_left"><a
				href="adminHome.htm" class="nav_link">Welcome ${admin}</a></li>
			<li class="nav_list float_right"><a href="logout.htm"
				class="nav_link">Logout</a></li>
		</ul>
	</nav>

	<div>
		<h2 class="page_header">STUDENT DETAILS</h2>
		<form id="studentDetailsForm" method="POST">
			<table class="view_reports_table">
				<tr class="view_reports_table_tr">
					<th class="view_reports_table_td">Name</th>
					<th class="view_reports_table_td">Exam Name</th>
					<th class="view_reports_table_td">Level</th>
					<th class="view_reports_table_td">Score</th>
					<th class="view_reports_table_td">Correct Answers</th>
					<th class="view_reports_table_td">Wrong Answers</th>
				</tr>
				<c:forEach items="${requestScope.studentList}" var="student">
				<tr class="view_reports_table_tr">
					<td class="view_reports_table_td">${student.reg_name}</td>
					<td class="view_reports_table_td">${student.exam_name}</td>
					<td class="view_reports_table_td">${student.level_type}</td>
					<td class="view_reports_table_td">${student.score}</td>
					<td class="view_reports_table_td">${student.count_correct_ans}</td>
					<td class="view_reports_table_td">${student.count_wrong_ans}</td>
				</tr>
				</c:forEach>
				<tr>
					<td colspan=7 class="add_question_td"><input type="submit" class="big_button" value="Back"
					onclick="action='admin.htm'"></td>
			</table>
		</form>
	</div>

</body>
</html>