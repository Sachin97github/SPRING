package com.nit.dao;

import javax.persistence.Query;

import org.hibernate.Session;

import com.nit.utility.HibernateUtill;

public class StudentVerficationDAOImpl implements StudentVerficationDAO {

	private static String VALIDATION_QUERY="SELECT ADMINNAME FROM ADMIN_TAB WHERE USERNAME=? AND PASSWORD=?";
    private Session ses=null;
    
	@Override
	public String validate(String uname, String pword) {
          ses=HibernateUtill.getSession();
         Query query=ses.createNativeQuery( VALIDATION_QUERY, String.class).setParameter(1,uname).setParameter(2,pword);    
         System.out.println("StudentVerficationDAOImpl.validate()");
		return (String)query.getSingleResult();
	}

}
