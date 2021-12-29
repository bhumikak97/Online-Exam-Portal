package com.lti.gladiator.bean;

public class Login {

	private String email, password;

//	Default Constructor
	public Login() {
		super();
	}

//	Parameterized Constructor
	public Login(String email, String password) {
		super();
		this.email = email;
		this.password = password;
	}

//	Getters and Setter
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}
