package com.nit.dao;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.simple.SimpleJdbcCall;
import org.springframework.stereotype.Repository;

import com.nit.model.User;

@Repository("dao")
public class LoginDAOImpl implements ILoginDAO {

	@Autowired
	private SimpleJdbcCall sjc;
	
	@Override
	public String authenticate(User user) {
		Map<String,Object> inParams=new HashMap();
		inParams.put("UNAME",user.getUname());
		inParams.put("PWORD",user.getPword());
		sjc.setProcedureName("P_AUTHENTICATION");
		
		Map<String,Object> outParams=sjc.execute(inParams);
		return (String)outParams.get("RESULT");	  
	}

}
