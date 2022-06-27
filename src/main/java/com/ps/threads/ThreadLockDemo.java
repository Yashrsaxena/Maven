package com.ps.threads;

public class ThreadLockDemo {
	public static void main(String[] args) {
//		new Thread(new Task()).start();
		Task task = new Task();
		Thread first = new Thread(task);
		Thread second = new Thread(task);
		Thread third = new Thread(task);
		
		first.setName("A");
		second.setName("B");
		third.setName("C");
		
		first.start();
		second.start();
		third.start();
	}
}

class Task implements Runnable{
	@Override
	public synchronized void run() {
		for(int i=1;i<4;i++) {
		System.out.println(Thread.currentThread().getName() + " , index : "+i);
		}
	}
}
