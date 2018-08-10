package com.company.modul1;

public class Passngr2cl implements Wagon {
    private int capacity;

    Passngr2cl() {
        capacity = (int) (Math.random() * 100);
    }

    @Override
    public String display() {
        return "=[:passngr2cl:" + capacity + ']';
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }
}
