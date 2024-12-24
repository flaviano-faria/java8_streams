package com.java8streams.service;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;

public class FilterServiceTest {
	
	@Test
	public void filterNumbersTest() {
		FilterService filterService = new FilterService();
		List<Integer> expectedList = new ArrayList<Integer>();
		expectedList.add(7);
		expectedList.add(9);
		
		assertEquals(expectedList, filterService.filterNumbers());
	}

}
