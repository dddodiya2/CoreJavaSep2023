package com.learning.donotchange;

public class Vehicle {
	
	private int power ;
	private String brand;	
	
	public Vehicle(int power, String brand) {
		this.power = power;
		this.brand = brand;
	}
	
	public int getPower() {
		return power;
	}
	public void setPower(int power) {
		this.power = power;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	@Override
	public String toString() {
		return "Vehicle [power=" + power + ", brand=" + brand + "]";
	}

}
