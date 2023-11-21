package com.pluralsight;
import java.awt.*;
public class Hexagon extends Shape {
    public Hexagon(Turtle turtle, Point location, Color color, int border) {
        super(turtle, location, color, border);
    }

    public void paint() {
        setTurtleProperties();

        int centerX = location.getLocation().x;
        int centerY = location.getLocation().y;
        int sideLength = 100;

        double angleDegree = 60;
        double angleRadians = Math.toRadians(angleDegree);
        int[] xPoints = new int[125];
        int[] yPoints = new int[125];

        for (int i = 0; i < 6; i++) {
            xPoints[i] = (int) (centerX + sideLength * Math.cos(i * angleRadians));
            yPoints[i] = (int) (centerY + sideLength * Math.sin(i * angleRadians));
        }
    }
}
