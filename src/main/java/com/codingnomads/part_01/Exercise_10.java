package com.codingnomads.part_01;

/**
 * Part 1 Exercise 10:
 * <p>
 * If a runner runs 12 kilometers in 30 minutes and 30 seconds. What is his/her average speed
 * in miles per hour. (Tip: 1 mile = 1.6 km)
 */

public class Exercise_10 {

    public static double convertKmToMiles(double km) {
        return km / 1.6;
    }

    public static double convertMinutesAndSecondsToHours(double minutes, double seconds) {
        return ((seconds / 60) + minutes) / 60;
    }

    public static double getAverageSpeed(double hours, double distance) {
        return distance / hours;
    }

    public static void main(String[] args) {


        System.out.println("Average Speed: " + getAverageSpeed(convertMinutesAndSecondsToHours(30, 30), convertKmToMiles(12))+ " miles/h");


    }

}