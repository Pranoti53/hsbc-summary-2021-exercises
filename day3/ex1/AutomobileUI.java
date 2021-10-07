package com.hsbc.day3.ex1;

public class AutomobileUI {
	public static void printVehicle(Vehicle vehicle) {
		vehicle.wheels();
		System.out.println("Mileage: "+vehicle.getMileage());
		System.out.println("Price: "+vehicle.getPrice());
	}
}
