package com.java8.functionalinterface.service;

public class Cart {
	
	public static void main(String[] args) {
		
		DiscountEligible discount = value -> value *0.9;
		
		System.out.println(discount.calculate(100));
	}

}
