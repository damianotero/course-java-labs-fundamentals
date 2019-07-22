package com.codingnomads.part_05.Exercise_04;

public class Class_01 {

    public static void main(String[] args) {


        Class_02 allZeros = new Class_02();
        Class_02 oneTwoThree = new Class_02(1,2,3);
        Class_02 fiveAndTwoZeros = new Class_02(5);


        System.out.println(allZeros.toString());
        System.out.println(oneTwoThree.toString());
        System.out.println(fiveAndTwoZeros.toString());


        allZeros.setNum2(4);
        oneTwoThree.setNum3(1);
        fiveAndTwoZeros.setNum1(6);

        System.out.println("                 ");
        System.out.println(allZeros.toString());
        System.out.println(oneTwoThree.toString());
        System.out.println(fiveAndTwoZeros.toString());





    }
}
