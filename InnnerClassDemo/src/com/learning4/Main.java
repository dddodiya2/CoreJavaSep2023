package com.learning4;

public class Main {

	public static void main(String[] args) {
	
		DiscountInterface i = new DiscountInterface() {
			
			public void calcDisc(double price, double percDisc) {
				System.out.println("The discount amount is : " + (price*percDisc/100) );
			}
			
		};
		
		double price = 60000.0;
		double disc = 12.0;
		
		i.calcDisc(price, disc);
		
		
	}

}
