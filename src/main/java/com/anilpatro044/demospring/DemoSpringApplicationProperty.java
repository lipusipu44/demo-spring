package com.anilpatro044.demospring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.PropertySource;

import com.anilpatro044.propertyRead.PropertyReader;

@SpringBootApplication
@PropertySource("classpath:app.properties")
@ComponentScan("com.anilpatro044.propertyRead")

public class DemoSpringApplicationProperty {
	
	/*
	 * This class takes care of reading property
	 * from property file
	 */
	
	public static void main(String[] args) {
		
		ApplicationContext applicationContext = SpringApplication.run(DemoSpringApplicationProperty.class, args);
		
		PropertyReader propertyReader = applicationContext.getBean(PropertyReader.class);
		
		System.out.println(propertyReader.getPropertyUrl());
		
	}

}
