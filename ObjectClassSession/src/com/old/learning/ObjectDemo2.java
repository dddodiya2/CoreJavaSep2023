package com.old.learning;

public class ObjectDemo2 {

	
	
	
	public static void main(String[] args) {
		
		
		String s = new String("Raman");
		String s2 = new String("Raman");
		Object a = new Object();
		ObjectDemo d1   = new ObjectDemo();
		Vehicle v1 = new Vehicle("Car", 4);
		Vehicle v2 = new Vehicle("Bike", 2);
		
		System.out.println(s.hashCode());
		System.out.println(s2.hashCode());
		System.out.println(a.hashCode());
		System.out.println();
		System.out.println(d1.hashCode());
		System.out.println(v1.hashCode());
		System.out.println(v2.hashCode());
		
		///toString() method 
		// Object class toString() method gives output as className@hashCodeInHexaDecimalForm
		// toString() method should be overridden in such a way that it provides meaningful description of the Object.
		
		Vehicle v3 = new Vehicle("Car", 4);
		Vehicle v4 = new Vehicle("Bike", 2);
		
		System.out.println();
		
		System.out.println(v3.getClass().getName());
		System.out.println(v3.hashCode());
		System.out.println(v3);           //// internally calling toString() method 
		System.out.println(v3.toString());
		
		
		int p = 10;
		int q = 10;
		
		if( p== q ) {
			System.out.println("Hello");
		}else {
			System.out.println("Bye");
		}
		
		// vehicle v1, v2 , v3 , v4
		/*
		Vehicle v1 = new Vehicle("Car", 4);
		Vehicle v2 = new Vehicle("Bike", 2);
		Vehicle v3 = new Vehicle("Car", 4);
		Vehicle v4 = new Vehicle("Bike", 2);
		*/
		// ==   --> always compares refrences   ----> memory addresses
		
		System.out.println();
		System.out.println("by == operator");
		
		if( v1==v3 ) {
			System.out.println("V1 nd v3 are equal");
		}else{
			System.out.println("V1 nd v3 are not equal");
		}
		
		// .equals() method of Object class compares only refrence 
		System.out.println("\nby .equals method");
		if( v1.equals(v3)) {
			System.out.println("V1 nd v3 are equal");
		}else {
			System.out.println("V1 nd v3 are not equal");
		}
		
		//class Cast exception 
		String v5 = "SomeString";
		if(v1.equals(v5)) {
			System.out.println("V1 nd v5 are equal");
		}else {
			System.out.println("V1 nd v5 are not equal");
		}

		//
		Vehicle v6 = null;
		if(v1.equals(v6)) {
			System.out.println("V1 nd v6 are equal");
		}else {
			System.out.println("V1 nd v6 are not equal");
		}
		
		
		String s8 = new String("Rahul");
		String s9 = new String("Rahul");
		
		System.out.println("String class comparision");
		System.out.println(s8==s9);
		System.out.println(s8.equals(s9));	
		
		
		System.out.println("\n\nClonning");
		///Clonning
		/*
		Vehicle v10 =null ;
		try {
			v10 = (Vehicle) v1.clone();
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("Clone is not possible");
		}
		
		System.out.println(" v1 : " +  v1);
		System.out.println(" v10 : " + v10);
		
		
		System.out.println(v1==v10);
		System.out.println(v1.hashCode());
		System.out.println(v10.hashCode());
		
		System.out.println("after updates");
		v1.setNumberOfWheels(6);
		
		System.out.println(" v1 : " +  v1);
		System.out.println(" v10 : " + v10);
		
		*/
		
		////Clonning example deep clonning
		
		System.out.println("\n\n Deep Clonning");
		Vehicle v11 = new Vehicle("Bus", 8);
		Engine e1 = new Engine("combustion type");
		v11.setEngineOfVehicle(e1);
		
		
		Vehicle v12 = null;
		try {
			v12 = (Vehicle) v11.clone();
		}catch(CloneNotSupportedException c) {
			System.out.println("Clonning is not possible");
		}
		
		System.out.println(" v11 : " +  v11);
		System.out.println(" v12 : " + v12);
		
		/*
		System.out.println(" after updates");
		Engine e2 = new Engine("5G type");
		v11.setEngineOfVehicle(e2);
		
		System.out.println(" v11 : " +  v11);
		System.out.println(" v12 : " + v12);
		*/
		
		System.out.println(" after updates");
		Engine engineOfV11 = v11.getEngineOfVehicle();
		engineOfV11.setIgnitionType("new ignition technology");
		
		System.out.println(" v11 : " +  v11);
		System.out.println(" v12 : " + v12);
		
		
		
	}

}
