package com.learning.Feb24New;

import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetDemo {

	public static void main(String[] args) {
		
		/*   // This when we want to store heterogenous objects
		Set set = new HashSet();
		set.add(10);
		set.add('A');
		set.add("SomeString"); */
		
		Set<String> set = new HashSet();
		//set.add(10);   This is not allowd fro String type of Set.
		set.add("XYZ");
		set.add("ABC");
		set.add("DEF");
		set.add("GHI");
		set.add("ABC");
		set.add("DEF");
		
		
		System.out.println(set);
		
		Set<String> set1 = new TreeSet();
		set1.add("XYZ");
		set1.add("ABC");
		set1.add("DEF");
		set1.add("GHI");
		set1.add("ABC");
		set1.add("DEF");
		System.out.println(set1);
		
		
		Set<String> set2 = new TreeSet(new StringReverseComparator());
		set2.add("XYZ");
		set2.add("ABC");
		set2.add("DEF");
		set2.add("GHI");
		set2.add("ABC");
		set2.add("DEF");
		System.out.println(set2);
		
		
		
		TreeSet<Integer> treeset =  new TreeSet();
		treeset.add(1000);
		treeset.add(800);
		treeset.add(900);
		treeset.add(1200);
		treeset.add(700);
		treeset.add(500);
		
		System.out.println(treeset);
		
		TreeSet<Integer> treeset1 =  new TreeSet(new Comparator<Integer>() {
			public int compare(Integer i1, Integer i2) {
				return -i1.compareTo(i2);
			}
		});
		treeset1.add(1000);
		treeset1.add(800);
		treeset1.add(900);
		treeset1.add(1200);
		treeset1.add(700);
		treeset1.add(500);
		
		System.out.println(treeset1);
		
		
		TreeSet<String> treeSet2 = new TreeSet();
		treeSet2.add("b");
		treeSet2.add("aaa");
		treeSet2.add("aa");
		treeSet2.add("c");
		treeSet2.add("dddddd");
		treeSet2.add("z");
		treeSet2.add("xxxxxx");
		treeSet2.add("d");
		
		System.out.println(treeSet2);
		
		TreeSet<String> treeSet3 = new TreeSet(new StringLengthComparator());
		treeSet3.add("b");
		treeSet3.add("aaa");
		treeSet3.add("aa");
		treeSet3.add("c");
		treeSet3.add("dddddd");
		treeSet3.add("z");
		treeSet3.add("xxxxxx");
		treeSet3.add("d");
		
		System.out.println(treeSet3);
		
		TreeSet<String> treeSet4 = new TreeSet(treeSet3);
		System.out.println(treeSet4);
		
	}

}
