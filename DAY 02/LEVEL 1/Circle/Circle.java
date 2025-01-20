import java.util.Scanner;

//creating class
public class Circle {
    // instance variable
    public static float pi = 3.14F;
    public double radius;


    public Circle() {

        // this for constructor chaining
        this(23);
    }

    // constructor to initialize radius to instance variable
    public Circle(double radius) {

        this.radius = radius;
    }

    // method to find area of circle
    public void areaOfcircle() {
        double result = pi * (radius * radius);
        System.out.println("Area of circle of " + radius + " is " + result);
    }

    public static void main(String[] args) {

        // object of Circle class
        Circle c = new Circle();
        c.areaOfcircle();
    }
}
