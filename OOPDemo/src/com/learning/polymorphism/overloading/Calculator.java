package com.learning.polymorphism.overloading;

public class Calculator {
	
	//Method overloading
	
	public void sum(int n1, int n2) {
		System.out.println("Sum of 2 integers are : " + (n1 + n2) );
	}
	
	public void sum(float f1, float f2) {
		System.out.println("Sum of 2 integers are : " + (f1 + f2) );
	}
	
	public void sum(float f1, int n2) {
		System.out.println("Sum of 2 integers are : " + (f1 + n2) );
	}
	
	public void sum(int n1, float f2) {
		System.out.println("Sum of 2 integers are : " + (n1 + f2) );
	}
	
	public void sum(int n1, int n2, int n3) {
		System.out.println("Sum of 3 integers are : " + (n1 + n2 + n3) );
	}
	
	public void sum(int n1, int n2, int n3, int n4) {
		System.out.println("Sum of 4 integers are : " + (n1 + n2 + n3 + n4) );
	}
	
	
	/*
	public void sum(short s1, short s2) {
		System.out.println("Sum of 2 shorts are : " + (s1+s2) );
	}
	*/
	
	//Not allowed
	//Changing only return type and having same parameters
	/*
	public int sum(int n1, int n2) {
		System.out.println("Sum of 2 integers are : " + (n1 + n2) );
	}
	*/
	
	//Changing return type along with arguments/parameters is valid example of method overloading
	public int sum(int n1, int n2, int n3, int n4, int n5) {
		System.out.println("Sum of 4 integers are : " + (n1 + n2 + n3 + n4 + n5) );
		return n1+n2+n3+n4+n5 ;
	}
	
	
	
	//Variable argument methods
	public void sum(String msg, int... n ) {
		
		int sum = 0;
		
		for(int i = 0 ; i< n.length ; i++) {
			sum = sum + n[i] ;
		}
				
		System.out.println("Sum of integers : " + sum  );
		System.out.println(msg);
	}

	
	//Static method overloading
	public static void substraction(int n1, int n2) {
		System.out.println("Substraction of 2 ints are : " + (n1 - n2) );
	}
	
	public static void substraction(double n1, double n2) {
		System.out.println("Substraction of 2 double are : " + (n1 - n2) );
	}
	
}


//protected  ---> Within the same class and also inside child class.

//default ---> within the same package and inside child class as well.
