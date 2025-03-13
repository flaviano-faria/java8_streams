package com.java8.completablefuture;

import java.util.concurrent.CompletableFuture;

public class CompletableFutureSupplyAsync {
	
	 public static void main(String[] args) {
	       
	        CompletableFuture<String> dataFuture = CompletableFuture.supplyAsync(() -> {
	            
	            try {
	                Thread.sleep(2000);
	            } catch (InterruptedException e) {
	                e.printStackTrace();
	            }
	            return "Retrieve from API";
	        });

	        try {
	            System.out.println(dataFuture.get());
	        } catch (Exception e) {
	            e.printStackTrace();
	        }
	    }

}
