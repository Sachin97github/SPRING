package com.nit.dao;

import java.util.List;

import org.hibernate.Session;

import com.nit.entity.Student;

public class StudentDAOImpl implements StudentDAO {

	private Session ses=null;
	
	@Override
	public Integer addStudent(Student entity) {
	     Integer rstId=null;
	     rstId=(Integer)ses.save(entity);
         return rstId;
	}
	@Override
	public void deleteStudent(Integer id) {
		 boolean flg=false;
		 ses.remove(id);
	}

	@Override
	public List<Student> getAllStudent() {
		return null;
	}

}
