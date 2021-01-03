package com.anilpatro044.mockito;

public class BusinessImpl {
	
	private DataService dataService;
	
	public BusinessImpl(DataService dataService2) {
		dataService=dataService2;
	}

	public int findGreatestfromAllData() {
		
		int[] retrieveAllData = dataService.retrieveAllData();
		
		int greatest=Integer.MIN_VALUE;
		
		for (int i : retrieveAllData) {
			
			if(i>greatest) {
				greatest=i;
			}
			
		}
		
		return greatest;
	}

}
