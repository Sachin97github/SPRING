package com.nit.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(code=HttpStatus.INTERNAL_SERVER_ERROR)
public class Code500Exception extends RuntimeException {

	public Code500Exception() {
		super();
	}

	public Code500Exception(String message) {
		super(message);
	}
	
	

}
