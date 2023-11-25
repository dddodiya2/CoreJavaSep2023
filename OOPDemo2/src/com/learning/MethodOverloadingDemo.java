package com.learning;

public class MethodOverloadingDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodOverloadingDemo m1 = new MethodOverloadingDemo();
		
		double dig1 = 10.0 ;
		double dig2 = 20.0 ;
		double result = m1.sum(dig1, dig2);
		System.out.println(result);
		
		result = m1.sum(10.0,20);

	}

	public double sum(double d1, double d2) {
		System.out.println("From double , double method");
		return d1+d2;
	}
	
	public double sum(double d1, int d2){
		System.out.println("From double , int method");
		return d1+d2;
	}
	
	public double sum(double d1, double d2, double d3){
		System.out.println("From double , double, double  method");
		return d1+d2+d3;
	}
	
}
