package com.nit.dao;

import java.util.List;

import com.nit.entity.Student;

public interface StudentDAO {
	
	public Integer addStudent(Student entity);
	
	public void deleteStudent(Integer id);
	
	public List<Student> getAllStudent();

}
