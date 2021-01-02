package com.anilpatro044.demospring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.anilpatro044.demospring.scope.PersonDAO;

@SpringBootApplication

public class DemoSpringApplocationScope {
	
	/*
	 * This branch discuss about proxy for autowired to
	 * negate singleton for dependency injection
	 */
	
	public static void main(String[] args) {
		
		ApplicationContext applicationContext = SpringApplication.run(DemoSpringApplocationScope.class, args);
		
		PersonDAO personDAO = applicationContext.getBean(PersonDAO.class);
		
		PersonDAO personDAO2 = applicationContext.getBean(PersonDAO.class);
		
		System.out.println(personDAO.getJdbcConnection());
		
		System.out.println(personDAO2.getJdbcConnection());
		
	}

}
