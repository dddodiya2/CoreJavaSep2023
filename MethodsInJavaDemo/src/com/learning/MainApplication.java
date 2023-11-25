package com.learning;

public class MainApplication {
	
	/*
	public static void main(String[] args) {
		MainApplication m1 = new MainApplication();
		
		m1.sum(10,20);
		//System.out.println(x);
		m1.getMessage("Ram", 101);
		
		System.out.println( "The sum from var-arg method is " + m1.getSumOfNumbers(9,51));
		
	}
	*/
	
	public int getSumOfNumbers( int num1, int num2) {
		int sum =num1+num2;
		System.out.println("Normal method is called");		
		return sum;
	}
	
	//var-arg method :
		public int getSumOfNumbers( int... x) {
			int sum =0;
			for(int i=0;i < x.length ; i++) {
				sum = sum + x[i];
			}
			System.out.println("Var-arg method is called");		
			return sum;
		}
	
	public void sum(int n1, int n2) {
		int sum = n1 + n2;
		System.out.println("The sum is "+ sum);
	}
	
	/*
	 * public void sum(int n1, int n2, int n3) { int sum = n1 + n2 + n3;
	 * System.out.println("The sum is "+ sum); }
	 * 
	 * public void sum(int n1, int n2, int n3, int n4) { int sum = n1 + n2 + n3 +
	 * n4; System.out.println("The sum is "+ sum); }
	 */
	
	
	public String getMessage(String name, int age) {
		String msg = "Hello, Good morning " + name + " Congratulations you are " + age + " years old";
		return msg;
 	}
	
}
