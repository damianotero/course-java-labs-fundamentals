package com.codingnomads.part_02;

/**
 * Part 2 Exercise 10:
 * <p>
 * Write a program that prints out every prime number between 1 and 100
 */
public class Exercise_10 {


    public static void main(String[] args) {


        boolean isPrime = true;
        for (int i = 1; i <= 100; i++) {
            for (int j = 2; j <= i / 2; j++) {
                if (i % j == 0) {
                    isPrime = false;
                }
            }
            if (isPrime) {
                System.out.println(i);
            }
            isPrime = true;
        }
    }
}


