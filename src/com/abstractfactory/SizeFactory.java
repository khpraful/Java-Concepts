package com.abstractfactory;

public class SizeFactory extends AbstractFactory {
	public Size ReturnSize(String size) {
		if (size.equalsIgnoreCase("big")) {
			return new Big();
		} else if (size.equalsIgnoreCase("small")) {
			return new Small();
		} else {
			return null;
		}
	}

	public Shape ReturnShape(String shape) {
		// TODO Auto-generated method stub
		return null;
	}

	public Colour ReturnColour(String colour) {
		// TODO Auto-generated method stub
		return null;
	}
}
