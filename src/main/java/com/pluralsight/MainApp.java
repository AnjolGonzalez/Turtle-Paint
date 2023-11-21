package com.pluralsight;
import java.awt.*;
import java.util.Scanner;

public class MainApp {
    public static void main(String[] args) {
        runMain();
    }
    private static void runMain() {
        Scanner scan = new Scanner(System.in);
        double worldWidth;
        double worldHeight;
        int endProgram = 3;

        System.out.println("Welcome," +
                "\nTo the turtle drawer");
        System.out.println("How big would you like your world? (Width): ");
        worldWidth = scan.nextDouble();

        System.out.println("How tall would you like your world to be? (Height): ");
        worldHeight = scan.nextDouble();

        World world = new World((int) worldWidth, (int) worldHeight);
        Turtle turtle = new Turtle(world, 0, 0);

        while (endProgram != 0) {
            System.out.println("1) Add shape\n" +
                    "2) Save Image\n" +
                    "0) Exit");
            endProgram = scan.nextInt();


            switch (endProgram) {
                case 1: {
                    int chosenShape;
                    int borderWidth;
                    String tempColor;
                    Point location;
                    Color borderColor;
                    double radius = 0;

                    System.out.println("Which shape (1. Square, 2. Circle, 3. Triangle, 4. Hexagon)?");
                    chosenShape = scan.nextInt();
                    if (chosenShape == 2) {
                        System.out.println("What is the radius?");
                        radius = scan.nextDouble();
                    }
                    System.out.println("What is the border width?");
                    borderWidth = scan.nextInt();

                    System.out.println("What is the border color?");
                    tempColor = scan.next().toLowerCase();

                    borderColor = getColor(tempColor);

                    System.out.println("What is the location of the shape(x,y)?");
                    location = userInput(scan);
                    scan.nextLine();

                    if (chosenShape == 2) {

                        Circle circle = new Circle(turtle, location, borderColor, borderWidth);
                        circle.drawCircle(radius);

                    }
                    System.out.println("passed");
                    switch (chosenShape) {
                        case 1: {
                            Square square = new Square(turtle, location, borderColor, borderWidth);
                            square.paint(50);
                            break;
                        }
                        case 3: {
                            Triangle triangle = new Triangle(turtle, location, borderColor, borderWidth);
                            triangle.paint();
                            break;
                        }
                        case 4: {
                            Hexagon hexagon = new Hexagon(turtle, location, borderColor, borderWidth);
                            hexagon.paint();
                            break;
                        }
                    }
                    break;
                }
                case 2: {
                    world.saveAs("SaveCurrentScreen.png");
                    break;
                }
                case 0: {
                    System.exit(0);
                }
            }
        }
    }


        public static Color getColor(String color) {

            switch (color) {
                case "red":
                    return Color.RED;
                case "green":
                    return Color.GREEN;
                case "blue":
                    return Color.BLUE;
                case "cyan":
                    return Color.CYAN;
                case "orange":
                    return Color.ORANGE;
                case "yellow":
                    return Color.YELLOW;
                default:
                    return Color.BLACK;

            }
        }

        private static Point userInput(Scanner scan) {
            System.out.println("Enter the x-coordinate: ");
            int x = scan.nextInt();
            System.out.println("Enter the y-coordinate: ");
            int y = scan.nextInt();
            scan.nextLine();
            return new Point(x,y);
        }
    }