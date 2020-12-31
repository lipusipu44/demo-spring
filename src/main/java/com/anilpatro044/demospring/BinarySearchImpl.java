package com.anilpatro044.demospring;

public class BinarySearchImpl {
	
	SortingAlgo sortingAlgo;

	public BinarySearchImpl(SortingAlgo sortingAlgo) {
		this.sortingAlgo = sortingAlgo;
	}
	
	public int binarySearch(int[] arr) {
		sortingAlgo.sort(arr);
		System.out.println("Execution of binarySearch completed");
		return 3;
	}
	
	

}
