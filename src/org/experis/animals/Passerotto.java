package org.experis.animals;

public class Passerotto extends Animal implements Volante {

    public Passerotto(String name) {
        super(name);
    }

    @Override
    public String toString() {
        return super.toString() + " - Passerotto";
    }

    @Override
    public void verso() {
        System.out.println("cip cip");
    }

    @Override
    public void mangia() {
        System.out.println("semi");
    }

    @Override
    public void vola() {
        System.out.println("Sto volando!!!");
    }
}
