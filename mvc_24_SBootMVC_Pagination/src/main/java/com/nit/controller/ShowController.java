package com.nit.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.nit.dto.MobileDTO;
import com.nit.service.IMobileService;

@Controller
public class ShowController {
	
	@Autowired
	private IMobileService service;
	
	@GetMapping("/home")
	public String showHome()
	{
		System.out.println("ShowController.showHome()");
		return "home";
	}	
	
	@GetMapping("/mobilePage")
	public String  showPage(Map<String,Object> map,@PageableDefault(page=0,size=4,sort="model",direction=Direction.ASC) Pageable pageable)
	{
		System.out.println("MOBILE PAGE");
		Page<MobileDTO> pageDTO=service.getAllByPage(pageable);
		pageDTO.getContent().forEach(System.out::println);
		map.put("page",pageDTO);
		return "showPage";
	}
}
