package com.pd.clinic.exception;


import lombok.Data;

@Data
public class GetServiceResponse {

	private boolean error;

	private ErrorCode errorCode;

	private String errorMessage;

	private Object data;

	public boolean isError() {
		return error;
	}

	public void setError(boolean error) {
		this.error = error;
	}

	public ErrorCode getErrorCode() {
		return errorCode;
	}

	public void setErrorCode(ErrorCode errorCode) {
		this.errorCode = errorCode;
	}

	public String getErrorMessage() {
		return errorMessage;
	}

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}

	public Object getData() {
		return data;
	}

	public void setData(Object data) {
		this.data = data;
	}

	@Override
	public String toString() {
		return "GetServiceResponse [error=" + error + ", errorCode=" + errorCode + ", errorMessage=" + errorMessage
				+ ", data=" + data + "]";
	}
	
	

}
