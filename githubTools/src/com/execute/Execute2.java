package com.execute;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Execute2 {
	public static void main(String[] args) throws Exception {
		ExecutorService executorService = Executors.newSingleThreadExecutor();
		Future future = executorService.submit(new Runnable() {
		    public void run() {
		    	for(int i=0;i<10;i++){
		    		System.out.println(Thread.currentThread().getName());
		    		System.out.println("Asynchronous task");
		    	}
		    }
		});
		//如果任务结束执行则返回 null
		executorService.shutdown();
		System.out.println("future.get()=" + future.get());
		
	}
}
