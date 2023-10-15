import java.util.ArrayList;

public class MainApp2 {

	public static void main(String[] args) {
		 
		
		//instnaceof operator 
		String s = "SampleString";
		
		ArrayList l = new ArrayList();
		
		if(s instanceof String) {
			System.out.println("s is string");
		}else {
			System.out.println("s is not string");
		}
		
		
		//  && ||
		
		
		
		///Shift operator 
		byte b1 = 1;  //  ---> 0000 0001  ---> 0000 0100
		b1 = (byte) (b1 << 1);
		System.out.println("b1 is : "+ b1);
		b1 = (byte) (b1 << 1);
		System.out.println("b1 is : "+ b1);
		
		//Bitwise &
		/*
		10 --> 0000......1010   
		9  --> 0000......1000  
		----------------------
		                 1000
		*/
		
		int a = 10;
		int b = 8;
		int c = a & b ;
		 //System.out.println(a && b) ;
		
		System.out.println("Value of c is : " + c);
		
		//Bitwise |
		/*
		10 --> 0000......1010   
		9  --> 0000......1000  
		----------------------
		                 1010
		*/
		
		System.out.println("Value of a | b is : " + (a | b) );
		
		//Bitwise ^
		/*
		10 --> 0000......1010   
		9  --> 0000......1000  
		----------------------
		                 1010
		*/
		
		///Xor operation.
		
		// Boolean complement operator 
		
		boolean isAvailable = true ;
		
		isAvailable = ! isAvailable ;
		
		int x = 100;
		
		
		//Compound Operator (Arithmatic and Assignmemnt )'
		int p = 100;
		int q = 200;
		
	//	p = p + q;
 		p += q;  ////p = p + q;
 		
 		System.out.println("Value of p after addition "  + p);
		
 		//p = p - q ;
 		p -= q;
 		System.out.println("Value of p after substraction "  + p);
		
 		
 		//
 		p /= q;    // p = p/q;
 		System.out.println("Value of p after division "  + p);
		
 		
 		 // q = q/p;   In Java divide by 0 creates the java.lang.ArithmeticException: / by zero
 		
 		
 		///Increment or Decrement Operator:-
 		/*
 		pre and post Increment  ++i, i++
 		pre and post Decrement  --i, i--
 		
 		*/
 		
 		int numberOfPpl = 0;
 		System.out.println("numberOfPpl befor : "  + numberOfPpl);
 		numberOfPpl++;
 		System.out.println("numberOfPpl after : "  + numberOfPpl);
 		
 		
 		//pre increment vs post incr
 		
 		int y = 100;
 		int z = 0 ; 
 		int w = 0;
 		
 		
 		System.out.println("Step 1 : y, z, w : " + y + " " + z + " "+ w);
 		
 		z = y++ ;  //  --->    z = y ---> y = y + 1;    y = y + 1   ---> z = y;    vs 
 		System.out.println("Step 2 : y, z, w : " + y + " " + z + " "+ w);  // 101 100 0
 		
 		w = ++y;  //   y = y + 1 ; w = y
 		System.out.println("Step 3 : y, z, w : " + y + " " + z + " "+ w); // 100 101 100
 		
 		/*
 		Ternary or Conditional Operator:-
 		int x=(10>20)?30:40
 		(condition)?true_case_actions:false_case_actions
 		*/
 		
 		int k = (10>20) ? 30 : 40 ;
 		
 		System.out.println(k);
 		
	}

}


/*
 
 Operator priority or Precedence :-
1. Unary operators:  x++ , x-- , ++x , --x , ~ , ! , new , <type>
2. Arithmetic operators : * , / , % , + , - .
3. Shift operators : >> , >>> , << .
4. Comparision operators : <, <=,>,>=, instanceof.
5. Equality operators: == , !=
6. Bitwise operators: & , ^ , | .
7. Short circuit operators: && , || .
8. Conditional operator: (?:)
9. Assignment operators: += , -= , *= , /= , %= . . .
 
 
*/