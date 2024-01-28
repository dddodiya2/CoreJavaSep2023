package com.learning;

public class DemoProgram3 {

	public static void main(String[] args) {
		
		/*
		Integer iObj = new Integer(100);   ///   boxing
		int i1 = iObj;         /// Autounboxing
		Integer iObj2 = 100;    // Autoboxing
		
		
		String s = "1234 565656 757454 888 9001";
		String[] sArray = s.split(" ");
		
		System.out.println(sArray[0] + sArray[1]);
		
		
		int[] numbersFromString = new int[sArray.length];
		
		
		for(int i=0; i<sArray.length; i++) {
			 //numbersFromString[i] = new Integer(sArray[i]);
			 numbersFromString[i] = Integer.parseInt(sArray[i]);
		}
		
		
		System.out.println(numbersFromString[0] + numbersFromString[1]);
		*/
		
		long long1 = 100L;
		long long2 = 100L;
		calculateSum(long1, long2);
		
		
		int int1 =100;
		int int2 = 200;
		calculateSum2(int1, int2);
		
		
		//String s1 = int2;
		String s1 = String.valueOf(int2);
		
	}

	public static void calculateSum(Long l1, Long l2) {
		System.out.println(" l1 + l2 = " + (l1+l2) );
	}
	
	public static void calculateSum2(long l1, long l2) {
		System.out.println(" l1 + l2 = " + (l1+l2) );
	}
	
}
