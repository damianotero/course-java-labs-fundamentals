package com.codingnomads.part_05.Exercise_03;

public class Class_02 {

    private int number1 =2;
    private int number2=5;
    private int number3 =6;


    public int sumOfNumbers() {
        return number1 + number2 + number3;
    }

    public int sumOfNumbers(int number) {
        return sumOfNumbers() + number;
    }

    public int sumOfNumbers(String name) {
        System.out.println(name);
        return sumOfNumbers();
    }
}
