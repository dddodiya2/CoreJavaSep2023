package com.learning;

public class StringBufferDemo {

	public static void main(String[] args) {
		
		Object o = new Object();
		o  = new Object();
		
		String str = "Rahul";     ///  SCP
		str = "Minakshi";
		
		String str2 = "Rahul";      //
		
			
		StringBuffer s = new StringBuffer("Hello");
		StringBuffer s0 = new StringBuffer();
		StringBuffer sb1 = new StringBuffer(100);
		
		
		
		
		System.out.println("Stringbuffer capacity :" + s.capacity());
		System.out.println("Stringbuffer capacity s0:" + s0.capacity());
		System.out.println("Stringbuffer capacity sb1:" + sb1.capacity());
		sb1.append("jkhgjfhfhgfhghjgjhfghjkjkgfghgmhjgkjghjgkffdjhgdfgdfgddgddfdgfdfgdgfdghdffdggf");
		sb1.append("jkhgjfhfhgfhghjgjhfghjkjkgfghgmhjgkjghjgkffdjhgdfgdfgddgddfdgfdfgdgfdghdffdggf");
		sb1.append("jkhgjfhfhgfhghjgjhfghjkjkgfghgmhjgkjghjgkffdjhgdfgdfgddgddfdgfdfgdgfdghdffdggf");
		sb1.append("jkhgjfhfhgfhghjgjhfghjkjkgfghgmhjgkjghjgkffdjhgdfgdfgddgddfdgfdfgdgfdghdffdggf");
		
		System.out.println("\n"+ sb1 + "\n" + "Stringbuffer capacity sb1:" + sb1.capacity()  );
		
		
		
		
		//s = s.append(" world ");  no need to do this
		
		s.append('!');
		s.append(" ");
		s.append(3);
		s.append(" ");
		s.append("jkhgjfhfhgfhghjgjhfghjkjkgfghgmhjgkjghjgkffdjhgdfgdfgddgddfdgfdfgdgfdghdffdggf");
		
		System.out.println(s);
		System.out.println("Stringbuffer capacity :" + s.capacity());
		System.out.println();
		
		
		StringBuffer s1 = new StringBuffer("Hello");
		StringBuffer s2 = new StringBuffer("Hello");
		
		if(s1==s2) {
			System.out.println("barabar hai");
		}else {
			System.out.println("barabar nahi hai");
		}
		
		System.out.println("Equals method ");
		
		if(s1.equals(s2)) {
			System.out.println("barabar hai");
		}else {
			System.out.println("barabar nahi hai");
		}
		
		
		// Newcapacity=(currentcapacity+1)*2.
		
		StringBuffer sb10 = new StringBuffer(5);
		System.out.println();
		System.out.println();
		System.out.println("sb10 initial capacity :" + sb10.capacity());
		
		
		sb10.append("Hello");
		System.out.println("sb10 capacity after capacity(5) caharcaters:" + sb10.capacity());
		
		
		sb10.append('!');
		System.out.println("sb10 capacity capacity + 1 :" + sb10.capacity());
		
		
	}

}
