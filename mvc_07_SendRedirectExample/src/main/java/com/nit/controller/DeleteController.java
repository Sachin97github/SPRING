package com.nit.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class DeleteController {
	
	@RequestMapping("/delete")
	public String showHome()
	{
	   System.out.println("DeleteController.showHome()");
	   return "redirect:home";
	}
	

}
