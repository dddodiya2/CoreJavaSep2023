package com.learning2;


public class MainDemo {

	/*  StackOverflow example
	public static void main(String[] args) {
		MainDemo m1 = new MainDemo();
		m1.methodTest();
	}
	
	public void methodTest() {
		methodTest();
	}*/
	
	
	public static void main(String[] args) {
		
		System.out.println("Main method started");
		
		MainDemo m1 = new MainDemo();
		m1.methodOne();
		
		System.out.println("End of main method");
		
	}
	
	public void methodOne() {
		System.out.println("MethodOne Started !!!!");
		methodTwo();
		System.out.println("MethodOne Completed !!!!");
	}
	
	public void methodTwo() {
		System.out.println("MethodTwo Started !!!!");
		methodThree();
		System.out.println("MethodTwo Completed !!!!");
	}
	
	public void methodThree() {
		System.out.println("MethodThree Started !!!!");
		
		int[] numbers = new int[2];
		
		try {
			System.out.println("Array Element : " + numbers[3]);
		} catch(ArrayIndexOutOfBoundsException exc) {
			System.out.println(exc.getMessage());
			System.out.println("ArrayIndexOutOfBoundsException is handled ");
		}
		
		System.out.println("MethodThree Completed !!!!");
	}
}
