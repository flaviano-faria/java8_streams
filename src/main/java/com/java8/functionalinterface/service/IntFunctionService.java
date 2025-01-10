package com.java8.functionalinterface.service;

import java.util.function.IntFunction;

public class IntFunctionService {
	
	public int calculateDisount(int value){
		IntFunction<Integer> finalValue = x -> x-30;
		
		return finalValue.apply(value);
	}

}
