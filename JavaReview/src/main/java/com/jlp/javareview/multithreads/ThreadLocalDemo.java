package com.jlp.javareview.multithreads;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadLocalDemo {
	private static ThreadLocal<Waiter> waitors=new ThreadLocal<Waiter>();
	private static class Waiter{
		public void service(String eaterName) {
			System.out.println("waiter "+ this.hashCode()+" is servicing "+eaterName+" ...");
		}
	}
	
	public static void main(String[] args) {
		Thread.currentThread().setName("主线程");
		if(waitors.get()==null) {
			waitors.set(new Waiter());
		}
		class Eater implements Runnable {
			Waiter water=null;
			Eater(){
				
			}
			
			public void run() {
				try {
					Thread.sleep(300);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				if(waitors.get()==null) {
					waitors.set(new Waiter());
				}
				this.water=waitors.get();
				water.service(Thread.currentThread().getName());
			}
		};
		ExecutorService es=Executors.newFixedThreadPool(4);
		for(int i=0;i<200;i++) {
			es.submit(new Eater());
		}
		
	}
}
