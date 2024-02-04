package com.learning3;

public class Main {

	public static void main(String[] args) {
		
		DiscountClass dc = new DiscountClass();
		
		double priceOfLaptop = 50000.0 ;
		double percentDisc = 10.0 ;
		
		dc.calculateDiscount(priceOfLaptop, percentDisc);
		
		
		//LAPTOP 			% +  Extra 2000 Discount
		//Mobile 			% +  Extra 500 Discount
		//WASHINGMACHINE 	% +  Extra 1000 Discount
		
		DiscountClass laptopDiscClass = new DiscountClass() {
			public void calculateDiscount(double price, double percentDisc) {
				System.out.println("Anonyous inner class method called");
				System.out.println("The discount is : " + ( (price * percentDisc/100 ) + 2000.0) );
			}
		};
		
	
		laptopDiscClass.calculateDiscount(priceOfLaptop, percentDisc);
		
		System.out.println(dc.toString());
		System.out.println(laptopDiscClass.toString());
		
	
		
	}

}
