package com.nit.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nit.dao.ILoginDAO;
import com.nit.model.User;

public interface ILoginService {
 public String validate(User user);
}
