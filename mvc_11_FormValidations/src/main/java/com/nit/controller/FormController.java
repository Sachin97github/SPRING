package com.nit.controller;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.nit.validator.EmployeeValidator;

import model.Employee;

@Controller
public class FormController {
	
	@Autowired
	private EmployeeValidator validator;
	
	@GetMapping("/form.htm")      //If frm attribute is employee (Bean name) then modelAtt name not Required
	public String getForm(@ModelAttribute Employee emp)
	{
		emp.setEno(1);
        emp.setEname("Loser");
        emp.setSal(75000);
        emp.setDeptno(10);
		return "form";
	}
	
	@PostMapping("/form.htm")                                             //BindingResult Should be after modelAttribbtue
	public String postForm(Map<String,Object> map,@ModelAttribute Employee emp,BindingResult error)
	{
		System.out.println("Post Mapping");
		if(emp.getScriptStatus().equalsIgnoreCase("disabled"))
		{
			System.out.println("Backend Form Validation Enabled");
			  if(validator.supports(Employee.class))
			    	validator.validate(emp, error);
			    
			    if(error.hasErrors())
			    	 return "form";
		}
	  
	   map.put("resultObj",emp);
		return "success";		
	}
	
	
	@ModelAttribute("deptNumbers")
	public List<Integer> getDeptNumbers()
	{
		return Arrays.asList(10,20,30,40);
	}
	
	
	

}
