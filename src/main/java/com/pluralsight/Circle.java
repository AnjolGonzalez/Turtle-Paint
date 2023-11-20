package com.pluralsight;

import java.awt.*;
import java.util.Map;

public class Circle extends Shape{
    public Circle(Turtle turtle, Point location, Color color, int border) {
        super(turtle, location, color, border);
    }
    public void paint() {

    }
    public void drawCircle(double radius) {
        setTurtleProperties();
        int segments = 360;
        double angelIncrement = 360 / segments;

        for (int i = 0; i < segments; i++) {
            turtle.forward(radius * Math.PI * angelIncrement / 180.0);
            turtle.turnRight(angelIncrement);
        }
    }
}
