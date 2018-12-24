package com.factory;

public class TestFactory {
public static void main (String args[]){
	Shape shape = ShapeFactory.createShape(Shape.Rectangle);
	System.out.println(shape.area());
	System.out.println(shape.perimeter());
}
}
