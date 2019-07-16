package com.codingnomads.part_02;

import java.util.Scanner;

/**
 * Part 2 Exercise 2:
 * <p>
 * Write the necessary code that reads the radius
 * and the length of a cylinder from the console
 * then computes the volume and area and prints the
 * results to the console.
 * <p>
 * tip: area = radius * radius * 3.1415 (roughly)
 */

public class Exercise_02 {

    public static double calculateArea(double radius){
        return Math.sqrt(radius)* Math.PI;
    }
    public static double calculateVolume(double area, double length){
        return area*length;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double radius;
        double length;
        double area;
        System.out.println("Enter the radius:");
        radius= scanner.nextDouble();
        scanner.nextLine();
        area= calculateArea(radius);

        System.out.println("Enter the length:");
        length= scanner.nextDouble();
        scanner.nextLine();

        System.out.println("Area is: " + area +" and volume is: " + calculateVolume(area, length));


    }


}