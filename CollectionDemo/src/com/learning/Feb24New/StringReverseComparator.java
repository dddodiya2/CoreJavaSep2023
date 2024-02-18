package com.learning.Feb24New;

import java.util.Comparator;

public class StringReverseComparator implements Comparator<String> {
	
	@Override
	public int compare(String obj1, String obj2) {
		String s1 = (String) obj1;
		String s2 = (String) obj2;
		
		return -s1.compareTo(s2);
	}

}
