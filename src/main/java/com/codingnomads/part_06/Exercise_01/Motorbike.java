package com.codingnomads.part_06.Exercise_01;

public class Motorbike extends Vehicle {


    private int cylinders;
    private int power;

    public Motorbike(int cylinders, int power) {
        super(2, 0, 0);
        this.cylinders=cylinders;
        this.power=power;
    }




    public int getCylinders() {
        return cylinders;
    }

    public void setCylinders(int cylinders) {
        this.cylinders = cylinders;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }


    public void doWheelie(){
        System.out.println("Motorbike is wheeling");
    }

    @Override
    public void drive() {

        System.out.println("Riding on the road.");
    }


}
