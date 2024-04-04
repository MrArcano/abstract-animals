package org.experis.animals;

public abstract class Animal {
    private final String name;
    public Animal(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void dormi() { // (mostra a video “Zzz”)
        System.out.println("Zzz");
    }

    public abstract void verso(); // mostra a video il verso fatto dall’animale specifico

    public abstract void mangia(); // mostra a video quello che mangia :erba, carne, ...?

}
