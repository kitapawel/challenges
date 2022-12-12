package com.threads;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicInteger;

public class SynchronizedCounter {

	AtomicInteger counter = new AtomicInteger(10);
	public int getValue() {
		return counter.get();
	}
	
	public int getNextValue() {
		counter.getAndIncrement();
		return counter.get();
	}
	
	public int getPreviousValue() {
		counter.getAndDecrement();
		return counter.get();
	}
	
	
	public static void main(String[] args) {
		SynchronizedCounter syncCounter = new SynchronizedCounter();
		ExecutorService executorService = Executors.newFixedThreadPool(3);
		
		Runnable runnable1 = ()->System.out.println("Initial value "+ syncCounter.getValue());
		Runnable runnable2 = ()->System.out.println("Previous value "+ syncCounter.getPreviousValue());
		Runnable runnable3 = ()->System.out.println("Next value "+ syncCounter.getNextValue());
		
		executorService.execute(runnable1);
		executorService.execute(runnable2);
		executorService.execute(runnable3);
		
		executorService.shutdown();
	}

}
