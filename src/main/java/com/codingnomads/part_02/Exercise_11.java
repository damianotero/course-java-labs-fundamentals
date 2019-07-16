package com.codingnomads.part_02;

import java.util.Scanner;

/**
 * Part 2 Exercise 11:
 * <p>
 * Calculate investment value
 * <p>
 * Receive the following args from user:
 * - investment amount
 * - interest rate in percentage
 * - number of years to invest
 * <p>
 * Print future value to the console.
 */

public class Exercise_11 {

    public static void calculateInvestmentValue(double investmentAmount, double interestRate, double years){

        double totalAmmount= investmentAmount;
        for (int i =1; i<= years; i++){
            totalAmmount+=((totalAmmount*interestRate)/100);
            System.out.println("Year "+ i + ": " + totalAmmount);
        }
    }


    public static void main(String[] args) {

        double investmentAmount;
        double  interestRate;
        double years;
        Scanner scanner=new Scanner(System.in);

        System.out.println("Enter the amount to invest:");
        investmentAmount=scanner.nextDouble();
        scanner.nextLine();
        System.out.println("Enter the interest rate in percentage:");
        interestRate=scanner.nextDouble();
        scanner.nextLine();
        System.out.println("Enter the number of years to invest:");
        years=scanner.nextDouble();
        scanner.nextLine();


        calculateInvestmentValue(investmentAmount,interestRate,years);

    }

}


