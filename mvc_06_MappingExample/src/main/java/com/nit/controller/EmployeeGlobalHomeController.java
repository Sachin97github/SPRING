package com.nit.controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("Employee") // Global Path
public class EmployeeGlobalHomeController {

	//OverAll path is   /Employee/home
	@RequestMapping("home") //Here Giving "/" is Optional
	public String showHome(Map<String, Object> mapData) {
		mapData.put("username", "Sachin [Emplyoee]");
		return "home";
	}
}
