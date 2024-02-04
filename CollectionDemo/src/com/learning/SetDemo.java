package com.learning;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import com.learning.donotchange.Vehicle;



public class SetDemo {

	public static void main(String[] args) {

		Set<Integer> s1 = new HashSet<Integer>();

		System.out.println("Element added 50 : " + s1.add(50));
		System.out.println("Element added 150 : " + s1.add(150));
		System.out.println("Element added 250 : " + s1.add(250));
		System.out.println("Element added 50 : " + s1.add(50));

		System.out.println(s1);
		System.out.println("\n\n\n");

		
		
		
		///Remove all duplicate elements from a list with maintaining the insertion order.
		String s = "jkghjfhgfdhhgjkhg";

		char[] sArray = s.toCharArray();

		List<Character> slist = new ArrayList<Character>();

		// converting array to list , the old style
		for (Character c : sArray) {
			slist.add(c);
		}

		System.out.println("The String in List form is : " + slist);

		Set<Character> sSet = new LinkedHashSet<Character>(slist);

		System.out.println("The string in set form is : " + sSet);
		
		
		
		
		///Find first repeating character in a String or Array or List
		String str1 = "uiytrerhdjfghkkl";
		
		char[] strCharArray = str1.toCharArray();
		
		Set<Character> uniqueCharSet = new HashSet<Character>();
		
		for(char c : strCharArray) {
			
			boolean isUnique = uniqueCharSet.add(c);
			if(!isUnique) {
				System.out.println("The first repeating character is : " + c);
				break;
			}
			
		}
		
		System.out.println("\n\n\n");
		
		
		//Custom class duplicates and case
		/*
		Set<Student> studentSet = new HashSet<Student>();
		
		Student std1 = new Student("Raj", "Biology");
		Student std2 = new Student("Ram", "Maths");
		Student std3 = new Student("Raj", "Biology");
		
		if(std1 == std3) {
			System.out.println("Equal by == ");
		}
		
		if(std1.equals(std3)) {
			System.out.println("Equal by equal method ");
		}
		
		System.out.println(std1.hashCode());
		System.out.println(std3.hashCode());
		
		System.out.println(studentSet.add(std1));
		System.out.println(studentSet.add(std2));
		System.out.println(studentSet.add(std3));
		
		*/	
		
		

		//// SortedSet(I) and NavigableSet(I)

		System.out.println("\n\n\n*************************TreeSet***********************************");

		TreeSet<Integer> marks = new TreeSet<Integer>();

		System.out.println(marks.add(100));
		System.out.println(marks.add(100));

		System.out.println(marks.add(90));
		marks.add(80);
		marks.add(120);
		marks.add(145);
		marks.add(70);
		marks.add(60);

		System.out.println("marks treeSet is : " + marks);

		// Comparable interface -- compareTo method

		Integer i1 = 10;

		System.out.println(i1.compareTo(10));
		System.out.println(i1.compareTo(90));
		System.out.println(i1.compareTo(9));

		TreeSet<Student> students = new TreeSet<Student>();

		Student st1 = new Student(1, "Rahul");
		Student st2 = new Student(23, "Sumedh");
		Student st3 = new Student(45, "Karan");
		Student st4 = new Student(5, "Rahul");

		students.add(st1);
		students.add(st3);
		students.add(st2);
		System.out.println(students.add(st4));

		// st1.compareTo(new ArrayList<Integer>());

		System.out.println(students);

		//// Comparator interface
		TreeSet<Vehicle> vehicles = new TreeSet<Vehicle>(new VehicleComparator());

		Vehicle v1 = new Vehicle(2000, "Honda");
		Vehicle v2 = new Vehicle(2400, "Hundyai");
		Vehicle v3 = new Vehicle(20000, "Ferrari");
		Vehicle v4 = new Vehicle(1500, "Tata");
		Vehicle v5 = new Vehicle(20000, "Jaguar");

		vehicles.add(v1);
		vehicles.add(v2);
		vehicles.add(v3);
		vehicles.add(v4);
		vehicles.add(v5);

		System.out.println(vehicles);



	}

}
