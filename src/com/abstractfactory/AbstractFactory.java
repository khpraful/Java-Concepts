package com.abstractfactory;

public abstract class AbstractFactory {

	public abstract Shape ReturnShape(String shape);

	public abstract Colour ReturnColour(String colour);
	
	public abstract Size ReturnSize(String size);

}
