package com.java8streas.service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class DistinctService {
	
	public List getDistinctIntegers() {
		List<Integer> integerList = List.of(1, 1, 2, 2, 3, 3, 4, 4, 5, 5, 6, 6, 7, 7, 8, 8, 9, 9, 9, 9, 9);
		List<Integer> filteredList = integerList.stream().distinct().collect(Collectors.toList());
		return filteredList;
	}

}
