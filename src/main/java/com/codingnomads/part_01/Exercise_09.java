package com.codingnomads.part_01;

/**
 * Part 1 Exercise 9:
 * <p>
 * Write the necessary code to display the area of a rectangle, as well as the perimeter of
 * a rectangle that has a width of 2.4 and a height of 6.4
 */

public class Exercise_09 {

    public static double getArea(double width, double height) {
        return width * height;
    }

    public static double getPerimeter(double width, double height) {
        return (width * 2) + height * 2;
    }

    public static void main(String[] args) {
        double width = 2.4;
        double height = 6.4;

        System.out.println("Area: " + getArea(width, height));
        System.out.println("Perimeter: " + getPerimeter(width, height));
    }

}