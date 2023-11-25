package com.learning;

public class Car extends Machine implements Drivable, Convertible{

	static int numberOfWheels = 4;
	private String brand;
	private String color;
	private double price;
	
	public void applyBreaks() {
		System.out.println("Applying breaks from Car");
	}
	
	public void convert() {
		
	}
	
	/*
	 * public void displayStartTime() { System.out.println(startTime); }
	 */
	
	//getter for brand 
	public String getBrand() {
		return brand;
	}
	
	//setter for brand
	public void setBrand(String brand) {
		this.brand = brand;
	}
	
	//getter for color 
	public String getColor(){
		return color;
	}
	
	public void displayDetails() {
		System.out.println(brand + color + price );
	}
	
	//setter for color
	public void setColor(String color) {
		this.color = color;
	}
	
	static
	{
		System.out.println("Class is loaded in the memory");	
	}
	
	public  static  void wash(){
		System.out.println("Car washing in progress");
		System.out.println("While washing I found out that car has " + numberOfWheels + " number of wheels");
	}
	
	public void breaking() {
		System.out.println("brand : " + brand);
		System.out.println("" + numberOfWheels );
	}
	
	//Constructor  access_Spe return_type method_name(){}
	public Car(){
		this("Default", "Default-white", 5.0);
		//System.out.println("Default constructor called");
	}
	
	public Car(String brand, String color, double price) {
		this(brand, color);
		this.price = price;
		//System.out.println("Constructor with 3 args");
	}
	
	public Car(String brand, String color) {
		this.brand = brand;
		this.color = color;
		//System.out.println("Constructor with 2 args");
	}
	
	
	public void drive(){
		System.out.println("Car Driving");
	}
	
}
