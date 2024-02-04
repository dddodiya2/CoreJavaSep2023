package com.learning.map;

import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.WeakHashMap;

public class MapDemo {

	public static void main(String[] args) throws InterruptedException {
		
		HashMap<Integer, String> h = new HashMap<Integer, String>();
		
		h.put(1, "Rahul");
		h.put(2, "Amruta");
		h.put(10, "Karan");
		h.put(5, "John");
		
		
		System.out.println(h);
		
		System.out.println(h.put(5, "Lora"));
		
		System.out.println(h);
		
		System.out.println();
		
		Set<Integer> keys = h.keySet();
		System.out.println("Keys : " + keys );
		
		Collection<String> c = h.values();
		System.out.println("Values are : " + c);	
		
		for(Entry<Integer,String> e : h.entrySet()) {
			System.out.println(e.getKey());
			System.out.println(e.getValue());
			
		}
		
		
		Map<Student, Integer> studentData = new LinkedHashMap<Student, Integer>();
		
		Student s1 = new Student("Prachi", 1);
		Student s2 = new Student("Prachi", 1);
		Student s3 = new Student("Archana",2);
		
		//s1.equals(s2)  == ?
		
		
		System.out.println("s1 hashcode : " + s1.hashCode());
		System.out.println("s2 hashcode : " + s2.hashCode());
		
		System.out.println("s1 index : " + s1.hashCode()%16 );
		System.out.println("s2 index : " + s2.hashCode()%16 );
		
		studentData.put(s1, 95);        ///1 -- 95 
		studentData.put(s3, 100);       /// 2 - 100
		studentData.put(s2, 99);        /// 1 - 99
		
		System.out.println(studentData);
		
		System.out.println("\n\n\n");
		Map<Student, Integer> stdData = new HashMap<Student, Integer>();
		Student s4 = new Student("Dhanashree",4);
		stdData.put(s4,100);
		System.out.println(stdData);
		s4=null;
		System.gc();
		Thread.sleep(5000);
		System.out.println(stdData);
		
		System.out.println();
		Map<Student, Integer> stdData1 = new WeakHashMap<Student, Integer>();
		Student s5 = new Student("Dhanashree",4);
		stdData1.put(s5,100);
		System.out.println(stdData1);
		s5=null;
		System.gc();
		Thread.sleep(5000);
		System.out.println(stdData1);
		
		
		
		
		
	}

}
