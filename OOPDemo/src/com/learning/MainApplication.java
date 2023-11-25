package com.learning;

public class MainApplication {

	public static void main(String[] args) {
		
		System.out.println(Car.numberOfWheels);
		Car.wash();
		Car c1 = new Car();
		Car c2 = new Car("Maruti", "Red", 5.6); 
		
		
		c1.numberOfWheels = 6 ;
		//Car.numberOfWheels = 6;
		c1.wash();
		c1.setBrand("BMW");
		
		
		
		System.out.println("Car details are :" + c1.getBrand() + " " + c1.getColor() + " " +   " " + c1.numberOfWheels);
		System.out.println("Car details are :" + c2.getBrand() + " " + c2.getColor() + " " +  " " + c2.numberOfWheels);
		System.out.println(Car.numberOfWheels);
		
		c1.applyBreaks();
		//c1.startTime = 5;
		
		
	}
	
}
