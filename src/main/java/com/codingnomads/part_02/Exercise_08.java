package com.codingnomads.part_02;

import java.util.Scanner;

/**
 * Part 2 Exercise 8:
 * <p>
 * Receive a number between 0 and 1,000,000,000 from the user.
 * Use while loop to find the number - when the number is found
 * exit the loop and print the number to the console.
 */
public class Exercise_08 {


    public static void findNumber(int number){
        if (number<0 || number>1000000000){
            System.out.println("Wrong Number");
            return;
        }
        int numberToFind=0;
        while (numberToFind<1000000000){
            if (number == numberToFind){
                System.out.println("Number " + number + " found!");
                break;
            }
            numberToFind++;

        }

    }

    public static void main(String[] args) {

        int number;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number:");
        number=scanner.nextInt();
        scanner.nextLine();

        findNumber(number);
    }

}

