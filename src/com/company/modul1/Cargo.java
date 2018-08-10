package com.company.modul1;

public class Cargo implements Wagon {
    private int capacity;

    Cargo() {
        capacity = (int) (Math.random() * 100);
    }

    @Override
    public String display() {
        return "=[:cargo:" + capacity + "%]";
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }
}