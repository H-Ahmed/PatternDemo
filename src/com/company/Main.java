package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        ShapeFactory shapeFactory = new ShapeFactory();

        Shape shape1 = shapeFactory.getShap("CIRCLE");
        shape1.draw();

        Shape shape2 = shapeFactory.getShap("RECTANGLE");
        shape2.draw();

        Shape shape3 = shapeFactory.getShap("SQUARE");
        shape3.draw();

    }
}
