package org.experis.animals;

public class Delfino extends Animal implements CanSwim{
    public Delfino(String name) {
        super(name);
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
