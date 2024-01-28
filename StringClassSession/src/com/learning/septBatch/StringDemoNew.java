package com.learning.septBatch;

public class StringDemoNew {

	public static void main(String[] args) {

		String s1 = "Rahul";
		String s2 = "Rahul";

		if(s1==s2) {
			System.out.println("s1 and s2 are same object in memory");
		} else {
			System.out.println("s1 and s2 NOT SAME in memory");
		}
		
		s1 = "KL " + s1;
		//Bonus question :- What is immutable class in Java and create a custom immutable class. 
		
		
		/*
		System.out.println("s1 = "+ s1);
		System.out.println("s2 = "+ s2);
		
		Employee e1 = new Employee("Raj", 45, 30);
		Employee e2 = new Employee("Somya", 47, 35);
		Employee e3 = e1;
		
		System.out.println("e1 = " + e1);
		System.out.println("e2 = " + e2);
		System.out.println("e3 = " + e3);
		
		e1.setSalary(32);
		
		System.out.println("After");
		System.out.println("e1 = " + e1);
		System.out.println("e2 = " + e2);
		System.out.println("e3 = " + e3);
		*/

		
		/*
		String s3 = new String("Rahul");
		String s4 = new String("Rahul");
	
		if(s3==s4) {
			System.out.println("s4 and s3 are same object in memory");
		} else {
			System.out.println("s4 and s3 NOT SAME in memory");
		}
		*/
		
		
		//charAt method
		
		String str = new String("kjghgjjhgdhdjhdjhgfhjgfjkhfkhjgfd");
		char c2 = str.charAt(2);
		System.out.println("c2 : " + c2);
		
		
		//concat method
		String  str1 = new String("Hello");
		str1 = str1.concat(" world !!!");
		System.out.println("str1 : " + str1);
		
		//equals method 
		String str2 = new String("Rahul");
		String str3 = new String("Rahul");

		if(str2.equals(str3)) {
			System.out.println("str2 and str3 have same content");
		} else {
			System.out.println("sstr2 and str3 NOT SAME content");
		}
		
		String str4 = new String("Rahul");
		String str5 = new String("rAHUL");

		if(str4.equals(str5)) {
			System.out.println("str4 and str5 have same content");
		} else {
			System.out.println("str4 and str5 NOT SAME content");
		}
		
		if(str4.equalsIgnoreCase(str5)) {
			System.out.println("str4 and str5 have same content, case insensitive");
		} else {
			System.out.println("str4 and str5 NOT SAME content case insensitive");
		}
		
		
		//5. public String substring(int begin);
		String str6  = new String("ABCDEFGHIJKLMNOPQRSTUVWXYZ");
		String str7 = str6.substring(10);
		System.out.println("str7 : " + str7);

		String str8 = str6.substring(10, 15);
		System.out.println("str8 : " + str8);
		
		//8. public String replace(char old, char new);
		//9. public String toLowerCase();
		String str9 = str6.toLowerCase();
		System.out.println("str9 : " + str9);
		
		//11. public String trim();
		String str10 = "    Hello There how are you        ";
		String str11 = str10.trim();
		System.out.println("Before trim str10 : " + str10);
		System.out.println("After trim str11 : " + str11);
		
		
		//12. public int indexOf(char ch);
		int i = str6.indexOf('a');
	
		int i2 = str6.indexOf("BCD");
		
		System.out.println("index of a : " + i);
		System.out.println("index of BCD : " + i2);
		
		//
		String str12 = "AAAFFGFGGGFGAAABNNB";
		int firstOcc = str12.indexOf('A');
		
		int lastOcc = str12.lastIndexOf('A');
		System.out.println("firstOcc of A : " + firstOcc);
		System.out.println("lastOcc of A : " + lastOcc);
		
	}

}
