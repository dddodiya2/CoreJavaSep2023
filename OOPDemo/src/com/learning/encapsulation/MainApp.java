package com.learning.encapsulation;

public class MainApp {

	public static void main(String[] args) {
		
		Mobile m1 =  new Mobile("Vivo", "123456789ABC");
		
		System.out.println("Main method : imei of m1 is : " + m1.getImei() );
		
		m1.setImei("123");
		
		System.out.println("Main method : imei of m1 is : " + m1.getImei() );
		
	}

}
