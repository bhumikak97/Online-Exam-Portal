package com.lti.gladiator.exception;

public class ReportException extends Exception{

	public ReportException(String message) {
		super(message);
	}
	
	@Override
	public String getMessage() {
		return "ReportException: "+super.getMessage();
	}
}
