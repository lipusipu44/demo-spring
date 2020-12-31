package com.anilpatro044.demospring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class DemoSpringApplication {

	/* 
	 * what are beans - @component, @primary
	 * What are the dependencies for that bean - @autoweired
	 * This case we have used setter injection instead of constructor
	 * Where to Search for beans
	 */

	/*
	 * Spring applicationcontext would maintain all the beans,
	 * this case we are using @primary to define primary component
	 */
	public static void main(String[] args) {

		//ApplicationContext

		ApplicationContext applicationContext = SpringApplication.run(DemoSpringApplication.class, args);

		BinarySearchImpl binarySearchImpl = applicationContext.getBean(BinarySearchImpl.class);

		binarySearchImpl.binarySearch(new int[] {12,3,7});
	}

}

