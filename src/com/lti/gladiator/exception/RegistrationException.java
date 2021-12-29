package com.lti.gladiator.exception;

public class RegistrationException extends Exception{

	public RegistrationException(String message) {
		super(message);
	}
	
	@Override
	public String getMessage() {
		return "RegistrtionException: "+super.getMessage();
	}
}
