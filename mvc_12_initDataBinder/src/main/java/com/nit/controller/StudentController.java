package com.nit.controller;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;

import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.ServletRequestDataBinder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.nit.model.Student;

@Controller
public class StudentController {

	@GetMapping("/form.htm")
	public String showForm(@ModelAttribute("stdFrm") Student std)
	{
		std.setSno(1);
		std.setName("Sachin");
		std.setAddress("Bhopal");
		std.setDob(new Date());
		std.setPer(75.6f);
		return "form";
	}
	
	@PostMapping("/form.htm")
	public String showPostForm(Map<String,Object> map,@ModelAttribute("stdFrm") Student std) throws ParseException
	{
	   System.out.println(std);
	   SimpleDateFormat format=new SimpleDateFormat("dd-mm-yyyy");
	   Date date= format.parse(format.format(std.getDob()));
	   System.out.println(date);
	   std.setDob(date);
	   map.put("stdInfo",std);
	   return "sucess";
	}
	
	@InitBinder
	public void myInitBinder(ServletRequestDataBinder binder)
	{
		System.out.println("StudentController.myInitBinder()");
		SimpleDateFormat format=new SimpleDateFormat("dd-mm-yyyy");
		binder.registerCustomEditor(Date.class,new CustomDateEditor(format,true));
		
	}
	
	
}
