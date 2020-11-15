package com.nit.service;

import org.springframework.stereotype.Service;

import com.nit.exception.Code400Exception;
import com.nit.exception.Code408Exception;
import com.nit.exception.Code500Exception;
import com.nit.exception.GlobalException;

@Service
public class ExceptionRaisingService {
	
	public String raise(Boolean flag,String message) throws Exception
	{
		if(flag)
	          throw new Exception(message);
		return "Exception Raising Disabled";
	}
	
	public void raiseExceptionByCode(Integer code)
	{
		if(code==400)
			throw new Code400Exception();
		else if(code==408)
			throw new Code408Exception();
		else if(code==500)
			throw new Code500Exception();
		else
			throw new GlobalException("Global Exception Raised");
		
	}
	
}
