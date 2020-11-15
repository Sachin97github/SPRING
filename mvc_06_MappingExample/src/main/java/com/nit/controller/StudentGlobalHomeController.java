package com.nit.controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("Student") // Global Path
public class StudentGlobalHomeController {

	@RequestMapping("home") //Here Giving "/" is Optional
	public String showHome(Map<String, Object> mapData) {
		mapData.put("username", "Sachin [Student]");
		return "home";
	}
}
