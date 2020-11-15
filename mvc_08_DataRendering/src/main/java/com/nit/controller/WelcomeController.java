package com.nit.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class WelcomeController {
	
	@RequestMapping("/welcome")
	public String processData(Model model)
	{
		
		Set<String> nameInfo=new TreeSet();
		nameInfo.add("SACHIN");
		nameInfo.add("ASHISH");
		nameInfo.add("RAJKUMARI");
		
		Map<String,String> addrInfo=new HashMap();
		addrInfo.put("SACHIN","HYD");
		addrInfo.put("ASHISH","BPL");
		addrInfo.put("RAJKUMARI","MP");
		
		List<Long> contactInfo=new ArrayList();
		contactInfo.add(233333L);
		contactInfo.add(344444L);
		contactInfo.add(55555L);
		
		model.addAttribute("nameInfo",nameInfo);
		model.addAttribute("addrInfo",addrInfo);
		model.addAttribute("contactInfo",contactInfo);

		return "result";
	}

}
