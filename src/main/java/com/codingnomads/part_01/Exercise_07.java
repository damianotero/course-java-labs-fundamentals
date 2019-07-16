package com.codingnomads.part_01;

/**
 * Part 1 Exercise 7:
 * Print pi to the console using the following formula: note that this is not the complete series to
 * compute the true number pi. Do you see a pattern there? maybe can be done in a loop...
 * <p>
 * 4.0 * (1 - (1.0/3) + (1.0/5) - (1.0/7) + (1.0/9) - (1.0/11))
 */

public class Exercise_07 {

    public static void main(String[] args) {

        double num = 1;
        boolean isNegative = true;
        for (double i = 3; i < 120; i = i + 2) {
            double division = 1 / i;
            if (isNegative) {
                num -= division;
            } else {
                num += division;
            }
            isNegative = !isNegative;


        }
        System.out.println(num * 4);


    }
}

