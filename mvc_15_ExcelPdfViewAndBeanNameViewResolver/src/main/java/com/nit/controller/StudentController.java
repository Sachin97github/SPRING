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

	@GetMapping("/home.htm")
	public String showHome()
	{
		System.out.println("StudentController.showHome()");
		return "home";
	}
	
	@GetMapping("reportPdf")
	public String showPDFView()
	{
		System.out.println("StudentController.showPDFView()");
		return "pdfView";
	}

	@GetMapping("/reportExcel")
	public String showExcelView()
	{
		System.out.println("StudentController.showExcelView()");
		return "pdfView";
	}


}
