package com.java8streas.service;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class FilterService {
	
	public List<Integer> filterNumbers(){
		
		ArrayList<Integer> listNumbers = new ArrayList<>();
		
		listNumbers.add(1);
		listNumbers.add(5);
		listNumbers.add(7);
		listNumbers.add(9);
		
		Predicate<Integer> predicate = i -> i > 6;
		
		List<Integer> filteredList = listNumbers.stream().filter(predicate).collect(Collectors.toList());
		return filteredList;
	}

}
