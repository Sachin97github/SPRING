package com.nit.utility;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import org.apache.log4j.Logger;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.engine.jdbc.connections.spi.ConnectionProvider;
import org.hibernate.service.ServiceRegistry;

import com.nit.entity.Admin;
import com.nit.entity.Student;

public class HibernateUtill {
	private static Logger log = Logger.getLogger(HibernateUtill.class);
	private static SessionFactory factory = null;

	static {
		StandardServiceRegistryBuilder builder=null;
		ServiceRegistry registry=null;
		Configuration cfg = null;
		InputStream is = null;
		Properties props = null;
		try {
			is = new FileInputStream("src/main/java/com/nit/commons/hibernate.properties");
			props = new Properties();
			props.load(is);

			cfg = new Configuration();
			cfg.setProperties(props);
            cfg.addAnnotatedClass(Student.class);
            cfg.addAnnotatedClass(Admin.class);
            
            builder=new StandardServiceRegistryBuilder();
            //New Service Class Addded
            builder.addService(ConnectionProvider.class, new UserConnectionProvider());
            registry=builder.applySettings(cfg.getProperties()).build();
          
            
			factory = cfg.buildSessionFactory(registry);

		} catch (IOException ex) {
			ex.printStackTrace();
		}
	}// Static Block

	public static Session getSession() {
		Session ses = null;
		if (factory != null)
			ses = factory.getCurrentSession();
		else
			log.error("Error Fetching Session");
		return ses;
	}
}
