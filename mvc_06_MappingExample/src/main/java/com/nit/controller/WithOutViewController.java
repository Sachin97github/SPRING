package com.nit.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/Manager") // Global Path
public class WithOutViewController {
  
	@RequestMapping("/home")
	public Map<String, String> showHome() {
		Map<String, String> map = new HashMap();
		map.put("username", "Sachin [Manager]");
		//Here View name is not given So it /will look for  
		//=> /Manager/home
		//Manager == folder
		//home == jsp file{under /manager Folder}
		
		return map;
	}

}
