package com.codingnomads.part_06.Exercise_01;

public class Boat extends Vehicle {

    public Boat(int sails) {
        super(0, 0, sails);
    }

    public Boat() {
        super();
    }


    @Override
    public void setSails(int sails) {
        super.setSails(sails);
    }


    @Override
    public void drive() {
        super.drive();
        System.out.println("... on the water.");
    }
}
