package com.ps.threads;

public class MultiThreadingDemo extends Thread{
	public static void main(String[] args) {
	MultiThreadingDemo thread1 = new MultiThreadingDemo();
	MultiThreadingDemo thread2 = new MultiThreadingDemo();
	MultiThreadingDemo thread3 = new MultiThreadingDemo();
	
	thread1.setName("A");
	thread2.setName("B");
	thread3.setName("C");
	
	thread1.start();
	thread2.start();
	thread3.start();
	}
	@Override
	public void run() {
		System.out.println(MultiThreadingDemo.currentThread().getName()+" 1");
		System.out.println(MultiThreadingDemo.currentThread().getName()+" 2");
		System.out.println(MultiThreadingDemo.currentThread().getName()+" 3");
	}
}
