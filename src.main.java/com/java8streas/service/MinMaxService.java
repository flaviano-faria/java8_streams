package com.java8streas.service;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class MinMaxService {
	
	public void getMinFromList() {
		List<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		list.add(6);
		list.add(7);
		list.add(8);
		
		Integer min = list.stream().min(Comparator.naturalOrder()).get();
		System.out.println(min);
	}
	
	public void getMaxFromList() {
		List<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		list.add(6);
		list.add(7);
		list.add(8);
		
		Integer min = list.stream().max(Comparator.naturalOrder()).get();
		System.out.println(min);
	}

}
