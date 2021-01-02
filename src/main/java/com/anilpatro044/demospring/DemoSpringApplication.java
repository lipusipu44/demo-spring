package com.anilpatro044.demospring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.anilpatro044.demospring.simple.BinarySearchImpl;

@SpringBootApplication
public class DemoSpringApplication {

	/* 
	 * 
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

