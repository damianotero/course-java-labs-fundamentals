package com.codingnomads.part_05.Exercise_02;

public class Class_01 {

    public static void main(String[] args) {

        Class_02 class_02 = new Class_02();
        setClassVariables( class_02, 1, 2, 3);





    }

    public static void setClassVariables(Class_02 class_02, int number1, int number2, int number3){
        class_02.setNumber1(number1);
        class_02.setNumber2(number2);
        class_02.setNumber3(number3);
        System.out.println("Class two variables changed to: \n"+ class_02.getNumber1() + "\n"
        + class_02.getNumber2() + "\n" + class_02.getNumber3());
        sumOneToClassVariables(class_02);


    }

    public static void sumOneToClassVariables(Class_02 class_02){
        class_02.setNumber1((class_02.getNumber1()+1));
        class_02.setNumber2((class_02.getNumber2()+1));
        class_02.setNumber3((class_02.getNumber3()+1));
        System.out.println("Added one to class variables: \n"+ class_02.getNumber1() + "\n"
                + class_02.getNumber2() + "\n" + class_02.getNumber3());
    }
}
