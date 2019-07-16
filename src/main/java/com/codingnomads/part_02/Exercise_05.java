package com.codingnomads.part_02;

import java.util.Scanner;

/**
 * Part 2 Exercise 5:
 * <p>
 * Write a program called PrintNumberInWord which prints "ONE", "TWO",... ,
 * "NINE", "OTHER" if the int variable "number" is 1, 2,... , 9, or other, respectively.
 * Use a "nested-if" statement;
 */
public class Exercise_05 {


    public static void printNumberInWord(int number){


        if (number<=0){
            System.out.println("Wrong number");
        }else if (number==1){
            System.out.println("ONE");
        }else if (number==2){
            System.out.println("TWO");
        }else if (number==3){
            System.out.println("THREE");
        }else if (number==4){
            System.out.println("FOUR");
        }else if (number==5){
            System.out.println("FIVE");
        }else {
            System.out.println("OTHER");
        }

    }

    public static void main(String[] args) {

        int number;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number:");
        number= scanner.nextInt();
        scanner.nextLine();

        printNumberInWord(number);
    }

}

