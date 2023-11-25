package com.learning.ol;

public class Demo {

	public static void main(String[] args) {
		
		Demo d = new Demo();
		d.dispMsg(null);;
	}
	
	
	public void dispMsg(String s ) {
		System.out.println("String arg");
		System.out.println(s);
	}
	
	public void dispMsg(Object s ) {
		System.out.println("Object arg");
		System.out.println(s);
	}
}
