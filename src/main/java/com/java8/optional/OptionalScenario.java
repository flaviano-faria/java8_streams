package com.java8.optional;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class OptionalScenario {
	
	public static void main(String[] args) {
		String st = null;
		Optional<String> optionalStr = Optional.ofNullable(st);
		
		if(optionalStr.isPresent()){
			System.out.println(optionalStr.get());
		}
		
		String name = null;
		String nameString  = Optional.ofNullable(name).orElse("");
		System.out.println(nameString);
		
		List<Optional<String>> listString = new ArrayList<Optional<String>>();

		
		boolean result = listString.stream().anyMatch(Optional::isPresent);
		System.out.println(result);
	}

}
