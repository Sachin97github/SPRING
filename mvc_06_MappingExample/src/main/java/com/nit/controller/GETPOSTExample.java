package com.nit.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/GetPostExample")
public class GETPOSTExample {

	@RequestMapping(value="/home",method=RequestMethod.GET)
	public String showHome(Model model)
	{
		model.addAttribute("username","Sachin [req = /home] Method=Get");
		return "home";		
	}
	@RequestMapping(value="/home",method=RequestMethod.POST)
	public String showHome2(Model model)
	{
		model.addAttribute("username","Sachin [req = /home] method=post");
		return "home";		
	}
	
	
}
