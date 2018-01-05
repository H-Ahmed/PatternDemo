package com.company;

public class ColorFactory extends AbstractFactory {
    @Override
    Color getColor(String color) {
        if(color.equals("RED")){
            return new Red();
        }else if(color.equals("GREEN")){
            return new Green();
        }else if (color.equals("BLUE")){
            return new Blue();
        }else {
            return null;
        }
    }

    @Override
    Shape getShap(String shap) {
        return null;
    }
}
