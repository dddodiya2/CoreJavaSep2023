package com.learning;

import java.util.Comparator;

import com.learning.donotchange.Vehicle;

public class VehicleComparator implements Comparator<Vehicle> {

	@Override
	public int compare(Vehicle o1, Vehicle o2) {
		
		if(  o1.getPower() - o2.getPower() != 0 ) {
			return o1.getPower() - o2.getPower();
		}
		return o1.getBrand().compareTo(o2.getBrand());
	}

}
