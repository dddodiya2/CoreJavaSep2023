package com.learning;

public class StringDemo {
	
	
	
	/*
	"" --> String
	" " ---> String 
	"a"  ---> String 
	"abc" --> String 
	*/

	//Assigments :-
	/*
	Write a Java method to check whether a string is a valid password. 
		Password rules:
		A password must have at least ten characters.
		A password consists of only letters and digits.
		A password must contain at least two digits.
		
		main(){
			s = "GKHjhdf";
			isValid(s);
		}
		
		public static boolean isValid(String s ){
		
		}
	
	Write a Java method that checks whether all the characters in a given string are vowels (a, e,i,o,u) or not. Return true if each character of the string is a vowel, otherwise return false.

		Expected Output:
		Input a string:  AIEEE
		Check all the characters of the said string are vowels or not!
		true

Write a Java program to find the most frequent character in a given string

Write a Java program to find the second most frequent character in a given string

Write a Java program to find length of the longest substring of a given string without repeating characters

Write a Java program to find first non repeating character in a string
ABCABCDHVNBAD


Write a Java program to divide a string in n equal parts.

Write a Java program to reverse a string using recursion

Write a Java method to count all words in a string

Write a Java program to reverse words in a given string
	The given string is: Reverse words in a given string
	The new string after reversed the words: string given a in words Reverse
	
Write a Java program to remove "b" and "ac" from a given string

Write a Java program to return the sum of the digits present in the given string. If there is no digits the sum return is 0\
	The given string is: ab5c2d4ef12s
	The sum of the digits in the string is: 14
	
	*/
	
	
	public static void main(String[] args) {
		
		
		/*
		//String s1 = "I love my India"; 
		String s1 = new String("I love my India");         ///   2 objects in the memory -- 1 in heap , 1 in SCP
		String s3 = "I love my India";                      /// 1 object in SCP
		//String s2 = new String("I love my India");         ////  1 Object in Heap.
		//String s4 = new String("I love my India"); 
		
		
		
		
		if(s1==s3) {
			System.out.println("Hello");
		}else
		{
			System.out.println("bye");
		}
		
		if(s1.equals(s3)) {
			System.out.println("Hello");
		}else
		{
			System.out.println("bye");
		}
		
		s1 = s1 + " So much";       //  I love my India So much 
		
		System.out.println(s1);
		*/
		
		//String s5 = new String("Hello World !");
		//char[] charStringArray =  {'a', 'b', 'c' , 'd'} ;
		//String s5 = new String(charStringArray) ;
		//String s5 = "Hello world !";
		String s5 = new String("Hello World !");
		System.out.println(s5.charAt(10));
		
		
		//s5 = s5 + " on Mars";   // Hello World ! on Mars
		
		s5 = s5.concat(" on Mars");      ///     Hello World ! on Mars
		
		System.out.println(s5);
		System.out.println(s5.equalsIgnoreCase("hello world !ON MARS"));
		
		String s6 = s5.substring(5);
		
		System.out.println(s6);
		
		
		String s7 =  s5.substring(5, 12);
		
		System.out.println(s7);
		
		String s8 = new String("     Hello How are you ?                ");
		String s9 = s8.trim();
		
		System.out.println(s8);
		System.out.println(s9);
		
		String s13 = new String(" ");
		String s10 = new String("");
		String s11 = new String();
		String s12 = null ;
		
		
		System.out.println("s10 : " +   s10.length());
		System.out.println("s11 : " +   s11.length());
		
		System.out.println("s13 : " +   s13.length());
		//System.out.println("s12 : " +   s12.length());

		
		
		System.out.println("s10 : " +   s10.isBlank());   
		System.out.println("s11 : " +   s11.isBlank());
		System.out.println("s13 : " +   s13.isBlank());
		//System.out.println("s12 : " +   s12.length());
		
		System.out.println("s10 : " +   s10.isEmpty());   
		System.out.println("s11 : " +   s11.isEmpty());
		System.out.println("s13 : " +   s13.isEmpty());
		//System.out.println("s12 : " +   s12.length());
		
		/////// 
		System.out.println();
		String s15 = "ajghfdhjkhjlhaskffhdjsreswhfhjgfdsasdfghjgfasvahfdfhgjedjhvcdbvbj";
		
		
		System.out.println(s15.indexOf('j'));
		System.out.println(s15.lastIndexOf('j'));
		System.out.println(s15.length());
		
		int[] a = new int[5];
		System.out.println(a.length);
		
		/*
		 * int count = 0; for(int i = 0 ; i < s15.length(); i++) {
		 * 
		 * if(s15.charAt(i) == 'j') { count++; } }
		 */
		
		
		char[] s15Array = s15.toCharArray();
		
		
		// contains method 
		
		float f = 100.0f ;       //---> "100.0"
		String sf = String.valueOf(f);
		System.out.println("Value of f " + sf);
		
	
	}

}
