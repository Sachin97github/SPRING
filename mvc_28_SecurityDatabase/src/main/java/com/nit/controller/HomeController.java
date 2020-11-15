package com.nit.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HomeController {

	@RequestMapping(value="/home",method=RequestMethod.GET)
	public String showHome()
	{
		System.out.println("HOME");
		return "home";
	}
	
	@RequestMapping(value="/welcome",method=RequestMethod.GET)
	public String welcome()
	{
		return "welcome";
	}
	
	
	
}
