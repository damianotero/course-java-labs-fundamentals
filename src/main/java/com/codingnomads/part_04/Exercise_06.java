package com.codingnomads.part_04;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Implement, and populate a non-circular, consumptive queue (once a value has been retrieved
 * it cannot be retrieved again) of integers 0 through 100. Then print out every other
 * value in the queue.
 * <p>
 * expected output: 0,2,4,6,8.....100
 */

public class Exercise_06{

    public static void main(String[] args) {

        Queue<Integer> queue = new LinkedList<>();


        for (int i = 0; i <= 100; i++) {
            ((LinkedList<Integer>) queue).add(i);
        }

        for (int i = 0; i <=100 ; i++) {
            int number= queue.poll();
            if (number%2==0){
                System.out.println(number);
            }
        }

    }
}