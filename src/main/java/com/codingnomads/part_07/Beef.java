package com.codingnomads.part_07;

public class Beef extends Meat {

    public Beef(String brand, int weight, int prize) {
        super(brand, weight, prize);
    }



    @Override
    public void cut() {
        super.cut();
    }

    @Override
    public void putSalt() {
        super.putSalt();
    }

    @Override
    public void putPepper() {
        super.putPepper();
    }

    @Override
    public void cook() {
        super.cook();
    }

    @Override
    public void eat() {
        super.eat();
    }

    @Override
    public void freeze() {
        super.freeze();
    }
}
