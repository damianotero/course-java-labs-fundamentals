package com.codingnomads.part_02;

import java.util.Scanner;

/**
 * Part 2 Exercise 6:
 * <p>
 * Write a program called PrintNumberInWord which prints "ONE", "TWO",... ,
 * "NINE", "OTHER" if the int variable "number" is 1, 2,... , 9, or other, respectively.
 * Use a "switch-case" statement.
 */

public class Exercise_06 {

    public static void printNumberInWord(int number) {

        switch (number) {
            case 1:
                System.out.println("ONE");
                break;
            case 2:
                System.out.println("TWO");
                break;
            case 3:
                System.out.println("THREE");
                break;
            case 4:
                System.out.println("FOUR");
                break;
            case 5:
                System.out.println("FIVE");
                break;
            case 6:
                System.out.println("SIX");
                break;
            default:
                System.out.println("OTHER");
                break;
        }

    }

    public static void main(String[] args) {


        int number;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number:");
        number = scanner.nextInt();
        scanner.nextLine();

        printNumberInWord(number);
    }
}