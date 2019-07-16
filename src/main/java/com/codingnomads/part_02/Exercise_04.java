package com.codingnomads.part_02;

import java.util.Scanner;

/**
 * Part 2 Exercise 4:
 * <p>
 * Pounds to kilos
 * <p>
 * One pound is 0.454 kilograms.
 */

public class Exercise_04 {

    public static double convertPoundsToKilo(double pounds) {
        return pounds*0.454;
    }


    public static void main(String[] args) {

        double pounds;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter pounds:");
        pounds=scanner.nextDouble();
        scanner.nextLine();

        System.out.println(pounds + " pounds equals " + convertPoundsToKilo(pounds) + " kilos.");
    }

}