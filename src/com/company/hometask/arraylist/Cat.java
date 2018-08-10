package com.company.hometask.arraylist;

public class Cat extends Animal {
    private static final String VOICE = "MEOW";
    private double clawLength;


    public Cat(String name, int age, double clawLength) {
        super(name, age);
        this.clawLength = clawLength;
    }

    public double getClawLength() {
        return clawLength;
    }

    public void setClawLength(double clawLength) {
        this.clawLength = clawLength;
    }

    public String toString() {
        return super.toString() + "\nVoice:\t" + VOICE +
                "\nClaw length?:\t" + this.clawLength;
    }

}
