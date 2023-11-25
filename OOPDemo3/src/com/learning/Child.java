package com.learning;

import java.io.IOException;

public class Child extends Parent {

	
	public Child(String s) {
		System.out.println("Child class constructor");
	}
	
	@Override
	public void parentMethod() {
		System.out.println("Child class method parentMethod executing");
	}

	public Number getNumber() {
		return 1;
	}

	public Parent getSampleObject() {
		return new Parent();
	}

	/*
	 * public static void staticMethodOfP() {
	 * System.out.println("Child class static method executing"); }
	 */

	public void childMethod() {
		System.out.println("childMethod executing");
	}

}

//Child.staticMethodOfP()
