package com.nit.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
//@RequestMapping("/home")
public class ShowHomeController {
	
@RequestMapping(value="/home",method=RequestMethod.GET)
public String getHome(Model model)
{
	model.addAttribute("username","STUDENT METHOD=GET");
	return "home";
}

@RequestMapping(value="/home",method=RequestMethod.POST)
public String  getHome2(Model model)
{
	model.addAttribute("username","EMPLOYEE METHOD = POST");
	return "home";
}

}
