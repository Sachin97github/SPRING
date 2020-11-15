package com.nit.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nit.dao.ILoginDAO;
import com.nit.model.User;

@Service("service")
public class LoginServiceImpl implements ILoginService {

	@Autowired
	private ILoginDAO dao;
	
	@Override
	public String validate(User user) {
		  return dao.authenticate(user);
	}

}
