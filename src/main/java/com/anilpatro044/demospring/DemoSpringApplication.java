package com.anilpatro044.demospring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DemoSpringApplication {

	/* 
	 * In this step we will check about singleton and prototype
	 * of bean
	 */

	
	public static void main(String[] args) {

		//ApplicationContext

		ApplicationContext applicationContext = SpringApplication.run(DemoSpringApplication.class,args);
		
		BinarySearchImpl binarySearchImpl = applicationContext.getBean(BinarySearchImpl.class);
		
		BinarySearchImpl binarySearchImpl1 = applicationContext.getBean(BinarySearchImpl.class);
		
		System.out.println(binarySearchImpl==binarySearchImpl1);

		binarySearchImpl.binarySearch(new int[] {12,3,7});
	}

}

