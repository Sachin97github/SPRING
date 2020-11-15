package com.nit.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

import com.nit.service.WishMsgGeneratorService;

public class ShowMessageController extends AbstractController {

	 private WishMsgGeneratorService service;

	 public ShowMessageController(WishMsgGeneratorService service) {
		super();
		this.service = service;
	}
	 
	public ShowMessageController() {
		super();
	}




	@Override
	protected ModelAndView handleRequestInternal(HttpServletRequest request, HttpServletResponse response)
			throws Exception {

		    String msg=service.generateMsg();	
		     return new ModelAndView("welcome","msg",msg);
	}

}
