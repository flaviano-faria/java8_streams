package com.java8.optional;

import java.util.Optional;

public class OptionalScenario {
	
	public static void main(String[] args) {
		String st = null;
		Optional<String> optionalStr = Optional.ofNullable(st);
		
		if(optionalStr.isPresent()){
			System.out.println(optionalStr.get());
		}
	}

}
