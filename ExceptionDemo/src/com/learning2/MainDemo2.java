package com.learning2;


public class MainDemo2 {

	
	public static void main(String[] args) {
		
		System.out.println("Main method started");
		
		MainDemo2 m1 = new MainDemo2();
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
			System.out.println("Array Element : " + numbers[1]);
			String s = null ;
			s.charAt(0);
		} catch(ArrayIndexOutOfBoundsException exc) {
			System.out.println(exc.getMessage());
			System.out.println("ArrayIndexOutOfBoundsException is handled ");
		} catch(NullPointerException excNull) {
			System.out.println(excNull.getMessage());
			System.out.println("NullPointerException is handled ");
			throw new RuntimeException("Exception occured due to null value of String");
		} catch(Exception e) {
			System.out.println("Generic exception handler");
		}
		
		System.out.println("MethodThree Completed !!!!");
	}
}
