package com.nit.intializer;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.ContextLoaderListener;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

import com.nit.config.RootAppConfig;
import com.nit.config.WebMvcConfig;

public class MyWebIntializer implements WebApplicationInitializer {

	@Override
	public void onStartup(ServletContext sc) throws ServletException {
	
		
		AnnotationConfigWebApplicationContext parentCtx=new AnnotationConfigWebApplicationContext();
		parentCtx.register(RootAppConfig.class);	
		
		ContextLoaderListener listener=new ContextLoaderListener(parentCtx);
		sc.addListener(listener);
		
		AnnotationConfigWebApplicationContext childCtx=new AnnotationConfigWebApplicationContext();
		childCtx.register(WebMvcConfig.class);
		
		DispatcherServlet ds=new DispatcherServlet(childCtx);
		ServletRegistration.Dynamic dyna=sc.addServlet("dispatcher",ds);
		
		dyna.addMapping("/");
		dyna.setLoadOnStartup(2);		
	}//Method

}
