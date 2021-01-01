package com.anilpatro044.demospring;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Qualifier("quick")
public class QuickSortAlgoImpl implements SortingAlgo{

	@Override
	public int[] sort(int[] arr) {
		System.out.println("Executing sort of QuickSort");
		return arr;
	}

}
