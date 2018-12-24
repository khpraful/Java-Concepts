package com.factory;

public class ShapeFactory {
	public static Shape createShape(String type) {
		if (type.equals(Shape.Square)) {
			return new Square(1);
		} else if (type.equals(Shape.Rectangle)) {
			return new Rectangle(2, 1);
		} else if (type.equals(Shape.Circle)) {
			return new Circle(1);
		} else {
			return null;
		}
	}

}
