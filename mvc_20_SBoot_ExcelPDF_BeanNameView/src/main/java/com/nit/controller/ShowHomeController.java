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
	
	@GetMapping("/excel")
	public String showExcelView()
	{
        System.out.println("Excel View");
      return "excelView";
	}
	
	@GetMapping("/pdf")
	public String showPdflView()
	{
        System.out.println("PDF View");
      return "pdfView";
	}

}
