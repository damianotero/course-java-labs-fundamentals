package com.codingnomads.part_02;

import java.util.Scanner;

/**
 * Part 2 Exercise 12:
 * <p>
 * Receive the following arguments from the user:
 * - miles to drive
 * - MPG of the car
 * - Price per gallon of fuel
 * <p>
 * Display the cost of the trip in the console.
 */

public class Exercise_12 {

    public static double getCostOfTrip(double miles, double milesPerGallon, double galonPrice){

        return miles/milesPerGallon*galonPrice;

    }

    public static void main(String[] args) {

        double miles;
        double milesPerGalon;
        double galonPrice;
        Scanner scanner=new Scanner(System.in);

        System.out.println("Enter miles to drive:");
        miles=scanner.nextDouble();
        scanner.nextLine();
        System.out.println("Enter miles per gallon of the car");
        milesPerGalon=scanner.nextDouble();
        scanner.nextLine();
        System.out.println("Enter the price per gallon of fuel:");
        galonPrice= scanner.nextDouble();
        scanner.nextLine();

        System.out.println("The cost of trip is; " + getCostOfTrip(miles, milesPerGalon, galonPrice));
    }

}