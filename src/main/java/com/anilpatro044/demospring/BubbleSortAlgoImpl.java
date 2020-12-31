package com.anilpatro044.demospring;

import org.springframework.stereotype.Component;

@Component
public class BubbleSortAlgoImpl implements SortingAlgo{

	@Override
	public int[] sort(int[] arr) {
		System.out.println("Executing sort of BubbleSort");
		return arr;
	}
	
	

}
