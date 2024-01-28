package com.learning;

public class StringNumbers {

	public static void main(String[] args) {
		
		String s  = " 11 52 89 85 47 48 67 12 0 13 5 ";  // space seperated integers 
		
		//expected o/p :-   0 5 11 12 13 ..args......... 89
		
		
		String[] sArray = s.trim().split(" ");
		
		
	}

}
