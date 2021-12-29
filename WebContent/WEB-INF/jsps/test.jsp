<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8" />
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta http-equiv='cache-control' content='no-cache'>
<meta http-equiv='expires' content='0'>
<meta http-equiv='pragma' content='no-cache'>
<title>Exam Portal-Test</title>
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" type="text/css" media="screen"
	href="resources/index.css" />
<!--script src="resources/main.js"></script-->
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js"></script>
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/1.9.1/jquery.min.js"></script>
<script
	src="https://ajax.googleapis.com/ajax/libs/jqueryui/1.10.2/jquery-ui.min.js">
	
</script>

<style>
.green {
	background-color: green;
}
</style>
</head>

<body id="element">

	<div id="overlay">
		<button id="overlay_button" class="big_button" onclick="off()">Start
			Test</button>
	</div>
	<div id="startTest">
		<p class="usernameDisplay">Logged in as: ${user}</p>

		<div id="showtime">
			Time Left : <input id="minutes" type="text"> : <input
				id="seconds" type="text">
		</div>
		<br>
		<form id="testForm">
			<div class="question_paper">
				<div id="questions_map">
					<div id="color_code_div">
						&nbsp;
						<button class="color_code" id="blue" disabled></button>
						Unattempted &nbsp;&nbsp;&nbsp;
						<button class="color_code" id="green" disabled></button>
						Attempted
					</div>
					<button class="big_button question_number_map" id="btn1">1</button>
					<button class="big_button question_number_map" id="btn2">2</button>
					<button class="big_button question_number_map" id="btn3">3</button>
					<br>
					<button class="big_button question_number_map" id="btn4">4</button>
					<button class="big_button question_number_map" id="btn5">5</button>
					<button class="big_button question_number_map" id="btn6">6</button>
					<br>
					<button class="big_button question_number_map" id="btn7">7</button>
					<button class="big_button question_number_map" id="btn8">8</button>
					<button class="big_button question_number_map" id="btn9">9</button>
					<br>
					<button class="big_button question_number_map" id="btn10">10</button>
				</div>
			</div>
			<div id="questionSectionBorder">
				<div class="question_section" id="first">
					<c:forEach items="${requestScope.list}" var="exam"
						varStatus="loopCounter" begin="0" end="0">
						<p class="qtn_no">
							Question <label id="qno">1</label>/10
						</p>
						<p class="question">
							<c:out value="${exam.question}"></c:out>
						</p>

						<div class="options">
							<input type="radio" class="option1" name="option1" value="opt1">
							<c:out value="${exam.opt_1}"></c:out>
							</input> <br> <br> <input type="radio" class="option1"
								name="option1" value="opt2">
							<c:out value="${exam.opt_2}"></c:out>
							</input> <br> <br> <input type="radio" class="option1"
								name="option1" value="opt3">
							<c:out value="${exam.opt_3}"></c:out>
							</input> <br> <br> <input type="radio" class="option1"
								name="option1" value="opt4">
							<c:out value="${exam.opt_4}"></c:out>
							</input> <br> <br>
						</div>
					</c:forEach>
					<!--  input type="submit" name="btn" class="big_button next_button"
				value="Next"-->
					<button class="big_button next_button" id="first_btn">Next</button>
				</div>

				<div class="question_section" id="second">
					<c:forEach items="${requestScope.list}" var="exam"
						varStatus="loopCounter" begin="1" end="1">
						<p class="qtn_no">
							Question <label id="qno">2</label>/10
						</p>
						<p class="question">
							<c:out value="${exam.question}"></c:out>
						</p>
						<div class="options">
							<input type="radio" name="option2" value="opt1" class="option2">
							<c:out value="${exam.opt_1}"></c:out>
							</input> <br> <br> <input type="radio" name="option2"
								value="opt2" class="option2">
							<c:out value="${exam.opt_2}"></c:out>
							</input> <br> <br> <input type="radio" name="option2"
								class="option2" value="opt3">
							<c:out value="${exam.opt_3}"></c:out>
							</input> <br> <br> <input type="radio" name="option2"
								class="option2" value="opt4">
							<c:out value="${exam.opt_4}"></c:out>
							</input> <br> <br>
						</div>
					</c:forEach>
					<button class="big_button next_button" id="second_btn">Next</button>
				</div>

				<div class="question_section" id="third">
					<c:forEach items="${requestScope.list}" var="exam"
						varStatus="loopCounter" begin="2" end="2">
						<p class="qtn_no">
							Question <label id="qno">3</label>/10
						</p>
						<p class="question">
							<c:out value="${exam.question}"></c:out>
						</p>
						<div class="options">
							<input type="radio" name="option3" value="opt1" class="option3">
							<c:out value="${exam.opt_1}"></c:out>
							</input> <br> <br> <input type="radio" name="option3"
								class="option3" value="opt2">
							<c:out value="${exam.opt_2}"></c:out>
							</input> <br> <br> <input type="radio" name="option3"
								class="option3" value="opt3">
							<c:out value="${exam.opt_3}"></c:out>
							</input> <br> <br> <input type="radio" name="option3"
								class="option3" value="opt4">
							<c:out value="${exam.opt_4}"></c:out>
							</input> <br> <br>
						</div>
					</c:forEach>
					<button class="big_button next_button" id="third_btn">Next</button>
				</div>

				<div class="question_section" id="fourth">
					<c:forEach items="${requestScope.list}" var="exam"
						varStatus="loopCounter" begin="3" end="3">
						<p class="qtn_no">
							Question <label id="qno">4</label>/10
						</p>
						<p class="question">
							<c:out value="${exam.question}"></c:out>
						</p>
						<div class="options">
							<input type="radio" name="option4" value="opt1" class="option4">
							<c:out value="${exam.opt_1}"></c:out>
							</input> <br> <br> <input type="radio" name="option4"
								class="option4" value="opt2">
							<c:out value="${exam.opt_2}"></c:out>
							</input> <br> <br> <input type="radio" name="option4"
								class="option4" value="opt3">
							<c:out value="${exam.opt_3}"></c:out>
							</input> <br> <br> <input type="radio" name="option4"
								class="option4" value="opt4">
							<c:out value="${exam.opt_4}"></c:out>
							</input> <br> <br>
						</div>
					</c:forEach>
					<button class="big_button next_button" id="fourth_btn">Next</button>
				</div>

				<div class="question_section" id="fifth">
					<c:forEach items="${requestScope.list}" var="exam"
						varStatus="loopCounter" begin="4" end="4">
						<p class="qtn_no">
							Question <label id="qno">5</label>/10
						</p>
						<p class="question">
							<c:out value="${exam.question}"></c:out>
						</p>
						<div class="options">
							<input type="radio" name="option5" value="opt1" class="option5">
							<c:out value="${exam.opt_1}"></c:out>
							</input> <br> <br> <input type="radio" name="option5"
								class="option5" value="opt2">
							<c:out value="${exam.opt_2}"></c:out>
							</input> <br> <br> <input type="radio" name="option5"
								class="option5" value="opt3">
							<c:out value="${exam.opt_3}"></c:out>
							</input> <br> <br> <input type="radio" name="option5"
								class="option5" value="opt4">
							<c:out value="${exam.opt_4}"></c:out>
							</input> <br> <br>
						</div>
					</c:forEach>
					<button class="big_button next_button" id="fifth_btn">Next</button>
				</div>

				<div class="question_section" id="sixth">
					<c:forEach items="${requestScope.list}" var="exam"
						varStatus="loopCounter" begin="5" end="5">
						<p class="qtn_no">
							Question <label id="qno">6</label>/10
						</p>
						<p class="question">
							<c:out value="${exam.question}"></c:out>
						</p>
						<div class="options">
							<input type="radio" name="option6" value="opt1" class="option6">
							<c:out value="${exam.opt_1}"></c:out>
							</input> <br> <br> <input type="radio" name="option6"
								class="option6" value="opt2">
							<c:out value="${exam.opt_2}"></c:out>
							</input> <br> <br> <input type="radio" name="option6"
								class="option6" value="opt3">
							<c:out value="${exam.opt_3}"></c:out>
							</input> <br> <br> <input type="radio" name="option6"
								class="option6" value="opt4">
							<c:out value="${exam.opt_4}"></c:out>
							</input> <br> <br>
						</div>
					</c:forEach>
					<button class="big_button next_button" id="sixth_btn">Next</button>
				</div>

				<div class="question_section" id="seventh">
					<c:forEach items="${requestScope.list}" var="exam"
						varStatus="loopCounter" begin="6" end="6">
						<p class="qtn_no">
							Question <label id="qno">7</label>/10
						</p>
						<p class="question">
							<c:out value="${exam.question}"></c:out>
						</p>
						<div class="options">
							<input type="radio" class="option7" name="option7" value="opt1"
								class="option7">
							<c:out value="${exam.opt_1}"></c:out>
							</input> <br> <br> <input type="radio" class="option7"
								name="option7" value="opt2">
							<c:out value="${exam.opt_2}"></c:out>
							</input> <br> <br> <input type="radio" class="option7"
								name="option7" value="opt3">
							<c:out value="${exam.opt_3}"></c:out>
							</input> <br> <br> <input type="radio" class="option7"
								name="option7" value="opt4">
							<c:out value="${exam.opt_4}"></c:out>
							</input> <br> <br>
						</div>
					</c:forEach>
					<button class="big_button next_button" id="seventh_btn">Next</button>
				</div>

				<div class="question_section" id="eighth">
					<c:forEach items="${requestScope.list}" var="exam"
						varStatus="loopCounter" begin="7" end="7">
						<p class="qtn_no">
							Question <label id="qno">8</label>/10
						</p>
						<p class="question">
							<c:out value="${exam.question}"></c:out>
						</p>
						<div class="options">
							<input type="radio" name="option8" value="opt1" class="option8">
							<c:out value="${exam.opt_1}"></c:out>
							</input> <br> <br> <input type="radio" name="option8"  class="option8"
								 value="opt2">
							<c:out value="${exam.opt_2}"></c:out>
							</input> <br> <br> <input type="radio" name="option8" class="option8"
								 value="opt3">
							<c:out value="${exam.opt_3}"></c:out>
							</input> <br> <br> <input type="radio" name="option8" class="option8"
								 value="opt4">
							<c:out value="${exam.opt_4}"></c:out>
							</input> <br> <br>
						</div>
					</c:forEach>
					<button class="big_button next_button" id="eighth_btn">Next</button>
				</div>

				<div class="question_section" id="ninth">
					<c:forEach items="${requestScope.list}" var="exam"
						varStatus="loopCounter" begin="8" end="8">
						<p class="qtn_no">
							Question <label id="qno">9</label>/10
						</p>
						<p class="question">
							<c:out value="${exam.question}"></c:out>
						</p>
						<div class="options">
							<input type="radio" name="option9" value="opt1" class="option9">
							<c:out value="${exam.opt_1}"></c:out>
							</input> <br> <br> <input type="radio" name="option9"
								class="option9" value="opt2">
							<c:out value="${exam.opt_2}"></c:out>
							</input> <br> <br> <input type="radio" name="option9"
								class="option9" value="opt3">
							<c:out value="${exam.opt_3}"></c:out>
							</input> <br> <br> <input type="radio" name="option9"
								class="option9" value="opt4">
							<c:out value="${exam.opt_4}"></c:out>
							</input> <br> <br>
						</div>
					</c:forEach>
					<button class="big_button next_button" id="ninth_btn">Next</button>
				</div>

				<div class="question_section" id="tenth">
					<c:forEach items="${requestScope.list}" var="exam"
						varStatus="loopCounter" begin="9" end="9">
						<p class="qtn_no">
							Question <label id="qno">10</label>/10
						</p>
						<p class="question">
							<c:out value="${exam.question}"></c:out>
						</p>
						<div class="options">
							<input type="radio" name="option10" value="opt1" class="option10">
							<c:out value="${exam.opt_1}"></c:out>
							</input> <br> <br> <input type="radio" name="option10"
								class="option10" value="opt2">
							<c:out value="${exam.opt_2}"></c:out>
							</input> <br> <br> <input type="radio" name="option10"
								class="option10" value="opt3">
							<c:out value="${exam.opt_3}"></c:out>
							</input> <br> <br> <input type="radio" name="option10"
								class="option10" value="opt4">
							<c:out value="${exam.opt_4}"></c:out>
							</input> <br> <br>
						</div>
					</c:forEach>
				</div>
			</div>
			<input type="submit" class="big_button test_submit_button"
				value="Submit Test" onclick="action='testCompleted.htm'">
		</form>
	</div>
	<script type="text/javascript">
		var mins = 15;

		//calculate the seconds 
		var secs = mins * 60;

		//countdown function is evoked when page is loaded 
		function countdown() {
			setTimeout('Decrement()', 60);
		}

		//Decrement function decrement the value. 
		function Decrement() {
			if (document.getElementById) {
				minutes = document.getElementById("minutes");
				seconds = document.getElementById("seconds");

				//if less than a minute remaining 
				//Display only seconds value. 
				if (seconds < 59) {
					seconds.value = secs;
				}

				//Display both minutes and seconds 
				//getminutes and getseconds is used to 
				//get minutes and seconds 
				else {
					minutes.value = getminutes();
					seconds.value = getseconds();
				}
				//when less than a minute remaining 
				//colour of the minutes and seconds 
				//changes to red 
				if (mins < 5) {
					minutes.style.color = "red";
					seconds.style.color = "red";
				}
				//if seconds becomes zero, 
				//then page alert time up 
				if (mins < 0) {
					alert('Time Up!');
					minutes.value = 0;
					seconds.value = 0;
					document.getElementById("testForm").submit();
					location.href = "testCompleted.htm";
				}
				//if seconds > 0 then seconds is decremented 
				else {
					secs--;
					setTimeout('Decrement()', 1000);
				}
			}
		}

		function getminutes() {
			//minutes is seconds divided by 60, rounded down 
			mins = Math.floor(secs / 60);
			return mins;
		}

		function getseconds() {
			//take minutes remaining (as seconds) away  
			//from total seconds remaining 
			return secs - Math.round(mins * 60);
		}

		document.oncontextmenu = document.body.oncontextmenu = function() {
			return false;
		}

		$(document).ready(function() {
			function disableBack() {
				window.history.forward()
			}

			window.onload = disableBack();
			window.onpageshow = function(evt) {
				if (evt.persisted)
					disableBack()
			}
		});

		var testSection = document.getElementById("startTest");
		document.onkeypress = function(event) {
			event.preventDefault();
			testSection.requestFullscreen();
			return false;
		}

		function off() {
			document.getElementById("overlay").style.display = "none";
			testSection.requestFullscreen();
			testSection.style.display = "block";
			countdown();
		}

		//hide show
		$(".question_section").hide();
		$("#first").show();

		$(".option1").click(function() {
			$("#btn1").addClass('green');
		});

		$(".option2").click(function() {
			$("#btn2").addClass('green');
		});

		$(".option3").click(function() {
			$("#btn3").addClass('green');
		});

		$(".option4").click(function() {
			$("#btn4").addClass('green');
		});

		$(".option5").click(function() {
			$("#btn5").addClass('green');
		});

		$(".option6").click(function() {
			$("#btn6").addClass('green');
		});

		$(".option7").click(function() {
			$("#btn7").addClass('green');
		});

		$(".option8").click(function() {
			$("#btn8").addClass('green');
		});

		$(".option9").click(function() {
			$("#btn9").addClass('green');
		});

		$(".option10").click(function() {
			$("#btn10").addClass('green');
		});

		$("#first_btn").click(function(e) {
			e.preventDefault();

			$("#first").hide();
			$("#second").show();
		});
		$("#second_btn").click(function(e) {
			e.preventDefault();
			$("#second").hide();
			$("#third").show();
		});
		$("#third_btn").click(function(e) {
			e.preventDefault();
			$("#third").hide();
			$("#fourth").show();
		});
		$("#fourth_btn").click(function(e) {
			e.preventDefault();
			$("#fourth").hide();
			$("#fifth").show();
		});
		$("#fifth_btn").click(function(e) {
			e.preventDefault();
			$("#fifth").hide();
			$("#sixth").show();
		});
		$("#sixth_btn").click(function(e) {
			e.preventDefault();
			$("#sixth").hide();
			$("#seventh").show();
		});
		$("#seventh_btn").click(function(e) {
			e.preventDefault();
			$("#seventh").hide();
			$("#eighth").show();
		});
		$("#eighth_btn").click(function(e) {
			e.preventDefault();
			$("#eighth").hide();
			$("#ninth").show();
		});
		$("#ninth_btn").click(function(e) {
			e.preventDefault();
			$("#ninth").hide();
			$("#tenth").show();
		});
		$("#btn1").click(function(e) {
			e.preventDefault();
			$(".question_section").hide();
			$("#first").show();
		});
		$("#btn2").click(function(e) {
			e.preventDefault();
			$(".question_section").hide();
			$("#second").show();
		});
		$("#btn3").click(function(e) {
			e.preventDefault();
			$(".question_section").hide();
			$("#third").show();
		});
		$("#btn4").click(function(e) {
			e.preventDefault();
			$(".question_section").hide();
			$("#fourth").show();
		});
		$("#btn5").click(function(e) {
			e.preventDefault();
			$(".question_section").hide();
			$("#fifth").show();
		});
		$("#btn6").click(function(e) {
			e.preventDefault();
			$(".question_section").hide();
			$("#sixth").show();
		});
		$("#btn7").click(function(e) {
			e.preventDefault();
			$(".question_section").hide();
			$("#seventh").show();
		});
		$("#btn8").click(function(e) {
			e.preventDefault();
			$(".question_section").hide();
			$("#eighth").show();
		});
		$("#btn9").click(function(e) {
			e.preventDefault();
			$(".question_section").hide();
			$("#ninth").show();
		});
		$("#btn10").click(function(e) {
			e.preventDefault();
			$(".question_section").hide();
			$("#tenth").show();
		});
	</script>
</body>
</html>