package com.codingnomads.part_07;

public class Meat extends Food {



    public Meat(String brand, int weight, int prize) {
        super(brand, weight, prize);
    }


    public void cut(){
        System.out.println("Cutting the meat");
    }

    public void putSalt(){
        System.out.println("Putting Salt on the meat");
    }

    public void putPepper(){
        System.out.println("putting pepper on the meat");
    }

    @Override
    public void cook() {
        System.out.println("Cooking the meat!");
    }

    @Override
    public void eat() {
        System.out.println("Eating meat!");
    }

    @Override
    public void freeze() {
        System.out.println("Freezing meat!");;
    }
}
