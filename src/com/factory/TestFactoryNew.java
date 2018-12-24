package com.factory;

public class TestFactoryNew {

	public static void main(String[] args) {
		ShapeFactoryNew f1 = new ShapeFactoryNew();
		Shape shape = f1.createShape(Shape.Square);
		System.out.println("Area : " + shape.area());
		System.out.println("Perimeter : " + shape.perimeter());

	}

}
