package com.learning;

public class DemoProgram {

	public static void main(String[] args) {

		Boolean b = new Boolean(false);
		Boolean b1 = new Boolean("false");

		Boolean b2 = false;   //// Autoboxing ---> conversion of primitive datatype into Corresponding obkect type by the compiler/JVM itself is called as Autoboxing
		Boolean b3 = false;
		
		boolean bPrimitive  = b3 ;  /// Auto unboxing --  
		
		
		boolean bValue = b2.booleanValue();
		System.out.println("Equals method : " + b2.equals(b3));
		System.out.println("== operator : " + (b2 == b3));
		System.out.println("== operator : " + (b1 == b3));

		/*
		 * Returns a String object representing this Boolean'svalue. If this object
		 * represents the value true,a string equal to "true" is returned. Otherwise,
		 * astring equal to "false" is returned.
		 */
		b2.toString();

		//boolean xVal = Boolean.FALSE;
		Boolean b10 = Boolean.FALSE; 
		Boolean b11 = Boolean.FALSE;
		
		System.out.println("Equals method : " + b10.equals(b11));
		System.out.println("== operator : " + (b10 == b11));
		
		
		
		
		////Character
		Character cObj =  new Character('a');
		Character cObj1 =  Character.valueOf('a');
		
		
		//Numeric classes
		
		Integer iObj = new Integer(6);
		Integer iObj1 = Integer.valueOf(6);
		Integer iObj2 = Integer.valueOf("56");
		//Integer iObj3 = Integer.valueOf("ABC");
		
		int iPrim = Integer.valueOf("56");
		
		System.out.println(iObj.compareTo(iObj2)) ;
		System.out.println(iObj2.compareTo(iObj)) ;
		System.out.println(iObj1.compareTo(iObj)) ;
		
		int a = 60;
		int ab = 70;
		
		// if(a > ab)
		
		int i10 = iObj.intValue();
		int i11 = iObj;
		
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.MIN_VALUE);
		
		int parsedVal = Integer.parseInt("76");
		//int parsedVal1 = Integer.parseInt("76   ");
		
		//System.out.println("parsedVal : " + parsedVal + " parsedVal1 : " + parsedVal1);
		
		
		int iFoolish = Integer.valueOf(6);
		
		
		
		///String to numeric conevrsion
		String s = "76.88";
		
		double d = Double.parseDouble(s);
		
		///String to numeric conevrsion
		
		float f = 90.99f;
		String s1 = Float.toString(f);
		
		System.out.println(s1);
		
		
		//Assignment
		//Find the lowest number given out of the space seperated String"
		
		String s10 = "12 45 67 89 45 78 99 12 0 -88 -100 100 500 1000 ";
		String s11 = "12, 45, 67, 89, 45, 78,  99, 12, 0, -88, -100, 100, 500, 1000 ";
		///
		
		
		
		
		
		
	}

}
