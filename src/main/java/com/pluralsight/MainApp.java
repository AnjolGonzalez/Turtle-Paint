package com.pluralsight;
import java.awt.*;

public class MainApp
{
    public static void main(String[] args)
    {
        // This starter code to get you familiar with how
        // the TurtleLogo application works

        // The world is your canvas
        World world = new World(1000, 1000);
        Turtle turtle = new Turtle(world,-100, -100);

        int width = 250;
        int height = 250;

        // calculate the hypotenuse (diagonal)
        // a2 + b2 = c2
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


        /*turtle.penUp();
        turtle.goTo(100, 100);
        turtle.turnRight(90);*/

        /*turtle.penDown();
        turtle.forward();
        turtle.turnLeft(90);
        turtle.forward();
        turtle.turnRight(136);
        turtle.forward(200);
        turtle.turnRight(135);
        turtle.forward();
        turtle.turnRight(65);
        turtle.cornerGoTo(45, 25);
        turtle.forward(); */

        System.out.println();
    }
}
