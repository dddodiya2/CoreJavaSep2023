package com.learning.technowell.coreJava.flowcontrol;


public class DoWhileLoopDemo {

	public static void main(String[] args) {
		
		//printing numbers from 1 to 10;
		
		
		
		int i = 1;
		while(i <= 10) {
			System.out.println("from while   : " + i);
			i++;
		}
		
		i = 1 ;
		
		do {
			System.out.println("from do while : " + i);
			i++ ;
		}while(i <= 10);
		
		
		
		//Example 2 : difference 
		
		System.out.println("\n\nExample 2 : Notice the difference in output");
		int x = 100 ;
		
		while(x > 1000) {
			System.out.println("From while loop value of x is   : " + x);
			x--;
		}
		
		do{
			System.out.println("From do while loop value of x is : " + x);
			x--;
		}while(x > 1000) ;

		System.out.println("Value of x after while loop is : "+ x);
		
	}

}
