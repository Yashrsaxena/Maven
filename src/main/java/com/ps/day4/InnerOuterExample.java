package com.ps.day4;

public class InnerOuterExample {
	
	public static void main(String[] args) {
		AnotherOuter ref = new AnotherOuter();
		ref.met();
	}

}

class AnotherOuter{
	int flag=2;
	void met() {
		final int flag=0;
		class Inner{
			int flag=1;
			void in() {
				System.out.println("This is inner flag: "+met().flag);
			}
		}
		new Inner().in();
	}
}