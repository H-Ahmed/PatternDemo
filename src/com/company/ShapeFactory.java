package com.company;

public class ShapeFactory {

    public Shape getShap(String shapeType) {
        if ("CIRCLE".equals(shapeType)) {
            return new Circle();

        } else if ("RECTANGLE".equals(shapeType)) {
            return new Rectangle();

        } else if ("SQUARE".equals(shapeType)) {
            return new Square();

        } else {
            return null;
        }
    }
}
