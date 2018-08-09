package com.rahulruben.school.exceptions;

public class ResourceNotFoundException extends RuntimeException {
	private static final long serialVersionUID = -5260371461532031919L;
	
	public ResourceNotFoundException(String message) {
		super(message);
	}
	
}
