package com.codingnomads.part_02;

import java.util.Scanner;

/**
 * Part 2 Exercise 7:
 * <p>
 * Write the necessary code to receive a number in minutes from the user, up to 1,000,000,000.
 * How many years and days does that number in minutes represent?
 * <p>
 * For this exercise each year has 365 days.
 */
public class Exercise_07 {

    public static void printYearsAndDaysFromMinutes(int minutes) {
        if (minutes > 1000000000 || minutes < 0) {
            System.out.println("WRONG NUMBER OF MINUTES");
        } else {
            int years;
            int days;
            days = (minutes / 60) / 24;
            years = days / 365;
            days = days % 365;
            System.out.println(minutes + " minutes are equal to: " + years + " years and " + days + " days.");
        }
    }


    public static void main(String[] args) {

        int minutes;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter minutes:");
        minutes = scanner.nextInt();
        scanner.nextLine();

        printYearsAndDaysFromMinutes(minutes);
    }
}


