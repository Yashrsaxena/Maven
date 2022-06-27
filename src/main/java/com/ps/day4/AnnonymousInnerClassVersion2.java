package com.ps.day4;

public class AnnonymousInnerClassVersion2 {
	
	public static void main(String[] args) {
		new Other().func(new Calculate() {
			@Override
			public void cal() {
				System.out.println("This is the calc function...");
			}});
		
	}

}

interface Calculate{
	void cal();
}

class Other{
	void func(Calculate ref) {
		ref.cal();
	}
}


//Something Like Static Inner Classes
//For calling inner you don't need outer since it is static