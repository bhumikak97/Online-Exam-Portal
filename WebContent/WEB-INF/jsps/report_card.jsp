<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%><!DOCTYPE html>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
    <meta charset="utf-8" />
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <title>Exam Portal-Report Card</title>
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" type="text/css" media="screen" href="resources/index.css" />
    <script src="main.js"></script>
</head>
<body>
    <nav id="nav_bar">
       <ul class="nav_ul">
            <li class="nav_list float_left"><a href="userHome.htm" class="nav_link">Home</a></li>
			<li class="nav_list float_left"><a href="about.jsp" class="nav_link">About
					Us</a></li>
			<li class="nav_list float_right"><a href="logout.jsp" class="nav_link">Logout</a></li>
        </ul>
    </nav>
    <form class="form_table report_border" action="testRedirect.htm">
        <h2 class="page_header">REPORT CARD</h2>
        <p class="report_card_labels"><strong>Name:</strong> <label id="studentName">${user}</label></p>
        <p class="report_card_labels"><strong>Score:</strong> <label id="studentScore">${score}/20</label></p>
        <p class="report_card_labels"><strong>Test:</strong> <label id="studentTestTaken">${testName}</label> </p>
        <input type="submit" class="big_button exit_button" value="Exit">
    </form>
</body>
</html>