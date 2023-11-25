package com.learning.polymorphism.overloading;

public class MainApp {

	public static void main(String[] args) {
		
		Calculator c = new Calculator();
		
		c.sum(15,16);
		
		c.sum(15,16,17);
		
		c.sum(15,16,17,18);
		
		short s1 = 5;
		short s2 = 10;
		
		c.sum(s1, s2);
		
		char c1 = 'a';
		char c2 = 'b';
		
		c.sum(c1, c2);
		
		long l1 = 100l;
		long l2 = 200l;
		
		c.sum(l1, l2);
		
		
		Calculator.substraction(200, 100);
		Calculator.substraction(2.0, 3.0);
	
		c.sum("String Message", 1, 2, 3 , 4, 5, 6 ,6 ,8);

	}

}
