package com.nit.service;

import java.util.List;

import com.nit.dto.StudentDTO;

public interface StudentMgmtService {
	
	public Integer registerStudent(StudentDTO dto);
	
	public void removeStudent(Integer id);
	
	public List<StudentDTO> fetchAllStudent();

}
