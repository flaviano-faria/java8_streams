package com.java8streas.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class FilterLimitService {
	
	public void filterElementsByLimit(int limit) {
		List<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		list.add(6);
		list.add(7);
		list.add(8);
		
		Stream<Integer> limitStream = list.stream().filter(n -> n<5).limit(limit);
		limitStream.forEach(n -> System.out.println(n));
	}

}
