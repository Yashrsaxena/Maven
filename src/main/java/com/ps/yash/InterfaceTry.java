package com.ps.yash;

public class InterfaceTry {
	
	interface Human{
		void breathe();
		
		void sleep();
		
		default void eat() {
			System.out.println("Generic Eat...");
		};
		
	}
	
	class Yash implements Human{
		@Override
		public void breathe() {
			System.out.println("Yash's breathe...");
		}
		@Override
		public void sleep() {
			System.out.println("Yash's sleep...");
		}
		@Override
		public void eat() {
			System.out.println("Yash's eat...");
		}
	}
	
	class Varun implements Human{
		@Override
		public void breathe() {
			System.out.println("Varun's breathe...");
		}
		@Override
		public void sleep() {
			System.out.println("Varun's sleep...");
		}
		public void eat() {
			
		};
	}



	
	public static void main() {
		
		InterfaceTry interfaceTry = new InterfaceTry();
		interfaceTry.Yash.eat();
	}

}
