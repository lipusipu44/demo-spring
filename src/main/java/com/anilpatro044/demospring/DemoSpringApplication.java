package com.anilpatro044.demospring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class DemoSpringApplication {

	/* 
	 * what are beans - @component
	 * What are the dependencies for that bean - @autoweired
	 * Where to Search for beans
	 */
	/*
	 * Spring applicationcontext would maintain all the beans
	 */
	public static void main(String[] args) {
		
		//ApplicationContext
		
		ApplicationContext applicationContext = SpringApplication.run(DemoSpringApplication.class, args);
		
		BinarySearchImpl binarySearchImpl = applicationContext.getBean(BinarySearchImpl.class);
		
		binarySearchImpl.binarySearch(new int[] {12,3,7});
	}

}

