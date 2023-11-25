package com.learning;

import java.util.*;

public class ObjectDemo {
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String s = "Divyesh";
		
		int[] arr = {1,1,2};   //[I  ,, [[I
		
		ArrayList<Integer> a = new ArrayList<Integer>();
		
		
		//Object class
		//getClass()    ---> the object is of which Class
		System.out.println(s.getClass());
		System.out.println(arr.getClass());
		System.out.println(a.getClass());
		
		//Animal a = new Dog();
		Object o = new ObjectDemo();
		System.out.println(o.getClass());
		
		Object o1 = new String("John");
		System.out.println(o1.getClass());
		
		
		
		
		/*
		int           Integer
		double        Double 
		long          Long
		char
		boolean
		byte
		short
		float
		*/
		
	}

}
