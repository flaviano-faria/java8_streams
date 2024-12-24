package com.java8streams.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FilterLimitService {
	
	public List<Integer> filterElementsByLimit(int limit) {
		List<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		list.add(6);
		list.add(7);
		list.add(8);
		
		List limitList = list.stream().filter(n -> n<5).limit(limit).collect(Collectors.toList());
		return limitList;
	}

}
