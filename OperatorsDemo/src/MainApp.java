
public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a = 50;
		int b = 9;
		
		
		float f = a +  b ;   /// Operation on 2 int --> int (but it can be stored in float)
		
		System.out.println(f);
		
		float f1 = 50.0f;
		float f2 = 9.0f;
		
		//int c = f1 + f2 ;   // opern on 2 floats --> float (which can't be stored in int)
		
		 System.out.println( a + f1 );   //float
		 System.out.println( a - f2 );   //float
		 
		 
		 System.out.println( a/b );     // 		50/9      ----> 5
		 System.out.println( a/f2 );     // 	50/9.0f    ---> 5.555
		 System.out.println( f1/f2 );     // 	50.0/9.0f  ----> 5.555 
		 
		 //When u perform any arithmatic operation , so the output dataType will be max(int, type1, type2)
		 
		 byte b1 = 10;
		 byte b2 = 15;
		 
		 //byte b3 = b1 + b2 ;
		 
		 short s1 = 10;
		 short s2 = 15;
		 
		 //short s3 = s1 + s2 ; 
		 //short s4 = b1 + s1 ;
		 
		// Arithmatic operators --
//		   + - * / %   
		/*
		 
		max(datatype1, dataType2 , int)  ---> max(byte, byte , int)
		 
		float, int ---> float
		byte, double --> double 
		byte , short --> int
		 
		 */
		 
		 double d = 10.0/3 ;
		 System.out.println(d);    /// 3.3333 
		 
		 
		 int i1 = 10 ;
		 int i2 = 3 ;
		 
		 double d1 = (i1*1.0) / i2 ;
		 System.out.println(d1);
		 
		 // 10 * 1.0 -- > 10.0 
		 
		 
		 int p1 = 6;
		 int x = p1%2;
		 System.out.println("Reminder : " + x);
		 
		 //Division
		//even number
		 //odd number
		 //prime number
		 
	 //// Relational Operators 
		 /* 
		  
		 > 
		 < 
		 >=
		 <=
		 
		 */
		 
		 int prachiAge = 20;
		 int DhanAge = 21;
		 
		 // yes or no 
		 // true or false 
		 //boolean 
		 
		 boolean older = prachiAge > DhanAge ;
		 
		 System.out.println(older);
		 
		 
	///  Equality Operators 
		 /*
		   
		  ==   Double equals Operator
		  !=   not equals operator
		   
		  */
		 
		 boolean isEqual = prachiAge == DhanAge ; 
		 boolean isDiff  = prachiAge != DhanAge ;
		 
		int t1 = 100;
		float tf = 100.0f;
		 
		 boolean d10 = t1 == tf ;
		 System.out.println(d10);
		 
    // instanceOf Operator 
		 
		 
		 //Logical Operator 
		 /*
		 &&  -- logical and 
		 ||  -- logical Or
		 
		 T && T ---> T                   T || T --> T
		 T && F ---> F                   T || F --> T
		 F && T ---> F                   F || T --> T
		 F && F ---> F                   F || F --> F
		 
		 */
		 
		  int ar = 20;
		  int pr = 19;
		  int dh = 22;
		 
		  
		  
		 
		 /* 
		  Assignment :-
		  
		  1. Check if given number is odd or even .(If even print 0 else print remainder)
		  2. Declare 2 variables a & b  , assign a = 100, b =200 . nd write  program to swap the values of these 2 variables.
		  3. Write a program to demonstrate the use of "/" and "%" operators.
		  4. Prctice for Relational and logical operators
		  
		 
		 */
		 

	}

}
/*


Operators in Java:-

5/2   --- 2.5   --- 2

Assignment Operator(=) :-
	int a=5;
	int a, b;
	a=b=10;
	String s = new String("MyName");
	Employee e = new Employee();

Arithmatic Operators(+, -, * , / , % ) :-
	if you perfrom arithmatic operation on int and int --> int
	if you perfrom arithmatic operation on int and float --> float
	if you perfrom arithmatic operation on int and long --> long
	if you perfrom arithmatic operation on float and long --> long
	if you perfrom arithmatic operation on byte and int --> int
	if you perfrom arithmatic operation on byte and byte --> int
	
	The result type arithmatic operation has size 
	max(type of a, type of b, int)
	

Relational Operators(> , < , >=, <=) :-
	the result of such operation will be boolean.
And would be used to take some programming decision.	
	
Equality Operators(==, !=) :-
	For premitive data types it checks the value equality.
	But for Object type or referencetype variables it checks reference equality only.
	Meaning it checks if both the objects are pointing to same object in the memory.

instanceOf Operator :-
	String s = "Kahjgfd";
	if(s instanceOf String)

BitWise Operator :-
& ,| ,  ^ 

10 ---> 1010
8  ---> 1000
&  ---> 1000 (8)	


BitWise complement Operator:-
~
int a = 10;
~a;
10-->  0000000,...01010;
~ -->  1111111,...10101;


Boolean complement operator(!) :-
	it is only applicable to boolean types.
	and it inverts the value.
	
	!true => false
	!false => true
	
	
	
Logical Operator :-
&& || 
	Again applicable on boolean types.
	Generally used to compound the conditional decisions

TypeCasting
	
	
Compound Operator(+=,  -=, *=, /=) :-

Ternary or Conditional Operator:-
	int x=(10>20)?30:40
	(condition)?true_case_actions:false_case_actions

Increment or Decrement Operator:-
	pre and post Increment  ++i, i++
	pre and post Decrement  --i, i--
	i=5  
	a = ++i;  ====> a will be 6, and i will also become 6
or  a = i++;  ====> a will be 5, and i will become 6  
	

String Concatenation Operator(+)
	
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