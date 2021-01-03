package com.anilpatro044.demospring;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;

import com.anilpatro044.mockito.BusinessImpl;
import com.anilpatro044.mockito.DataService;

class TestBusinessImpl {
	
	/*
	 * This test case is more about mockito
	 * and its use, to check without any 
	 * stub creation how we are creating 
	 * using mockito
	 */

	@Test
	void test() {
		
		DataService dataService = mock(DataService.class);
		when(dataService.retrieveAllData()).thenReturn(new int[] {24,3,10});
		BusinessImpl businessImpl=new BusinessImpl(dataService);
		int res=businessImpl.findGreatestfromAllData();
		assertEquals(24, res);
		
		
	}

}
