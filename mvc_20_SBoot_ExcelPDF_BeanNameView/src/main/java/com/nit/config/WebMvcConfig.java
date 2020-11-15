package com.nit.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.view.BeanNameViewResolver;

@Configuration
public class WebMvcConfig {
	
 @Bean
	public BeanNameViewResolver getBNVR()
	{
		return new BeanNameViewResolver();
	}
	
}
