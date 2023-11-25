package com.learning;

import java.io.IOException;

public class Parent {

	public Parent() {
		System.out.println("Parent class constructor");
	}
	
	//public  abstract void sampleMethod() ;
	
	public void parentMethod() {
		System.out.println("Parent class method parentMethod executing");
	}

	public void parentOnlyMethod() {
		System.out.println("parentOnlyMethod executing");
	}

	/*
	 * public static void staticMethodOfP() {
	 * System.out.println("Parent class static method executing"); }
	 */

}
