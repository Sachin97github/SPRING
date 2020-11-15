package com.nit.controller;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ServletContextSrvltConfigINJECTEDController {
	
    @Autowired
	private ServletContext context;
    @Autowired
    private ServletConfig config;
    //Only One Servlet is there in Spring MVC = DispatcherServlet
	
	@RequestMapping("form2")
	public String showHome(HttpServletRequest req,HttpServletResponse res)
	{
		System.out.println("Servlet Name - "+config.getServletName());
		System.out.println("Srevlet Config - "+config.getClass());
		
		System.out.println("Context - "+context.getServletContextName());
		System.out.println("Context - "+context.getContextPath());
		
		req.setAttribute("username","SACHIN [BY REQUEST PARAMETER]");
		return "home";
		
		
	}
	

}
