package com.java8streams.service;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

public class FilterLimitServiceTest {

	@Test
	public void filterElementsByLimitTest() {
		FilterLimitService filterLimit = new FilterLimitService();
		
		List<Integer> expectedList = new ArrayList<Integer>();
		expectedList.add(1);
		expectedList.add(2);
		expectedList.add(3);
		assertEquals(expectedList, filterLimit.filterElementsByLimit(3));
	}
}
