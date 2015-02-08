package com.execute;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Execute1 {
	public static void main(String[] args) {
		ExecutorService executorService = Executors.newSingleThreadExecutor();

		executorService.execute(new Runnable() {
			public void run() {
				for(int i=0;i<12;i++){
					System.out.println("Asynchronous task");
					System.out.println(Thread.currentThread().getName());
				}
				
			}
		});
		System.out.println("_______________________________");
		System.out.println(Thread.currentThread().getName());
		executorService.shutdown();
		System.out.println("***************************");
		System.out.println(Thread.currentThread().getName());
	}
}
