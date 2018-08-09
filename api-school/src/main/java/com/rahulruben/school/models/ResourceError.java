package com.rahulruben.school.models;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class ResourceError {
	private String errorMessage;
	private int errorCode;
	
	public ResourceError() {

	}
	
	public ResourceError(String errorMessage, int errorCode) {
		this.errorMessage = errorMessage;
		this.errorCode = errorCode;
	}

	public String getErrorMessage() {
		return errorMessage;
	}

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}

	public int getErrorCode() {
		return errorCode;
	}

	public void setErrorCode(int errorCode) {
		this.errorCode = errorCode;
	}
	
	
}
