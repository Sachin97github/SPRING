package com.nit.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/MyController")
public class MyControllerExample {

	@RequestMapping("/home")
	public String showHome(Model model)
	{
		model.addAttribute("username","Sachin [req = /home]");
		return "home";		
	}
	@RequestMapping("/HOME")
	public String showHome2(Model model)
	{
		model.addAttribute("username","Sachin [req = /HOME]");
		return "home";		
	}
	
	
}
