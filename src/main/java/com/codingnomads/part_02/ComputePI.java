package com.codingnomads.part_02;

/**
 * Review and run this updated method to find PI
 * <p>
 * This is a solution for the exercise done in part 1 Exercise 7
 * <p>
 * 4.0 * (1 - (1.0/3) + (1.0/5) - (1.0/7) + (1.0/9) - (1.0/11))
 */

public class ComputePI {
    public static void main(String[] args) {
        double pi = 0;
        double symbolAlternator = 1;

        int loops = 90000000 * 2;

        for (int oddNumber = 1; oddNumber < loops; oddNumber += 2) {
            pi = pi + (symbolAlternator / oddNumber);
            symbolAlternator = -symbolAlternator;    // alternate the sign each time
        }

        System.out.println("π = " + 4 * pi + " after " + loops / 2 + " loops"); //PI=3.141592642478473 after 90000000
    }
}