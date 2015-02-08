package com.execute;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Execute6 {
	public static void main(String[] args) throws Exception{
		ExecutorService es = Executors.newFixedThreadPool(2);
		List<DataTable> uniquePhrases=new ArrayList<DataTable>();
		for(int i=0;i<5;i++){
			uniquePhrases.add(new DataTable(i));
		}
		
		List<Callable<DataTable>> todo = new ArrayList<Callable<DataTable>>(uniquePhrases.size());
	
		for (DataTable singleTable: uniquePhrases) { 
		    todo.add(Executors.callable(new ComputeDTask(singleTable),singleTable)); 
		}

		List<Future<DataTable>> answers = es.invokeAll(todo);

		for(Future<DataTable> f:answers){
			System.out.println(f.get());
		}
		es.shutdown();
	}
}
