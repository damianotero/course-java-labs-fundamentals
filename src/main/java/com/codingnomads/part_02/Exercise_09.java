package com.codingnomads.part_02;


/**
 * Part 2 Exercise 9:
 * <p>
 * Use a do-while loop to print out the letters of the alphabet in reverse order.
 * Tip: Use a variable of char type.
 */
public class Exercise_09 {

    public static void main(String[] args) {

        char letter= 'Z';

        do {
            System.out.println(letter);
            letter--;
        }while (letter >='A');
    }

}


