package com.nit.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.nit.model.User;
import com.nit.service.ILoginService;

@Controller
public class FormController {
	
	@Autowired
	private ILoginService service;
	
	@GetMapping("/form")
	public String showGetForm(@ModelAttribute User user)
	{
		return "form";
	}

	@PostMapping("/form")
	public String showForm(Map<String,Object> map,@ModelAttribute User user)
	{
		String result=service.validate(user);
		map.put("resultMsg",result);
		return "result";
	}

}
