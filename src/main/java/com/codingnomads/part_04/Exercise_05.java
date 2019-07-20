package com.codingnomads.part_04;

/**

 Here's an easy one for you.

 Create and populate an array with a length no less than 5. Use the enhanced for
 loop to iterate through the array and print out each value.

 */


public class Exercise_05 {

    public static void main(String[] strings) {
        
        int[] array = new int[]{5,4,8,63,9};
        for (int i : array) {
            System.out.println(i);
        }
    }
}