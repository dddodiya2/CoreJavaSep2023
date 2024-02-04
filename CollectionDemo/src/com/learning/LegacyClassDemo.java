package com.learning;

import java.util.Enumeration;
import java.util.Stack;
import java.util.Vector;

public class LegacyClassDemo {

	public static void main(String[] args) {
		
		Vector<String> v = new Vector<String>();
		
		v.addElement("Hero");
		v.addElement("Heroine");
		v.addElement("Director");
		v.addElement("Story");
		v.addElement("Villain");
		v.addElement("Acting");
		v.addElement("MakeupMan");
		v.addElement("LightMan");
		
		System.out.println("The element at pos 3 is : " + v.elementAt(3) );
		
		Enumeration<String> enumeration = v.elements();
		
		while(enumeration.hasMoreElements()) {
			System.out.println( enumeration.nextElement());
		}
		
		//Stack demo
		Stack<Integer> s = new Stack<Integer>();
		s.add(10);
		s.add(100);
		s.add(20);
		s.add(0);
		s.add(50);

		System.out.println("Stack is : " + s);
		
		System.out.println("\n\n");
		System.out.println(s.pop());
		
		

	}

}
