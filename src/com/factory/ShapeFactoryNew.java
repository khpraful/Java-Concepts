package com.factory;

public class ShapeFactoryNew {
	public Shape createShape(String type) {
		if (type.equals(Shape.Square)) {
			return new Square(1);
		} else if (type.equals(Shape.Rectangle)) {
			return new Rectangle(1, 2);
		} else if (type.equals(Shape.Circle)) {
			return new Circle(3);
		} else {
			return null;
		}
	}

}
