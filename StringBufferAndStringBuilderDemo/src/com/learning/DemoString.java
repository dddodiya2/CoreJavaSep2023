package com.learning;

public class DemoString {

	public static void main(String[] args) {
		
		String s = new String("Hello");    //  2 
		
		s = s.concat(" world !");         /// " world ! " in SCP and "Hello world !"
		
		String s1 = new String(" world !");     // only 1 object in heap.
		
	}

}
