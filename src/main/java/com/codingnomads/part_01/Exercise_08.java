package com.codingnomads.part_01;

/**
 * Part 1 Exercise 8:
 * <p>
 * Write the necessary code that prints out the area
 * and perimeter of a circle with a radius of 3.14
 */

public class Exercise_08 {


    public static double getArea(double radius){
        return Math.PI * (Math.sqrt(radius));
    }

    public static double getPerimeter(double radius){
        return  2*Math.PI*radius;
    }

    public static void main(String[] args) {

        double radius = 3.14;

        System.out.println("Area: "  + getArea(radius));
        System.out.println("Perimeter: " + getPerimeter(radius));
    }

}