package com.nit.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(code=HttpStatus.REQUEST_TIMEOUT)
public class Code408Exception extends RuntimeException {

	public Code408Exception() {
		super();
	}

	public Code408Exception(String message) {
		super(message);
	}
	
	

}
