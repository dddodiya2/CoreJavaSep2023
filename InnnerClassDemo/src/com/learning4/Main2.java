package com.learning4;

public class Main2 {

	public static void main(String[] args) {

		/*
		  DiscountInterface i = new DiscountInterface() { public void calcDisc(double
		  price, double percDisc) { System.out.println("The discount amount is : " +
		  (price * percDisc / 100)); } };
		 */

		double price = 60000.0;
		double disc = 12.0;

		doSomeWork(new DiscountInterface() {
			public void calcDisc(double price, double percDisc) {
				System.out.println("The discount amount is : " + (price * percDisc / 100));
			}
		}, price, disc);

	}

	public static void doSomeWork(DiscountInterface d, double price, double percDisc) {

		d.calcDisc(price, percDisc);

	}

}
