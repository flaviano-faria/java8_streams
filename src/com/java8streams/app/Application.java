package com.java8streams.app;

import com.java8streas.service.DistinctService;
import com.java8streas.service.FilterService;

public class Application {
	
	public static void main(String[] args) {
		
		DistinctService distinctService = new DistinctService();
		System.out.println(distinctService.getDistinctIntegers());
		
		FilterService service = new FilterService();
		System.out.println(service.filterNumbers());
		
	}

}
