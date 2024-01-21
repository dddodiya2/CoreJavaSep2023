package com.currrent.learning;

import com.old.learning.Engine;

public class DemoClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Employee e1 = new Employee("Raju",45, 50, "HR");
		
		/*System.out.println(e1.toString());
		System.out.println(e1.hashCode());
		
		Employee e2 = new Employee("Mohan",42, 47, "IT"); 

		Employee e3 = new HREmployee("Rohan",38, 90, "Manager");
		
		System.out.println("e1 : " + e1.getClass().getName());
		System.out.println("e2 : " + e2.getClass().getName());
		System.out.println("e3 : " + e3.getClass().getName());
		*/
		Employee e4 = null;     //new Employee("Raju",45, 50, "HR");
		
		Engine en = new Engine("Electric");
		
		
		if(e1.equals(en)) {
			System.out.println("Both are same employee");
		} else {
			System.out.println("Both are diff employee");
		}
		
		
		//Want to create duplicate/clone of e1
		Employee eClone = null;
		
		try {
			eClone = e1.clone();
		} catch(CloneNotSupportedException ex) {
			System.out.println("Exception aaya");
			ex.printStackTrace();
		}
		
		
		System.out.println(eClone);
		
		
		
	}

}
