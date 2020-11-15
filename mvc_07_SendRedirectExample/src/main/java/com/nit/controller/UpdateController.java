package com.nit.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class UpdateController {
	
	@RequestMapping("/update")
	public String showHome()
	{
	  System.out.println("UpdateController.showHome()");
	   return "redirect:home";
	}
	

}
