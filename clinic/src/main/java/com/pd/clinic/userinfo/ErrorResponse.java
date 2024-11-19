package com.pd.clinic.userinfo;

import lombok.Data;

@Data
public class ErrorResponse {

	private int code;

	private String message;

	private boolean isError;

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public boolean isError() {
		return isError;
	}

	public void setError(boolean isError) {
		this.isError = isError;
	}

	@Override
	public String toString() {
		return "ErrorResponse [code=" + code + ", message=" + message + ", isError=" + isError + "]";
	}
	
	
	
}
