package com.codingnomads.part_07;

public class Food {

    private String brand;
    private int weight;
    private int prize;


    public Food(String brand, int weight, int prize) {
        this.brand = brand;
        this.weight = weight;
        this.prize = prize;
    }


    public void cook(){
        System.out.println("Cooking the food.");
    }

    public void eat(){
        System.out.println("Eating the food");
    }

    public void freeze(){
        System.out.println("Freezing the food");
    }


}
