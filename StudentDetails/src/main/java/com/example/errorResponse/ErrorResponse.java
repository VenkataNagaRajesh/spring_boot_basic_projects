package com.example.errorResponse;

import org.springframework.http.HttpStatus;

public class ErrorResponse {
	  private HttpStatus statusCode;
	    private String message;
	 
	    public ErrorResponse(String message)
	    {
	        super();
	        this.message = message;
	    }

		public ErrorResponse(HttpStatus conflict, String message) {
			super();
			this.statusCode = conflict;
			this.message = message;
		}

		public HttpStatus getStatusCode() {
			return statusCode;
		}

		public void setStatusCode(HttpStatus statusCode) {
			this.statusCode = statusCode;
		}

		public String getMessage() {
			return message;
		}

		public void setMessage(String message) {
			this.message = message;
		}
}
