package com.nit.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.nit.dto.MobileDTO;
import com.nit.service.IMobileService;

@Controller
@RequestMapping("/mobile")
public class MobileController {
	
	@Autowired
	private IMobileService service;
	
	@GetMapping("/home")
	public String showHome(Map<String,Object> map)
	{
		map.put("mobileList",getAllMobile());
		return "home";
	}
	
	
	@GetMapping("/form")
	public String showForm(@ModelAttribute("mobile") MobileDTO dto)
	{
		System.out.println("GET MODE - form");
		dto.setSno(0);
		dto.setModel("MI");
		dto.setCompany("XIOAMI");
		dto.setPrice(15000.0f);
		return "addForm";
	}
	
	@PostMapping("/form")
	public String registerMobile(Map<String,Object> map,@ModelAttribute("mobile") MobileDTO dto)
	{
		Integer sno;
		System.out.println("POST MODE - form");
		sno=service.addMobile(dto);
		map.put("resultMsg","Mobile "+sno+" Added Succesfully");
		map.put("mobileList",getAllMobile());
		return "home";
	}
	
	@GetMapping("/edit")
	public String editGetMobile(@RequestParam("sno") Integer sno,@ModelAttribute MobileDTO dto)
	{
	  dto=service.getMobileBySno(sno);
	  return "editForm";
     }
	
	@PostMapping("/edit")
	public String editMobile(Map<String,Object> map,@ModelAttribute MobileDTO dto)
	{
	   service.updateMobile(dto);
	   map.put("resultMsg", "Mobile "+dto.getSno()+" updated");
	   map.put("mobileList",getAllMobile());
	   return "home";
	}
	@GetMapping("/delete")
	public String deleteMobile(Map<String,Object> map,@RequestParam("sno") Integer sno)
	{
	   service.deleteMobile(sno);
	   map.put("resultMsg", "Mobile "+sno+" deleted");
	   map.put("mobileList",getAllMobile());
	   return "home";
	   }
	
	public List<MobileDTO> getAllMobile()
	{
		  return service.getAllMobile();
	}
	
}
