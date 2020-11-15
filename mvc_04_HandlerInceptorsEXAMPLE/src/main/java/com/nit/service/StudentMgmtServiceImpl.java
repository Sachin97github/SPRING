package com.nit.service;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;

import com.nit.dao.StudentDAO;
import com.nit.dto.StudentDTO;
import com.nit.entity.Student;

public class StudentMgmtServiceImpl implements StudentMgmtService {

	private static Logger log=Logger.getLogger(StudentMgmtServiceImpl.class);
	
	@Autowired
	private StudentDAO dao;
	
   @Override
	public Integer registerStudent(StudentDTO dto) {
	    Student entity=new Student(); 
		BeanUtils.copyProperties(dto,entity);
	    log.info("Student["+entity.getId()+"] Register request");
	    return 	dao.addStudent(entity);
	}

	@Override
	public void removeStudent(Integer id) {
	      dao.deleteStudent(id);	
	      log.info("Student ["+id+"] Deleted");
	}

	@Override
	public List<StudentDTO> fetchAllStudent() {
		// TODO Auto-generated method stub
		return null;
	}

}
