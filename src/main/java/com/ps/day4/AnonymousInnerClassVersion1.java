package com.ps.day4;

public class AnonymousInnerClassVersion1 {
	public static void main(String[] args) {
		Remote ref = new Remote() {// It can be a one liner and the line is being terminated
			@Override
			public void work() {
				System.out.println("Special stuff this...");
			}
		};
		ref.work();
	}
}
//This class can be accessed without any extra sub class and implement class with inner class concept
interface Remote{
	void work();
}
