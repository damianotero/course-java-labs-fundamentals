package com.codingnomads.part_05;

/**
 * Write one class. This class must make use of an inner/nested class. Within the nested class, set the instance variables
 * of the outer class. Also, within the inner class, call at least two methods that have a return type of int. Add these
 * two ints together and set a final instance variable in the outer with this value.
 */

public class Exercise_08{

    MyInnerClass myInnerClass = new MyInnerClass();
    final int result= myInnerClass.sum(myInnerClass.var1, myInnerClass.var2);




    public class MyInnerClass {

        private int var1 = 3;
        private int var2 = 2;
        private String stringVar;

        public int sum(int var1, int var2){
            return var1+var2;
        }

        public int multiply(int var1, int var2){
            return var1*var2;
        }



    }

}