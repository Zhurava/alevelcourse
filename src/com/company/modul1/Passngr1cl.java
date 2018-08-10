package com.company.modul1;

public class Passngr1cl implements Wagon {
    private int capacity;

    Passngr1cl() {
        capacity = (int) (Math.random() * 100);
    }

    @Override
    public String display() {
        return "=[:Пасс1кл:" + capacity + ']';
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }
}
