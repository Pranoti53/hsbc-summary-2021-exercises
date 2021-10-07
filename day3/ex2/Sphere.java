package com.hsbc.day3.ex2;

public class Sphere implements Shape{

	final double pi=3.14;
	public float area(double radius) {
		double area=(4*pi*radius*radius);
		
		return (float) area;
	}

}
