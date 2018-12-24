package com.factory;

public class Circle implements Shape {
	private double radius;

	public Circle(double radius) {
		this.radius = radius;
	}

	public double area() {
		return 22 / 7 * radius * radius;
	}

	public double perimeter() {
		return 2 * 22 / 7 * radius;
	}

}
