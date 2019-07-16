package com.codingnomads.part_01;

/**
 * Part 1 Exercise 11:
 * In the U.S., if there is:
 * - One person who is born every 6 seconds
 * - One person who dies every 12 seconds
 * - One person who immigrates every 40 seconds
 * <p>
 * Write the necessary code to display the total population for the next 3 years (without a leap year)
 * <p>
 * Let's say the current population is 380,123,456.
 */

public class Exercise_11 {

    public static void main(String[] args) {

        int secondsInAYear = 365 * 24 * 60 * 60;
        int currentPopulation = 380123456;
        int bornsPerYear = secondsInAYear / 6;
        int diesPerYear = secondsInAYear / 12;
        int immigratesPerYear = secondsInAYear / 40;
        int incrementOfPopulationPerYear = bornsPerYear-diesPerYear-immigratesPerYear;

        for (int i = 1; i <=3 ; i++) {
            currentPopulation+= incrementOfPopulationPerYear;
            System.out.println("Population in " +i+ " year: " + currentPopulation);

        }

    }

}