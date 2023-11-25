package com.learning;

public class GrandChild extends Child{

	public GrandChild() {
		super("String object");
		System.out.println("Grandchild constr");
	}
	
	public GrandChild(String s) {
		super("abc");
		System.out.println("Grandchild constr");
	}
	
	
	public Short getNumber() {
		return 2;
	}
	
	public GrandChild getSampleObject() {
		return new GrandChild();
	}
	
	//GrandChild is child of Child
	//Integer is also the child of Number.
	
	
}

///Object


/*

byte       Byte
short      Short
int        Integer
float      Float
long       Long
doule      Double




*/