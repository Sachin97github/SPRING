package com.nit.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import com.nit.dao.StudentDAO;

public class StudentPanelController implements Controller {

	@Autowired
	 private StudentDAO dao;
	
	@Override
	public ModelAndView handleRequest(HttpServletRequest req, HttpServletResponse res) throws Exception {
	
		
		String reqType=req.getParameter("submitType");
		  if(reqType.equalsIgnoreCase("add"))
			  return new ModelAndView("addStudent");
		  else if(reqType.equalsIgnoreCase("remove"))
			  return new ModelAndView("deleteStudent");
		  else
             return  new ModelAndView("error");
	}

}
