package com.nt.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.nt.dto.EmployeeDTO;
import com.nt.service.IEmployeeService;

@Controller
public class EmployeeMgmtController {
	
	@Autowired
	 private IEmployeeService service;

	@GetMapping("/welcome.htm")
	public String showHome()
	{
		System.out.println("EmployeeMgmtController.showHome()");
		return "home";
	}
	
	//<a> tag == Get Request
	@GetMapping("/listEmp.htm")
	public String showListEmp(Map<String,Object> map)
	{
		 List<EmployeeDTO> listDTO=service.fetchAllEmployee();
		 map.put("listEmp",listDTO);
	     return "show_emp";
	}

	@GetMapping("/addEmp.htm")
	public String showAddEmpForm(@ModelAttribute("empFrm") EmployeeDTO dto)
	{
		System.out.println("Intial Phase Request");
		return "add_emp";
	}
	 
	@PostMapping("/addEmp.htm")
	public String registerEmp(RedirectAttributes map,@ModelAttribute("empFrm") EmployeeDTO dto)
	{
         System.out.println(dto);
         String msg=service.registerEmployee(dto);
         List<EmployeeDTO> listDTO=service.fetchAllEmployee();
		 /*map.put("resultMsg",msg);
		 map.put("listEmp",listDTO);*/
         
         map.addFlashAttribute("resultMsg",msg);         
		return "redirect:listEmp.htm";
	}
	
	@GetMapping("/deleteEmp.htm")
	public String removeEmployee(RedirectAttributes map,@RequestParam("eno") int eno)
	{
		String msg=service.removeEmployee(eno);
		map.addFlashAttribute("resultMsg",msg);
		return "redirect:listEmp.htm";
	}
	
	@GetMapping("/editEmp.htm")                      //MANDATORY
	public  String showEditPage(@ModelAttribute("empFrm2") EmployeeDTO empFrm,@RequestParam("eno") int eNo)
	{
		System.out.println("Controller :: editEmp.htm ( get Mapping ) : "+empFrm);
        empFrm=service.getEmployeeById(eNo);
    	System.out.println("Controller :: editEmp.htm ( get Mapping ) Result = : "+empFrm);
		return "edit_emp";
	}
	
  @PostMapping("/editEmp.htm")
	public String updateEmployee(RedirectAttributes map,@ModelAttribute("empFrm2") EmployeeDTO dto)
	{
	     System.out.println("Controller :: editEmp.htm ( Post Mapping ) : "+dto);
		 int count=service.updateEmployee(dto);
		map.addFlashAttribute("resultMsg","Employee Updated");
        return "redirect:listEmp.htm";
	}	
	@ModelAttribute("deptNoFrm")
	public List<Integer> getDeptNo()
	{
		List<Integer> list=new ArrayList();
		list.add(10);list.add(20);list.add(30);list.add(40);
		return list;
	}
	
}
