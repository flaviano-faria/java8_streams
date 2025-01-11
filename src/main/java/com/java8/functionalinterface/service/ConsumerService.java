package com.java8.functionalinterface.service;

import java.util.function.Consumer;

public class ConsumerService {
	
	public void applyConsumerPercent(int x) {
		Consumer<Double> consumerApp = num -> System.out.println((Double) (num*1.2)) ;
		
		consumerApp.accept((double) x);
	}

}
