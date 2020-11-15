package com.nit.controller;

import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.nit.service.LocaleService;

@Controller
public class LocaleDisplayController {
	
	@Autowired
	private LocaleService service;
	
	@RequestMapping(value="/home" ,method=RequestMethod.GET)
	public String showHome()
	{
		return "home";
	}
	
	@RequestMapping(value="/countries",method=RequestMethod.GET)
	public ModelAndView fetchCountries()
	{
	  ModelAndView mav=null;
      Set<String> countriesSet=null;
	  mav=new ModelAndView();
	  countriesSet=service.getAllCountry();
	  //Add Data Objects To MAV
	   mav.addObject("infoList",countriesSet);
	   mav.addObject("counter",countriesSet.size());
	   mav.addObject("operation",new String("Countries"));
	    //Add View To Object
	   mav.setViewName("show_results");
	   
	  return mav;
	}

}
