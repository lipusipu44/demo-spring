package com.anilpatro044.demospring.simple;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("bubble")
public class BubbleSortAlgoImpl implements SortingAlgo{

	@Override
	public int[] sort(int[] arr) {
		System.out.println("Executing sort of BubbleSort");
		return arr;
	}
	
	

}
