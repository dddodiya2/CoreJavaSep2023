package com.learning;

public class SampleChild extends Sample {

	public void sampleMethod() {
		System.out.println("sampleMethod from child class");
	}
	
	public void childMethod() {
		System.out.println("Child method from : sampleMethod");
	}
}
