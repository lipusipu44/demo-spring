package com.anilpatro044.demospring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import com.anilpatro044.componentscan.ComponentDAO;

@SpringBootApplication
@ComponentScan("com.anilpatro044.componentscan")
public class DemoSpringApplicationComponent {
	
	public static void main(String[] args) {
		
		ApplicationContext applicationContext = SpringApplication.run(DemoSpringApplicationComponent.class, args);
		
		ComponentDAO componentDAO = applicationContext.getBean(ComponentDAO.class);
		
		componentDAO.getCompnentJdbcDAO();
		
	}

}
