var citiesByState = {
	Maharashtra : [ "Mumbai", "Pune", "Nagpur", "Nashik" ],
	Karnataka : [ "Bengaluru", "Mysore", "Cuttack", "Ooty" ],
	Kerala : [ "Kochi", "Kannur", "Palakkad", "Thrissur" ],
	TamilNadu : [ "Chennai", "Coimbatore", "Tiruchirappalli" ]
}

function makeSubmenu(value) {
	if (value.length == 0)
		document.getElementById("city").innerHTML = "<option></option>";
	else {
		var citiesOptions = "";
		for (cityId in citiesByState[value]) {
			citiesOptions += "<option>" + citiesByState[value][cityId]
					+ "</option>";
		}
		document.getElementById("city").innerHTML = citiesOptions;
	}
}

function disablePaste() {
	const inp = document.getElementById('txtInput');
	inp.onpaste = function(e) {
		e.preventDefault();
	}
}

function Captcha() {
	var alpha = new Array('A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J',
			'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W',
			'X', 'Y', 'Z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9',
			'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm',
			'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z');
	var i;
	for (i = 0; i < 6; i++) {
		var a = alpha[Math.floor(Math.random() * alpha.length)];
		var b = alpha[Math.floor(Math.random() * alpha.length)];
		var c = alpha[Math.floor(Math.random() * alpha.length)];
		var d = alpha[Math.floor(Math.random() * alpha.length)];
		var e = alpha[Math.floor(Math.random() * alpha.length)];
		var f = alpha[Math.floor(Math.random() * alpha.length)];
		var g = alpha[Math.floor(Math.random() * alpha.length)];
	}
	var code = a + b + c + d + e + f + g;
	document.getElementById("mainCaptcha").value = code
}

function validateLogin() {
	var login_id = document.forms["login_form"]["email"].value;
	var login_pwd = document.forms["login_form"]["password"].value;

	var login_id_error = document.getElementById('loginId_error');
	var login_pwd_error = document.getElementById('loginPassword_error');

	if (login_id == "null" || login_id == "") {
		login_id_error.innerHTML = reqd_error;
		error_flag = false;
	} else {
		login_id_error.innerHTML = "";
	}

	if (login_pwd == "null" || login_pwd == "") {
		login_pwd_error.innerHTML = reqd_error;
		error_flag = false;
	} else {
		login_pwd_error.innerHTML = "";
	}

	return error_flag;
}

function validateAdminLogin() {
	var login_id = document.forms["admin_login_form"]["email"].value;
	var login_pwd = document.forms["admin_login_form"]["password"].value;

	var login_id_error = document.getElementById('adminLoginId_error');
	var login_pwd_error = document.getElementById('adminLoginPassword_error');

	if (login_id == "null" || login_id == "") {
		login_id_error.innerHTML = reqd_error;
		error_flag = false;
	} else {
		login_id_error.innerHTML = "";
	}

	if (login_pwd == "null" || login_pwd == "") {
		login_pwd_error.innerHTML = reqd_error;
		error_flag = false;
	} else {
		login_pwd_error.innerHTML = "";
	}

	return error_flag;
}


function validateRegistration() {
	var error_flag = true;
	var reqd_error = "This field cannot be empty";

	var username = document.forms["registration_form"]["name"].value;
	var email_id = document.forms["registration_form"]["email"].value;
	var mobno = document.forms["registration_form"]["mob_number"].value;
	var qual = document.forms["registration_form"]["qualification"].value;
	var yoc = document.forms["registration_form"]["year_of_completion"].value;
	var state = document.forms["registration_form"]["state"].value;
	var city = document.forms["registration_form"]["city"].value;
	var dob = document.forms["registration_form"]["dob"].value;
	var mainCap = document.forms["registration_form"]["mainCaptcha"].value;
	var enteredCap = document.forms["registration_form"]["userCaptcha"].value;
	var pwd = document.forms["registration_form"]["password"].value;
	var cpwd = document.forms["registration_form"]["confirm_password"].value;

	var name_error = document.getElementById('name_err');
	var email_error = document.getElementById('email_err');
	var mobno_error = document.getElementById('mobno_err');
	var qual_error = document.getElementById('qual_err');
	var yoc_error = document.getElementById('yoc_err');
	var state_error = document.getElementById('state_err');
	var city_error = document.getElementById('city_err');
	var dob_error = document.getElementById('dob_err');
	var pwd_error = document.getElementById('pwd_err');
	var cpwd_error = document.getElementById('cpwd_err');
	var captcha_error = document.getElementById('captcha_err');

	if (username == "null" || username == "") {
		name_error.innerHTML = reqd_error;
		error_flag = false;
	} else {
		name_error.innerHTML = "";
	}

	if (email_id == "null" || email_id == "") {
		email_error.innerHTML = reqd_error;
		error_flag = false;
	} else {
		email_error.innerHTML = "";
	}

	if (mobno == "null" || mobno == "") {
		mobno_error.innerHTML = reqd_error;
		error_flag = false;
	} else {
		mobno_error.innerHTML = "";
	}

	if (qual == "" || qual == "null") {
		qual_error.innerHTML = "Please select your qualification";
		error_flag = false;
	} else {
		qual_error.innerHTML = "";
	}

	if (state == "" || state == "null") {
		state_error.innerHTML = "Please select your State";
		error_flag = false;
	} else {
		state_error.innerHTML = "";
	}
	if (city == "" || city == "null") {
		city_error.innerHTML = "Please select your City";
		error_flag = false;
	} else {
		city_error.innerHTML = "";
	}

	if (yoc == "null" || yoc == "") {
		yoc_error.innerHTML = reqd_error;
		error_flag = false;
	} else {
		yoc_error.innerHTML = "";
	}

	if (dob == "null" || dob == "") {
		dob_error.innerHTML = reqd_error;
		error_flag = false;
	} else {
		dob_error.innerHTML = "";
	}

	if (pwd == "null" || pwd == "") {
		pwd_error.innerHTML = reqd_error;
		error_flag = false;
	} else {
		pwd_error.innerHTML = "";
	}

	if (cpwd == "null" || cpwd == "") {
		cpwd_error.innerHTML = reqd_error;
		error_flag = false;
	} else {
		cpwd_error.innerHTML = "";
	}

	if (enteredCap == "null" || enteredCap == "") {
		captcha_error.innerHTML = reqd_error;
		error_flag = false;
	} else {
		captcha_error.innerHTML = "";
	}

	if (cpwd != "" && cpwd != pwd) {
		cpwd_error.innerHTML = "Confirm Password should match Password";
		error_flag = false;
	} else {
		cpwd_error.innerHTML = "";
	}

	if (mainCap != enteredCap) {
		captcha_error.innerHTML = "Captcha is not correct";
		error_flag = false;
	} else {
		captcha_error.innerHTML = "";
	}

	return error_flag;
}
