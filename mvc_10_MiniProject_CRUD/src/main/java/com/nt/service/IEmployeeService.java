package com.nt.service;

import java.util.List;

import com.nt.dto.EmployeeDTO;

public interface IEmployeeService {
          
	public List<EmployeeDTO> fetchAllEmployee();
	public String registerEmployee(EmployeeDTO dto);
	public String removeEmployee(int eno);
	public int updateEmployee(EmployeeDTO dto);
	public EmployeeDTO getEmployeeById(int eNo);
}
