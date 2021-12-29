package com.lti.gladiator.exception;

public class ExamException extends Exception{

	public ExamException(String message) {
		super(message);
	}
	
	@Override
	public String getMessage() {
		return "ExamException: "+super.getMessage();
	}
}
