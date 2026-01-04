package com.inheritence.level1;

public class Vehicle {
	private int maxSpeed;
	private String fuelType;
	public void displayInfo() {
		System.out.println("The speed of vehicle is: "+maxSpeed
							+"\nThat run's on "+fuelType);
	}
	Vehicle(int maxSpeed , String fuelType){
		this.maxSpeed = maxSpeed;
		this.fuelType = fuelType;
	}
}


