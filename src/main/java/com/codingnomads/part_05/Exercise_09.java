package com.codingnomads.part_05;

/**
 * Demonstrate how variable-arity works, aka varargs. Create a method that uses "String ... varargs". Within the
 * varargs method, use StringBuilder to build a nicely formatted String/sentence using the varargs. Print this statement
 * to the console. Do this at least 3 times with different Strings/sentences.
 */


public class Exercise_09 {

    public static void vaMethod(String... varargs) {

        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < varargs.length; i++) {
            stringBuilder.append(varargs[i]);
        }

        System.out.println(stringBuilder);
    }

    public static void main(String[] args) {
        vaMethod("hola ", "que ", "tal ");
        vaMethod("one ", "two ", "three");
        vaMethod("Print ", "this ", "statement ", "to ", "the ", "console.");
    }
}




