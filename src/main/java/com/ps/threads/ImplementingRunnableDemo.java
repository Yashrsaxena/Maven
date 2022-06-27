package com.ps.threads;

public class ImplementingRunnableDemo {
	public static void main(String[] args) {
//		MyRunnable task = new MyRunnable(); 
//		Thread thread = new Thread(task); //mapping to task - Target running
//		thread.start();
		
		//new Thread(new MyRunnable()).start();   //One liner for the above code
		
		new Thread(new Runnable() {
			@Override
			public void run() {
				System.out.println(Thread.currentThread().getName() + " running");
			}
		}).start();
	}
}

//class MyRunnable implements Runnable{
//	@Override
//	public void run() {
//		System.out.println(Thread.currentThread().getName() + " running");
//	}
//}