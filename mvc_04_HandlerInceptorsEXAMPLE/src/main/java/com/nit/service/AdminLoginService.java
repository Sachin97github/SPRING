package com.nit.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.nit.dao.StudentVerficationDAO;

public class AdminLoginService {
	@Autowired
	private StudentVerficationDAO dao;
	
    public String login(String uname,String pword)
    {
    	String adminName=dao.validate(uname, pword);
    	return adminName;
    }
	
}
