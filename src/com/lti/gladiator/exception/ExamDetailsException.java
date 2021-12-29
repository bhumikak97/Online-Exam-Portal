package com.lti.gladiator.exception;

public class ExamDetailsException extends Exception{

	public ExamDetailsException(String message) {
		super(message);
	}
	
	@Override
	public String getMessage() {
		return "ExamDetailsException: "+super.getMessage();
	}
}
