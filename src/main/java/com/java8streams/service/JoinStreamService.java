package com.java8streams.service;

import java.util.List;
import java.util.stream.Collectors;

public class JoinStreamService {
	
	public void joinString() {
		List<String> names = List.of("John", "Paul", "Toretto", "Ana", "Lisa");
		String stream = names.stream().map(name -> name).collect(Collectors.joining("|"));
		System.out.println(stream);
	}
	
}
