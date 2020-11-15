package com.nt.dao;

import java.util.List;

import com.nt.bo.EmployeeBO;

public interface IEmployeeDAO {
	  
	public List<EmployeeBO> getAllEmployee();
	public int addEmployee(EmployeeBO bo);
	public int deleteEmployee(Integer eno);
	public int updateEmployee(EmployeeBO bo);
	public EmployeeBO getEmpById(int eNo);

}
