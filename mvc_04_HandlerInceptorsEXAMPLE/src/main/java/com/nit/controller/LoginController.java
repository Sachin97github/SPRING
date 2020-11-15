package com.nit.controller;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

import com.nit.service.AdminLoginService;

public class LoginController extends AbstractController {

	@Autowired
	private AdminLoginService service;

	@Override
	protected ModelAndView handleRequestInternal(HttpServletRequest req, HttpServletResponse res) throws Exception {

		ServletContext context = this.getServletContext();
		String name = service.login(req.getParameter("uname"), req.getParameter("pword"));
		if (name != null) {
			context.setAttribute("adminName", name);
			return new ModelAndView("panel");
		} else {
			return new ModelAndView("error", "errorMsg", new String("Some Internal Problem"));
		}
	}

}
