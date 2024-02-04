package com.learning;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class ArrayListDemo {

	public static void main(String[] args) {

		// Constructors 1.
		ArrayList al = new ArrayList(); /// initial capacity 10 by default would be created

		/// Constructor 2.
		ArrayList al2 = new ArrayList(1000); //// initial capacity 1000

		Set s = new HashSet();

		/// Constructor 3
		ArrayList a3 = new ArrayList(s);
		ArrayList a4 = new ArrayList(al2);

		System.out.println("1 Size of ArrayList : " + al.size());

		al.add("Rahul");
		al.add("Raj");
		al.add(10); /// 10 --> new Integer();
		al.add("Rahul");
		al.add("Raj");
		al.add(10); /// 10 --> new Integer();
		al.add("Rahul");
		al.add("Raj");
		al.add(10); /// 10 --> new Integer();
		al.add("Rahul");
		al.add("Raj");
		al.add(10); /// 10 --> new Integer();
		al.add("Rahul");
		al.add("Raj");
		al.add(10); /// 10 --> new Integer();
		al.add("Rahul");
		al.add("Raj");
		al.add(10); /// 10 --> new Integer();
		al.add("Rahul");
		al.add("Raj");
		al.add(10); /// 10 --> new Integer();
		al.add("Rahul");
		al.add("Raj");
		al.add(10); /// 10 --> new Integer();
		al.add("Rahul");
		al.add("Raj");
		al.add(10); /// 10 --> new Integer();
		al.add("Rahul");
		al.add("Raj");
		al.add(10); /// 10 --> new Integer();

		System.out.println("2 Size of ArrayList : " + al.size());

		///
		System.out.println("return type of add method " + al2.add(100));
		al2.add(1, 100);
		al2.addAll(al);

		for (int i = 0; i < al2.size(); i++) {
			System.out.println(al2.get(i));
		}

		System.out.println(al2);

		/// Check if "Ram" is present in given arraylist al2, if present then print
		/// "Positive" else print "Negative"

		int idxOfRam = al2.indexOf("Ram");

		if (idxOfRam < 0) {
			System.out.println("Negative");
		} else {
			System.out.println("Positive");
		}

		System.out.println();
		System.out.println("Object on 7th index : " + al2.get(7));

		// Replace this 7th position obj with some new object "NEWOBJECT", and add the
		// old object whihc was at 7th pos to 10th pos.

		// al2.add(7, "NEWOBJECT");
		Object oldObjAt7 = al2.set(7, "NEWOBJECT");

		System.out.println("Now Object on 7th index : " + al2.get(7));
		System.out.println("Old object of 7th pos :" + oldObjAt7);
		System.out.println("\n" + al2);

		Object[] objArr = al2.toArray();

		System.out.println(objArr[1]);

		ArrayList studentsList = new ArrayList();
		Student s1 = new Student(12, "Karan");
		Student s2 = new Student(14, "John");
		Student s3 = new Student(18, "Kane");
		Student s4 = new Student(21, "Susane");

		studentsList.add(s1);
		studentsList.add(s2);
		studentsList.add(s3);
		studentsList.add(s4);
		//studentsList.add(99.0f); /// . Type safety

		System.out.println("Students list : " + studentsList);

		for (int i = 0; i < studentsList.size(); i++) {

			Student tempStd = (Student) studentsList.get(i); // type casting
			System.out.println(tempStd);

		}

		// Generics

		System.out.println("\nWith generics : ");

		ArrayList<Student> stdList = new ArrayList<Student>();

		stdList.add(s1);
		stdList.add(s2);
		stdList.add(s3);
		stdList.add(s4);
		//stdList.add(new Float(99.0f)); ///. Type safety

		for (int i = 0; i < stdList.size(); i++) {
			Student tempStd = stdList.get(i); // type casting
			System.out.println(tempStd);

		}

		ScienceStudent s5 = new ScienceStudent();

		stdList.add(s5);

		// Enchanced For loop in Java
		// for-each loop

		System.out.println("\nFor each loop");

		for(int i=0 ; i < 10; i++) {
			Student tempStudent = stdList.get(i);
			System.out.println(tempStudent);
		}
		
		for (Student tempStudent : stdList) {
			System.out.println(tempStudent);
		}

		/// Synch and non-sync
		List<Student> syncStdList = Collections.synchronizedList(stdList);

		
		LinkedList<Student> llStd = new LinkedList<Student>();
		
		//ArrayList al6 = new ArrayList();
		
		//ArrayList<Integer> al7 = new ArrayList<Integer>();
		
		List<Integer> al8 = new ArrayList<Integer>();
			
		
	}

}
