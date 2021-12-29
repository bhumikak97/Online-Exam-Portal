<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8" />
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<title>Exam Portal-Add Test</title>
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
	<div id="add_test">
		<form action="excel.htm" id="add_test_form" method="POST"
			enctype="multipart/form-data">
			<table class="form_table" id="add_test_table">
				<tr>
					<td class="form_field_label">Add Test:</td>
					<td><select name="exam_name" class="test_select">
							<option class="test_select_opt" value="" disabled selected>--Select--</option>
							<option class="test_select_opt" value="Java">Java</option>
							<option class="test_select_opt" value="SQL">SQL</option>
							<option class="test_select_opt" value="PHP">PHP</option>
							<option class="test_select_opt" value="C/C++">C/C++</option>
							<option class="test_select_opt" value="Python">Python</option>
							<option class="test_select_opt" value="C#/.net">C#/.net</option>
					</select> <br> <label id="selectTestError"></label></td>
				</tr>
				<tr>
					<td class="form_field_label">Level:</td>
					<td><select class="test_select add_question_form_field"
						name="level">
							<option class="test_select_opt" value="" disabled selected>--Select--</option>
							<option class="test_select_opt" value="1">Level 1</option>
							<option class="test_select_opt" value="2">Level 2</option>
							<option class="test_select_opt" value="3">Level 3</option>
					</select> <br> <label id="levelError"></label></td>
				</tr>
				<tr>
					<td class="form_field_label">Browse:</td>
					<td><input type="file" class="browse_input" name="file"></td>

				</tr>
				<tr>
					<td colspan=2><input type="submit"
						class="big_button add_test_button" value="Add"></td>
				</tr>
			</table>
		</form>
	</div>
	<div id="admin_view_test_details_div">
		<h2 class="page_header">TEST DETAILS</h2>
		<form>
			<table class="view_reports_table">
				<tr class="view_reports_table_tr">
					<th class="view_reports_table_td">Exam ID</th>
					<th class="view_reports_table_td">Exam Name</th>
					<th></th>
					<th></th>
					<th></th>
				</tr>
				<c:forEach items="${requestScope.list}" var="exam">
					<tr class="view_reports_table_tr">
						<td class="view_reports_table_td">${exam.exam_id}</td>
						<td class="view_reports_table_td">${exam.exam_name}</td>
						<!-- change onclick -->
						<td><a href="deleteExam.htm?id=${exam.exam_id}"
							class="anchor_button">Delete File</a></td>
					</tr>
				</c:forEach>
			</table>
		</form>
	</div>

</body>
</html>