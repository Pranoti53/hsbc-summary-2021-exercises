package com.hsbc.day3.ex2;

public class Circle implements Shape {
	final double pi=3.14;

	public String area(double radius) {
		double area= (pi*radius*radius);
		return "Area: "+area;
	}
	

}
