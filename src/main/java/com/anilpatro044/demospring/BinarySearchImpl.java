package com.anilpatro044.demospring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class BinarySearchImpl {
	
	@Autowired
	@Qualifier("bubble")
	private SortingAlgo sortAlgoImpl;
	
	public void setSortingAlgo(SortingAlgo sortingAlgo) {
		this.sortAlgoImpl = sortingAlgo;
	}



	public int binarySearch(int[] arr) {
		sortAlgoImpl.sort(arr);
		System.out.println("Execution of binarySearch completed");
		return 3;
	}
	
	

}
