package com.nit.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.nit.entity.Student;

@Controller
public class ListShoWController {

	@RequestMapping("/welcome2")
	public String processData(Model model) {
		List<Student> studList = Arrays.asList(new Student("1", "SACHIN", "HYD"), new Student("2", "Sach", "BPL"),
				new Student("3", "ASHISH", "DLH"));

		model.addAttribute("studList", studList);
		return "result2";

	}

}
