package com.nit.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(code=HttpStatus.BAD_REQUEST)
public class Code400Exception extends RuntimeException {

	public Code400Exception() {
		super();
	}

	public Code400Exception(String message) {
		super(message);
	}
	
	

}
