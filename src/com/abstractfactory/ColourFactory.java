package com.abstractfactory;

public class ColourFactory extends AbstractFactory {

	public Colour ReturnColour(String type) {
		if (type.equalsIgnoreCase(Colour.Red)) {
			return new Red();
		} else if (type.equalsIgnoreCase(Colour.Blue)) {
			return new Blue();
		} else {
			return null;
		}

	}

	public Shape ReturnShape(String shape) {
		// TODO Auto-generated method stub
		return null;
	}

	public Size ReturnSize(String size) {
		// TODO Auto-generated method stub
		return null;
	}
}
