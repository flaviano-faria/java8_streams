package com.java8.functionalinterface.service;

import java.util.function.Function;

public class IntToStringService {

	public String intToString(int i) {
		Function<Integer, String> intToString = num -> num.toString();
		
		return intToString.apply(i);
	}
	
}
