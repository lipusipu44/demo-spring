package com.anilpatro044.demospring;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
public class QuickSortAlgoImpl implements SortingAlgo{

	@Override
	public int[] sort(int[] arr) {
		System.out.println("Executing sort of QuickSort");
		return arr;
	}

}
