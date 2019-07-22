package com.codingnomads.part_05.Exercise_04;

public class Class_02 {

    private int num1;
    private int num2;
    private int num3;

    public Class_02(){
        this(0,0,0);
    }

    public Class_02(int num1) {
        this(num1,0,0);
    }

    public Class_02(int num1, int num2) {
        this(num1,num2,0);
    }

    public Class_02(int num1, int num2, int num3) {
        this.num1 = num1;
        this.num2 = num2;
        this.num3 = num3;
    }

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }

    public void setNum3(int num3) {
        this.num3 = num3;
    }

    @Override
    public String toString() {
        return "Class_02{" +
                "num1=" + num1 +
                ", num2=" + num2 +
                ", num3=" + num3 +
                '}';
    }
}
