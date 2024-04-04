package org.experis.animals;

public class Cane extends Animal{
    public Cane(String name) {
        super(name);
    }

    @Override
    public String toString() {
        return super.toString() + " - Cane";
    }

    @Override
    public void verso() {
        System.out.println("bau bau");
    }

    @Override
    public void mangia() {
        System.out.println("carne");
    }
}
