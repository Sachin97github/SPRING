package com.nit.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.nit.service.GreetMsgService;

@Controller
public class GreetController {
	
	@Autowired
	//@Qualifier("service")
	private GreetMsgService service;
	@GetMapping("/home")
	public String showHome()
	{
		return "home";
	}
	
	@GetMapping("/greet")
	public String showGreetMsg(Map<String,Object> map)
	{
		String msg=service.greetMsg();
		map.put("msg",msg);
		return "greeting";
	}
	
	
	
	
	

}
