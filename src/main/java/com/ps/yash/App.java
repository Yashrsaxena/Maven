package com.ps.yash;

// Polymorphism
// Variable Arguments (...) triple periods

public class App 
{
	
	int add(int... num) {
		int total=0;
		if(num.length>1) {
			for(int number:num) {
				total+=number;
			}
		}
		return total;
	}
	
	
    public static void main( String[] args )
    {
    	App ref = new App();
        System.out.println(ref.add(10, 25, 35, 65)); //This function can take from 0 to any number of inputs and can return the sum of all values
    }
}
