package com.nit.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

public class GlobalException extends RuntimeException {

	public GlobalException() {
		super();
	}

	public GlobalException(String message) {
		super(message);
	}
	
	

}
