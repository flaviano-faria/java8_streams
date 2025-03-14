package com.java8streams.service;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class DistinctService {
	
	public List getDistinctIntegers() {
		List<Integer> integerList = List.of(1, 1, 2, 2, 3, 3, 4, 4, 5, 5, 6, 6, 7, 7, 8, 8, 9, 9, 9, 9, 9);
		List<Integer> filteredList = integerList.stream().distinct().collect(Collectors.toList());
		return filteredList;
	}
	
	public Set getDistinctWithSet() {
		List<Integer> integerList = List.of(1, 1, 2, 2, 3, 3, 4, 4, 5, 5, 6, 6, 7, 7, 8, 8, 9, 9, 9, 9, 9);
		Set<Integer> filteredSet = integerList.stream().collect(Collectors.toSet());
		return filteredSet;
	}

}
