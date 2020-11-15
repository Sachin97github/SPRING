package com.nit.controller;

import java.util.Set;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

import com.nit.service.ShowCountriesService;

public class ShowCountriesController  extends  AbstractController{

	private ShowCountriesService service;
	public ShowCountriesController() {
		super();
	}
 public ShowCountriesController(ShowCountriesService service) {
		super();
		this.service = service;
	}



	@Override
	protected ModelAndView handleRequestInternal(HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		
		Set<String> countries=service.getCountries();
		
		return new ModelAndView("showCountries"," countries", countries);
	}

}
