package com.utils;


public class SomeTechException extends Exception {

	private static final long serialVersionUID = 123L;

	public SomeTechException() {
	}
	public SomeTechException(Throwable cause) {
		super(cause);
	}
 
	public SomeTechException(String message) {
		super(message);
	}
 
	public SomeTechException(String message, Throwable cause) {
		super(message, cause);
	}
	// constructor
}