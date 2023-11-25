package com.learning;

public class Main {

	public static void main(String[] a) {
		GrandChild g  = new GrandChild();
	}
	
	
	/*
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Parent p = new Parent();
		p.parentMethod();           //parent
		p.parentOnlyMethod();       //parent
		
		Child c = new Child();
		c.parentMethod();           //child - overridden
		c.parentOnlyMethod();       //parent
		c.childMethod();		    //child
		
		Parent p1 = new Child();
		p1.parentMethod();          //child - override   , 
		p1.parentOnlyMethod();          // parent
		//p1.childMethod();           //child 		
		
		
		
		
		///
		GrandChild c2 = new GrandChild();
		Number x =  c2.getNumber();
		System.out.println(x);
	}
*/
}
