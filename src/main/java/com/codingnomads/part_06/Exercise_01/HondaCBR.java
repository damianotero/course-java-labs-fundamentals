package com.codingnomads.part_06.Exercise_01;

public class HondaCBR extends Motorbike {

    public HondaCBR() {
        super(4, 120);
    }

    public void powerUp(int power){
        super.setPower(super.getPower()+power);
    }


    public void powerDown(int power){
        super.setPower(super.getPower()+power);

    }


    public void setRaceMode(){
        powerUp(50);
        super.doWheelie();
    }



    @Override
    public void drive() {
        super.drive();
        System.out.println("With a Honda CBR");
    }
}
