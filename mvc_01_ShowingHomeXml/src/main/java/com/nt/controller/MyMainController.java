package com.nt.controller;

import java.util.Date;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

public class MyMainController implements Controller {

	@Override
	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
		
		return new ModelAndView("home","sysDate",new Date());
		 // result = view Name that will given to View Resolver to make a View Object having location  of physicial view comp <Prefix suffix>
		//sysDate == request scope name of parameter
		//new Date() data
		
	}

}
