package com.abstractfactory;

public class TestAbstractFactory {

	public static void main(String[] args) {
		AbstractFactory shapeFactory = CreateFactory.ReturnFactory("SHAPE");
		shapeFactory.ReturnShape("SQUARE").draw();
		shapeFactory.ReturnShape("CIRCLE").draw();
		AbstractFactory colourFactory = CreateFactory.ReturnFactory("COLOUR");
		colourFactory.ReturnColour("red").fill();
		colourFactory.ReturnColour("blue").fill();	
		AbstractFactory sizeFactory = CreateFactory.ReturnFactory("SIZE");
		sizeFactory.ReturnSize("big").getSize();
		sizeFactory.ReturnSize("small").getSize();
		

	}

}
