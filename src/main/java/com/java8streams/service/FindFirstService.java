package com.java8streams.service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FindFirstService {
	
	public Integer findFirstOcurrency() {
		Optional<Integer> filteredItem = 
				Stream.of(1,2,3,4,5,5,5,6).filter(n -> n==5).findFirst();
		
		if(filteredItem.isPresent()) {
			return filteredItem.get();
		}
		
		return 0;
	}

}
