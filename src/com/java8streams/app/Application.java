package com.java8streams.app;

import com.java8streas.service.DistinctService;
import com.java8streas.service.FilterLimitService;
import com.java8streas.service.FilterService;
import com.java8streas.service.FindFirstService;
import com.java8streas.service.MinMaxService;

public class Application {
	
	public static void main(String[] args) {
		
		DistinctService distinctService = new DistinctService();
		System.out.println(distinctService.getDistinctIntegers());
		
		FilterService service = new FilterService();
		System.out.println(service.filterNumbers());
		
		FindFirstService findFirstService = new FindFirstService();
		System.out.println(findFirstService.findFirstOcurrency());
		
		FilterLimitService limitService = new FilterLimitService();
		limitService.filterElementsByLimit(3);
		
		MinMaxService minMaxService = new MinMaxService();
		minMaxService.getMinFromList();
	}

}
