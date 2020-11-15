package com.nt.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.nt.model.Product;

@Controller
public class ShowProductController {
	
	@GetMapping("/register")
	public String showForm(@ModelAttribute Product prd)
	{
		prd.setId(0);
		prd.setName("Default");
		prd.setPrice(8900d);
		prd.setQuantity("DefaultQuantity");
	    return "form";
	}
	
	@PostMapping("/register")
	public String showData(@ModelAttribute("product") Product prd)
	{
		System.out.println(prd);
	    return "result";
	}
	

}
