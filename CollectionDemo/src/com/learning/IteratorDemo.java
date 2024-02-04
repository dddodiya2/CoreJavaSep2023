package com.learning;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class IteratorDemo {

	public static void main(String[] args) {
		
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		
		numbers.add(100);
		numbers.add(200);
		numbers.add(300);
		numbers.add(400);
		numbers.add(500);
		////5th index
		numbers.add(600);
		numbers.add(700);
		numbers.add(800);
		numbers.add(900);
		numbers.add(1000);
		numbers.add(1100);
		
		Iterator<Integer> itr =   numbers.iterator();
		
		while(itr.hasNext()) {
			Integer temp = itr.next();
			System.out.println(temp);
			if(temp > 1000) {
				System.out.println("Index of the element grete 1000 is :- " + numbers.indexOf(temp));
			}
		}

		
		ListIterator<Integer> itrList =   numbers.listIterator();
		
		while(itrList.hasNext()) {
			itrList.add(10);
			System.out.println(itrList.next());
		}
		
		System.out.println();
		System.out.println(numbers);
		
		while(itrList.hasPrevious()) {
			System.out.println(itrList.previous());
		}
		
	}

}
