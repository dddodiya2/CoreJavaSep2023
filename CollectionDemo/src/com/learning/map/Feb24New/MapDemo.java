package com.learning.map.Feb24New;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import com.learning.map.Student;

public class MapDemo {

	public static void main(String[] args) {
		// Hold percentage for each student name
		// String, Double
		Map<String, Double> map = new HashMap<String, Double>();

		map.put("Raj", 90.00);
		map.put("John", 55.0);
		map.put("Rose", 91.00);

		System.out.println("1 : Map " + map);

		// Get the % for John
		System.out.println("2 Percenatge for John is : " + map.get("John"));

		// Get the % for Lily
		System.out.println("3 Percenatge for Lily is : " + map.get("Lily"));

		// check if the John key is present
		if (map.containsKey("John")) {
			System.out.println("4 key is present for John");
		} else {
			System.out.println("4 key is not present for John");
		}

		// check if the Lily key is present
		if (map.containsKey("Lily")) {
			System.out.println("5 key is present for Lily");
		} else {
			System.out.println("5 key is not present for Lily");
		}

		/// Similary you can check for values

		// duplicates are allowed for VALUES only
		map.put("Lily", 90.00);
		System.out.println("6 : Map " + map);

		// Duplicates not allowed for Key
		map.put("John", 80.00);
		System.out.println("7 : Map " + map);

		System.out.println("8 Percentage from John is : " + map.get("John"));

		Set<Entry<String, Double>> entrySet = map.entrySet();

		for (Entry itemEntry : entrySet) {
			System.out.println("Key- " + itemEntry.getKey() + " : Value- " + itemEntry.getValue());
		}

		
		Map<Student, Double> map1 = new HashMap();
		Student s1 = new Student("Karan", 1);
		Student s2 = new Student("Jony", 10);
		Student s3 = new Student("Joey", 90);
		
		map1.put(s1, 90.00);
		
		
	}

}
