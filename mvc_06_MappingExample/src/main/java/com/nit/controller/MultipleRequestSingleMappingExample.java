package com.nit.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/MultipleRequest")
public class MultipleRequestSingleMappingExample {

	@RequestMapping(value={"/Welcome","/login","/home"})
	public String showHome(Model model)
	{
		model.addAttribute("username","Sachin [req = /Welcome , /login ,/home");
		return "home";		
	}
}
