package com.learning;

public class DemoMain {

	
	//create a method which takes an integer array and returns sum of its elements.
	// {1,5,8,7,9}  --> 30
	
	public static void main(String[] args) {
		
		int[] sample1 = {1,5,8,7,9} ; 
		
		DemoMain d1 = new DemoMain();
		
		int sumOfArray = d1.sumOfArrayElements(sample1);
		
		System.out.println("Sum of sample1 array is : " + sumOfArray);
		
		int[] sample2 = new int[5];
		
		sample2[0]= 0;
		sample2[1]= 1000;
		sample2[2]= 10000;
		sample2[3]= 10;
		sample2[4]= 50;

		sumOfArray = d1.sumOfArrayElements(sample2);	
		System.out.println("Sum of sample2 array is : " + sumOfArray);
		
		
	}
	
	
	int sumOfArrayElements(int[] a1){
		
		int sum = 0;
		
		for(int i =0 ; i < a1.length ; i++) {
			sum = sum + a1[i] ;
		}
		
		return sum;
	}
	
}

