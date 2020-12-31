package com.anilpatro044.demospring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoSpringApplication {

	public static void main(String[] args) {
		BinarySearchImpl binarySearchImpl=new BinarySearchImpl(new QuickSortAlgoImpl());
		binarySearchImpl.binarySearch(new int[] {12,3,7});
		//SpringApplication.run(DemoSpringApplication.class, args);
	}

}
