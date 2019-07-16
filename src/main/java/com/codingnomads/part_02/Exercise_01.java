package com.codingnomads.part_02;

import java.util.Scanner;

/**
 * Part 2 Exercise 1:
 * Celsius to Fahrenheit
 * <p>
 * Write the necessary code to read a degree in Celsius (as a double) from the console
 * then convert it to fahrenheit and print it to the console.
 * <p>
 * F = 9 * (C / 5) + 32;
 * <p>
 * Output should read like - "27.4 degrees celsius = 81.32 degrees fahrenheit"
 */

public class Exercise_01 {


    public static double convertCelsiusToFarenheit(double celsius){

        return 9*(celsius/5)+32;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.println("Enter Celsius Degree:");
        double celsius= scanner.nextDouble();

        System.out.println(celsius + " degrees celsius = " + convertCelsiusToFarenheit(celsius)+ " degrees fahrenheit");



    }



}