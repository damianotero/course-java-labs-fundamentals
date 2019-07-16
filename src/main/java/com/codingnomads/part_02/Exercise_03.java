package com.codingnomads.part_02;


import java.util.Scanner;

/**
 * Part 2 Exercise 3:
 * <p>
 * Read in a number in feet from the console
 * and print out the corresponding length in meters
 * <p>
 * 1 foot = .305 meter.
 */

public class Exercise_03 {

    public static double calculateMetersFromFeets(double feet){
        return feet*0.305;
    }

    public static void main(String[] args) {

        double feet;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter feet to convert:");
        feet= scanner.nextDouble();
        scanner.nextLine();

        System.out.println(feet + " feet equals " + calculateMetersFromFeets(feet) + " meters.");


    }

}