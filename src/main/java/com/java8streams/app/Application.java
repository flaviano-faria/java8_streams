package com.java8streams.app;

import java.util.List;

import com.java8.functionalinterface.service.IntFunctionService;
import com.java8.functionalinterface.service.IntToStringService;
import com.java8streams.service.DistinctService;
import com.java8streams.service.FilterLimitService;
import com.java8streams.service.FilterService;
import com.java8streams.service.FindFirstService;
import com.java8streams.service.JoinStreamService;
import com.java8streams.service.MinMaxService;

public class Application {
	
	public static void main(String[] args) {
		
		DistinctService distinctService = new DistinctService();
		System.out.println(distinctService.getDistinctIntegers());
		
		FilterService service = new FilterService();
		System.out.println(service.filterNumbers());
		
		FindFirstService findFirstService = new FindFirstService();
		System.out.println(findFirstService.findFirstOcurrency());
		
		FilterLimitService limitService = new FilterLimitService();
		List<Integer> filteredList = limitService.filterElementsByLimit(3);
		filteredList.stream().forEach(n -> System.out.println(n));
		
		MinMaxService minMaxService = new MinMaxService();
		minMaxService.getMinFromList();
		
		minMaxService.getMaxFromList();
		
		JoinStreamService joinService = new JoinStreamService();
		joinService.joinString();
		
		IntToStringService intToStringService = new IntToStringService();
		System.out.println(intToStringService.intToString(5));
		
		IntFunctionService intFunctionService = new IntFunctionService();
		System.out.println(intFunctionService.calculateDisount(100));
	}

}
