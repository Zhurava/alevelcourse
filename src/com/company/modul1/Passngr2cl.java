package com.company.modul1;

public class Passngr2cl implements Wagon {
    private int capacity;

    Passngr2cl() {
        capacity = 100 + (int) (Math.random() * 200);
    }

    @Override
    public String display() {
        return "=[:Пасс2кл:" + capacity + ']';
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }
}
