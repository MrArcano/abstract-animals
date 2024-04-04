package org.experis.animals;

public class Aquila extends Animal implements CanFly{
    public Aquila(String name) {
        super(name);
    }

    @Override
    public void verso() {
        System.out.println("skreeee");
    }

    @Override
    public void mangia() {
        System.out.println("carne");
    }

    @Override
    public void vola() {
        System.out.println("Sto volando!!!");
    }
}
