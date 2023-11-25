package com.learning.polymorphism.overriding;

public class Car {
	
	public void drive() {
		System.out.println("Car is driving using petrol ignition ");
	}

	public Object getDetails() {
		return "Details of Car";
	}
	
	public Car getCar() {
		Car c1 = new Car();
		return c1;
	}
	
	private void testMethod() {
		System.out.println("testMethod of Car class");
	}
	
	
	public static double getMilage() {
		return 15.00 ;
	}
	
}
