package com.nit.controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.nit.model.Employee;

@Controller
@RequestMapping("/employee")
public class EmployeeController {

	@GetMapping("/form")
	public String showHome(@ModelAttribute("empFrm") Employee emp)
	{
		System.out.println("EmployeeController.showHome()");
		emp.setEno(1);
		emp.setEname("Default");
		emp.setAddress("Default Address");
        emp.setSalary(0000.0d);
       	return "form";
	}
	@PostMapping("/register")
	public String showResult(Map<String,Object> map,@ModelAttribute Employee emp)
	{
		System.out.println("EmployeeController.showResult()");
		map.put("emp",emp);
		System.out.println(emp);
		return "result";
	}
}
