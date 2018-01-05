package com.company;

public class ShapeFactory extends AbstractFactory {

    @Override
    Color getColor(String color) {
        return null;
    }

    @Override
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
