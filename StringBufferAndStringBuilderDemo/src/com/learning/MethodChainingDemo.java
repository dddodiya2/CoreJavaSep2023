package com.learning;

public class MethodChainingDemo {

	/*
	 For most of the methods in String, StringBuffer and StringBuilder the return
type is same type only. Hence after applying method on the result we can call
another method which forms method chaining.
	 */
	
	
	public static void main(String[] args) {
		
		String s1 = new String("Hello");
		String s2 = new String(" World ");
		
		/*
		s1 = s1.concat(s2);
		s1 = s1.toUpperCase();
		*/
		
		s1 = s1.concat(s2).toUpperCase();
		
	}

}
