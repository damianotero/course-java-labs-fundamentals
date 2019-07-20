package com.codingnomads.part_04;


import java.util.EmptyStackException;

/**
 * The complement of a queue is a stack. It uses first-in, last-out accesssing and is often likened to a stack of plates.
 * The first plate put on the table is the last plate used. Create a stack class called Stack that can hold characters. Call
 * the method that access the stack push() and pop(). Allow the user to specify the size of the stack when it is created.
 * Keep all other members of the Stack class private.
 */

public class Exercise_07 {
    public static void main(String[] args) {

        Stack stack = new Stack(10);

        for (char i = 'a'; i < 'j'; i++) {
            stack.push(i);
        }

        for (int i = 0; i < 10; i++) {
            System.out.println(stack.pop());
        }
    }

}

class Stack {

    private char[] data;
    private int size =0;

    public Stack(int capacity) {
        this.data = new char[capacity];
    }

    public void push(char character){
        if (data.length==size){
            throw new IndexOutOfBoundsException();
        }
        data[size]=character;
        size++;
    }

    public char pop(){
        if (size==0){
            throw new EmptyStackException();
        }
        char character;
        character=data[size-1];
        data[size--]='\u0000';
        return character;
    }

    public int getSize() {
        return size;
    }
}