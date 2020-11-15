package com.nit.validator;

import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import model.Employee;

@Component
public class EmployeeValidator implements Validator {

	@Override
	public boolean supports(Class<?> clazz) {
		// To check whether Class is Assignable or Not
		   return clazz.isAssignableFrom(Employee.class);
	}
	@Override
	public void validate(Object target, Errors errors) {
		Employee emp=new Employee();
		emp=(Employee)target;
		
		if(emp.getEname()==null)
		{
			// ename <Path name > "---------"  <msg>
			errors.rejectValue("ename","emp.ename.required");
			                                           //Properties s
		}
		else if(emp.getEname().length()<5 || emp.getEname().length()>10)
			errors.rejectValue("ename","emp.ename.length");
		
	    if(emp.getSal()==null)
			errors.rejectValue("sal","emp.sal.required");
	    else if(emp.getSal()<10000)
            errors.rejectValue("sal","emp.sal.length");	
		}
}
