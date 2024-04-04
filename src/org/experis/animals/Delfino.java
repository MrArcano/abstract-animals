package org.experis.animals;

public class Delfino extends Animal implements Nuotante {
    public Delfino(String name) {
        super(name);
    }

    @Override
    public String toString() {
        return super.toString() + " - Delfino";
    }

    @Override
    public void verso() {
        System.out.println("fiiiiiiiiii");
    }

    @Override
    public void mangia() {
        System.out.println("pesce");
    }

    @Override
    public void nuota() {
        System.out.println("Sto nuotando!!!");
    }
}
