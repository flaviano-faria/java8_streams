package com.java8streams.service;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

public class DistinctServiceTest {
	
	@Test
	public void getDistinctIntegersTest() {
		List<Integer> expectedList = new ArrayList<Integer>();
		expectedList.add(1);
		expectedList.add(2);
		expectedList.add(3);
		expectedList.add(4);
		expectedList.add(5);
		expectedList.add(6);
		expectedList.add(7);
		expectedList.add(8);
		expectedList.add(9);
		
		DistinctService distinctService = new DistinctService();
		assertEquals(expectedList, distinctService.getDistinctIntegers());
	}
	
	public void getDistinctWithSetTest() {
		List<Integer> expectedList = new ArrayList<Integer>();
		expectedList.add(1);
		expectedList.add(2);
		expectedList.add(3);
		expectedList.add(4);
		expectedList.add(5);
		expectedList.add(6);
		expectedList.add(7);
		expectedList.add(8);
		expectedList.add(9);
		
		DistinctService distinctService = new DistinctService();
		assertEquals(expectedList, distinctService.getDistinctWithSet());
	}

}
