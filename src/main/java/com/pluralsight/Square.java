package com.pluralsight;

import java.awt.*;

public class Square extends Shape{

    public Square(Turtle turtle, Point location, Color color, int border) {
        super(turtle, location, color, border);
    }

    public void paint() {
        setTurtleProperties();

        for (int i = 0; i < 4; i++) {
            turtle.forward();
            turtle.turnRight(45);
        }
    }

    public void paint(int sideLength) {
        setTurtleProperties();

        for (int i = 0; i < 4; i++) {
            turtle.forward(sideLength);
            turtle.turnRight(90);
        }
    }

}
