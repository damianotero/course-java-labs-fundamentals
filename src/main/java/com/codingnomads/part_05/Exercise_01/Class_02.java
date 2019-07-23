package com.codingnomads.part_05.Exercise_01;

public class Class_02 {


    private int number1 = 1;
    private int number2 = 2;
    private int number3 = 3;

    public void setNumber1(int number1) {
        this.number1 = number1;
    }

    public void setNumber2(int number2) {
        this.number2 = number2;
    }

    public void setNumber3(int number3) {
        this.number3 = number3;
    }

    public int getNumber1() {
        return number1;
    }

    public int getNumber2() {
        return number2;
    }

    public int getNumber3() {
        return number3;
    }

    Class_03 class_03 = new Class_03();

    public void setClass_03(String string1, String string2, String string3) {
        class_03.setString1(string1);
        class_03.setString2(string2);
        class_03.setString3(string3);
        System.out.println("Class 3 instance variables changed");
    }



}


