package com.company.modul1;

public class Locomotive implements Wagon {
    private int capacity;

    Locomotive() {
    }

    @Override
    public String display() {
        return "<:locomotive]";
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }
}