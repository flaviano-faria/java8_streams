package com.java8.completablefuture;

import java.util.concurrent.CompletableFuture;

public class CompletableFutureTest {
	
	public static void main(String[] args) {
		CompletableFuture<String> completableFuture = new CompletableFuture<>();
		completableFuture.complete("Hello world");
		
		 try {
	            System.out.println(completableFuture.get()); 
	        } catch (Exception e) {
	            e.printStackTrace();
	        }
	}

}
