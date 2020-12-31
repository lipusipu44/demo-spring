package com.anilpatro044.demospring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BinarySearchImpl {
	
	@Autowired
	private SortingAlgo sortingAlgo;
	
	public void setSortingAlgo(SortingAlgo sortingAlgo) {
		this.sortingAlgo = sortingAlgo;
	}



	public int binarySearch(int[] arr) {
		sortingAlgo.sort(arr);
		System.out.println("Execution of binarySearch completed");
		return 3;
	}
	
	

}
