
public class DemoProgram {
	
	public static void main(String[] args) {
		
		/*
		  
		  	//these are comments 
		  
		 */
		
		/*
		
		System.out.println("Hello World !");
		
		
		boolean flag = false;
		
		System.out.println( "Value of flag before updating :");
		System.out.println(flag);
		
		flag = true;
		
		System.out.println( "Value of flag after updating :");
		System.out.println(flag);
		
		
		// boolean val = False;   /// invalid
		
		boolean val = flag  ;
		
		
		char c = 'a' ;
		System.out.println();
		System.out.println("Value of character c:");
		System.out.println(c);
		
		
		//Invalid character examples :-
		//char charEx = 'ab';
		//char charEx = "ab";
		//char charEx = "a";   
		
		char characterValue = 98 ;    /// ASCII value 98 will be stored which represents character 'b'
		
		//char characterValue = 5000 ;    /// ASCII value 98 will be stored which represents character 'b'
		
		System.out.println("Value of character characterValue:");
		System.out.println(characterValue);
		
		
		//Assignment :-
		// Find ascii values for A 
		 
		
		*/
		
		/*
		
		byte   ----> short --> int ---> long --> float --> double  
	                            | 
	               char  -------|
	       
	     */
		
		byte b = 1;
		System.out.println(b);
		
		byte b1= 127;
		
		byte b3 = (byte) (b + b1) ; 
		System.out.println(b3);
		
		byte b4 = (byte) 200; 
		
		
		short s = 200;
		s = b ;
		
		int a = 100;
		
		long num = 100 ;
		
		
		long num1 = 21474836487L ;
		
//		int num1 =  (int)  num ;
		
		float f = 10.0f ;
		
		
		
		f = a;                   //stroing int in a float;
		System.out.println("f=a : " + f);
		
		float f1 = 100.9f;
		int x = (int) f1 ;
		System.out.println("x = f1 " + x);
		
		double d = 100.5 ;
		
		
		float f5;
		f5 = num1;
		System.out.println("f5 : " + f5);   //21474836500
		
		long l10 = (long) f5 ;
		System.out.println("l10 : " + l10);   //21474836500

		
		double d5;
		d5 = num1 ;
		System.out.println("d5 : " + d5);   //21474836500
		
		long l11 = (long) d5;
		System.out.println("l11 : " + l11);   
		
		
	}
	

}
