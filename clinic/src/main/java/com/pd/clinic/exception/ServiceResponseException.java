package com.pd.clinic.exception;

public class ServiceResponseException extends Exception {

	public ServiceResponseException(String message) {
		super(message);
	}

	public ServiceResponseException(String message, Throwable cause) {
		super(message, cause);
	}

}