package com.anilpatro044.demospring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BinarySearchImpl {
	
	@Autowired
	private SortingAlgo quickSortAlgoImpl;
	
	public void setSortingAlgo(SortingAlgo sortingAlgo) {
		this.quickSortAlgoImpl = sortingAlgo;
	}



	public int binarySearch(int[] arr) {
		quickSortAlgoImpl.sort(arr);
		System.out.println("Execution of binarySearch completed");
		return 3;
	}
	
	

}
