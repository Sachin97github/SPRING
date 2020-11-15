package com.nit.controller;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ShowHomeController {
		
	@GetMapping("/home")
	public String showHome()
	{
		System.out.println("Home Get Mapping");
		return "home";
	}
	
	@GetMapping("/browser")
	public String getBrowserName(Map<String,Object> map,HttpServletRequest req)
	{
         String brName= req.getHeader("user-agent");
         map.put("brName",brName);
		return "result";
	}

}
