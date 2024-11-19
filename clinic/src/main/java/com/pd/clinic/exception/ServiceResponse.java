package com.pd.clinic.exception;

public class ServiceResponse {

    private boolean error;
    private ErrorCode errorCode;
    private String errorMessage;
    private Object data;

    // No-argument constructor
    public ServiceResponse() {
    }

    // All-arguments constructor
    public ServiceResponse(boolean error, ErrorCode errorCode, String errorMessage, Object data) {
        this.error = error;
        this.errorCode = errorCode;
        this.errorMessage = errorMessage;
        this.data = data;
    }

    // Getters and Setters
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

    // Static methods for creating success and failure responses
    public static ServiceResponse asFailure(ErrorCode code, String errorMessage) {
        return new Builder()
                .error(true)
                .errorCode(code)
                .errorMessage(errorMessage)
                .data(null)
                .build();
    }

    public static ServiceResponse asSuccess(Object data) {
        return new Builder()
                .error(false)
                .errorCode(null)
                .errorMessage(null)
                .data(data)
                .build();
    }

    // Builder class to manually create a builder pattern
    public static class Builder {
        private boolean error;
        private ErrorCode errorCode;
        private String errorMessage;
        private Object data;

        public Builder error(boolean error) {
            this.error = error;
            return this;
        }

        public Builder errorCode(ErrorCode errorCode) {
            this.errorCode = errorCode;
            return this;
        }

        public Builder errorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }

        public Builder data(Object data) {
            this.data = data;
            return this;
        }

        public ServiceResponse build() {
            return new ServiceResponse(error, errorCode, errorMessage, data);
        }
    }

    @Override
    public String toString() {
        return "ServiceResponse{" +
                "error=" + error +
                ", errorCode=" + errorCode +
                ", errorMessage='" + errorMessage + '\'' +
                ", data=" + data +
                '}';
    }
}
