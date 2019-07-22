package com.codingnomads.part_05.Exercise_03;

public class Class_01 {
    public static void main(String[] args) {

        Class_02 class_02 = new Class_02();


        System.out.println("Sum of all variables: " + class_02.sumOfNumbers());

        System.out.println("Sum of all variables plus 3: "
        +class_02.sumOfNumbers(3));

        System.out.println(class_02.sumOfNumbers("The Sum: "));



    }

}
