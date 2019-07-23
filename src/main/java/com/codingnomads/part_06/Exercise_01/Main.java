package com.codingnomads.part_06.Exercise_01;

public class Main {

    public static void main(String[] args) {

        Vehicle vehicle = new Vehicle();
        Motorbike moto = new Motorbike(600,98);

        vehicle.drive();
        moto.drive();

        System.out.println("     ");

        vehicle= moto;

        vehicle.drive();





    }
}
