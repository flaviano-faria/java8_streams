package com.java8.completablefuture;

import java.util.concurrent.CompletableFuture;

public class CompletableFutureAsync {
	
	public static void main(String[] args) {
		
		CompletableFuture<Void> future = CompletableFuture.runAsync(() -> {
			try {
                Thread.sleep(2000);
                System.out.println("Task completed!");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
		});
		
		// Waiting for the task to complete
        try {
            future.get();
        } catch (Exception e) {
            ((Throwable) e).printStackTrace();
        }
	}

}
