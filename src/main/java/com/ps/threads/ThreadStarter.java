package com.ps.threads;

public class ThreadStarter extends Thread{
	public static void main(String[] args) {
		ThreadStarter thread = new ThreadStarter();
		thread.setName("yash");//Renaming Thread JAVA BEANS
		thread.start(); //Illegal starting thread twice or more, will give runtime error
		System.out.println(Thread.currentThread().getName()+ " running...");
	}
	@Override
	public void run() {
		System.out.println("Thread running...");
		System.out.println(Thread.currentThread().getName()+ " running...");
	}
}

//POJO - Plain Old Java Object

//One thread always running that is main