package com.learning.encapsulation;

public class Mobile {

	private String imei;
	private String brand;
	
	
	public Mobile(String brand, String imei) {
		this.brand = brand;
		this.imei = imei ;
	}
	
	//getter
	public String getImei() {
		return imei;
	}	
	
	//setter
	public void setImei(String imei) {
		if(imei.length() < 15) {
			System.out.println("ERROR : This is invalid imei number");
			return;
		}
		this.imei = imei ;
	}
	
	
	public void switchOn() {
		System.out.println("Mobile phone booting , please wait!!!!");
	}
	
	public void switchOff() {
		System.out.println("Going off , please wait!!!!");
	}
	
	public void displayInfo() {
		System.out.println("The mobile info is : ");
	}
}
