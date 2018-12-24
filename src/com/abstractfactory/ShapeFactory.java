package com.abstractfactory;

public class ShapeFactory extends AbstractFactory{

	public Shape ReturnShape(String type) {
		if (type.equalsIgnoreCase(Shape.Square)) {
			return new Square();
		} else if (type.equalsIgnoreCase(Shape.Circle)) {
			return new Circle();
		} else {
			return null;
		}

	}

	public Colour ReturnColour(String colour) {
		// TODO Auto-generated method stub
		return null;
	}

	public Size ReturnSize(String size) {
		// TODO Auto-generated method stub
		return null;
	}

}
