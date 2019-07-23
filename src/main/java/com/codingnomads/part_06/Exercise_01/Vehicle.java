package com.codingnomads.part_06.Exercise_01;

public class Vehicle {

    private int wheels;
    private int wings;
    private int sails;

    public Vehicle(){
        this(0,0,0);
    }

    public Vehicle(int wheels, int wings, int sails) {
        this.wheels = wheels;
        this.wings = wings;
        this.sails = sails;
    }

    public int getWheels() {
        return wheels;
    }

    public void setWheels(int wheels) {
        this.wheels = wheels;
    }

    public int getWings() {
        return wings;
    }

    public void setWings(int wings) {
        this.wings = wings;
    }

    public int getSails() {
        return sails;
    }

    public void setSails(int sails) {
        this.sails = sails;
    }

    public void drive(){
        System.out.println("Vehicle is moving...");
    }
}
