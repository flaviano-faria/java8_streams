package com.java8streams.app;

import com.java8streas.service.DistinctService;

public class Application {
	
	public static void main(String[] args) {
		
		DistinctService distinctService = new DistinctService();
		System.out.println(distinctService.getDistinctIntegers());
		
	}

}
