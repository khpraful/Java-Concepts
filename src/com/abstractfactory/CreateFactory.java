package com.abstractfactory;

public class CreateFactory {

	public static AbstractFactory ReturnFactory(String factorytype) {
		if (factorytype.equalsIgnoreCase("SHAPE")) {
			return new ShapeFactory();
		} else if (factorytype.equalsIgnoreCase("COLOUR")) {
			return new ColourFactory();
		} else if (factorytype.equalsIgnoreCase("SIZE")) {
			return new SizeFactory();
		} else {
		}
		return null;
	}
}
