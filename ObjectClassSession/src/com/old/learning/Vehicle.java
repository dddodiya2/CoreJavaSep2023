package com.old.learning;

public class Vehicle implements Cloneable {

	private String vehicleType;
	private int numberOfWheels;
	private Engine engineOfVehicle;
	
	//Shallow clonning	
	/*
	@Override
	protected Object clone() throws CloneNotSupportedException {
		//return super.clone();
		Vehicle newVehicle = new Vehicle(this.vehicleType, this.numberOfWheels);
		Engine eTemp = this.engineOfVehicle;
		newVehicle.setEngineOfVehicle(eTemp);	
		return newVehicle;
	}
	*/
	
	//	//Deep clonning
	@Override
	protected Object clone() throws CloneNotSupportedException {
		//return super.clone();
		Vehicle newVehicle = new Vehicle(this.vehicleType, this.numberOfWheels);
		Engine eTemp = new Engine(this.engineOfVehicle.getIgnitionType());		
		newVehicle.setEngineOfVehicle(eTemp);	
		return newVehicle;
	}
	

	@Override
	public String toString() {
		String s = "This is a Vehicle having type : " + vehicleType + " and has : " + numberOfWheels + " Wheels !"
				+ " has engine of Type : " + 
				( (engineOfVehicle == null) ? "Engine is null" : engineOfVehicle.toString() ) ;
		return s;
	}
	
	@Override
	public boolean equals(Object obj) {
			
		try {
			Vehicle v1 = (Vehicle) obj;
			if (this.vehicleType == v1.vehicleType && this.numberOfWheels == v1.numberOfWheels 
					&&  
					 ( (this.engineOfVehicle == null ) ? false :  this.engineOfVehicle.equals(v1.engineOfVehicle) ) ) {
				return true;
			}else {
				return false;
			}
		}catch(ClassCastException e) {
			return false;
		}catch(NullPointerException n) {
			return false;
		}
		
	}
	

	public Vehicle(String vehicleType, int numberOfWheels) {
		this.vehicleType = vehicleType;
		this.numberOfWheels = numberOfWheels;
	}

	public String getVehicleType() {
		return vehicleType;
	}

	public void setVehicleType(String vehicleType) {
		this.vehicleType = vehicleType;
	}

	public int getNumberOfWheels() {
		return numberOfWheels;
	}

	public void setNumberOfWheels(int numberOfWheels) {
		this.numberOfWheels = numberOfWheels;
	}


	public Engine getEngineOfVehicle() {
		return engineOfVehicle;
	}

	public void setEngineOfVehicle(Engine engineOfVehicle) {
		this.engineOfVehicle = engineOfVehicle;
	}
	
}
