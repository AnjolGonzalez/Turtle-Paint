package com.pluralsight;
import java.awt.*;

public class MainApp
{
    public static void main(String[] args)
    {
        World world = new World(1000, 1000);
        Turtle turtle = new Turtle(world,-100, -100);

        int width = 250;
        int height = 250;

        double widthSquared = Math.pow(width, 2);
        double heightSquared = Math.pow(height, 2);
        double hypotenuse = Math.sqrt(widthSquared + heightSquared);


        turtle.setPenWidth(3);
        turtle.setColor(Color.BLUE);

        turtle.penUp();
        turtle.turnRight(45);
        turtle.forward();

        turtle.penDown();
        turtle.turnRight(45);
        turtle.forward();
        turtle.turnLeft(90);
        turtle.forward();
        turtle.turnLeft(90);
        turtle.forward();
        turtle.turnLeft(90);
        turtle.forward();

        turtle.penUp();
        turtle.turnRight(90);
        turtle.forward();
        turtle.turnLeft(90);


        turtle.setColor(Color.green);
        turtle.penDown();
        turtle.turnRight(90);
        turtle.forward();
        turtle.turnLeft(90);
        turtle.forward();
        turtle.turnLeft(90);
        turtle.forward();
        turtle.turnLeft(90);
        turtle.forward();

        turtle.penUp();
        turtle.forward();

        turtle.setColor(Color.cyan);
        turtle.penDown();
        turtle.turnLeft(90);
        turtle.forward();
        turtle.turnRight(180);
        turtle.forward();
        turtle.turnLeft(90);

        turtle.penUp();
        turtle.forward(45);
        turtle.turnLeft(90);

        turtle.penDown();
        turtle.forward();
        turtle.turnRight(180);
        turtle.forward(45);
        turtle.turnRight(90);
        turtle.forward(45);

        turtle.penUp();
        turtle.turnRight(180);
        turtle.forward(60);

        turtle.penDown();
        turtle.turnRight(90);
        turtle.forward(55);
        turtle.turnLeft(180);

        turtle.penUp();
        turtle.forward(70);

        turtle.penDown();
        turtle.forward(5);
        turtle.penUp();
        turtle.turnRight(90);
        turtle.forward();


        System.out.println();
    }
}
