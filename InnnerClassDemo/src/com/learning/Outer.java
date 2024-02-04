package com.learning;

public class Outer {
	
	int outerVal;
	
	 //static
	 class Inner{
		
		private int val;
		
		public Inner(int val) {
			this.val = val;
			//Outer.this.outerVal = val;
		}
		
		public void displayData() {
			System.out.println("Value is :" + val);
		}
		
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		Outer o = new Outer();
		System.out.println("Outer class : outerVal : "+ o.outerVal);
		Inner a = o.new Inner(10);
		System.out.println("Outer class : outerVal : "+ o.outerVal);
		
		Inner i = new Outer().new Inner(25);
		i.displayData();
	
		Outer o1 = new Outer();
		o1.methodOne();
		
		//Inner i2 = new Inner(10);
		
		
		Inner i1 = new Outer().new Inner(100);
		System.out.println(o);
		System.out.println(i1);
		
		
		
		
		
	}
	
	
	public void methodOne() {
		Inner i = new Inner(28);
		Inner i1 = this.new Inner(30);
		
		i.displayData();
	}
	
	
	

}


class B{
	
}