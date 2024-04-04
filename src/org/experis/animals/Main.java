package org.experis.animals;

public class Main {
    public static void main(String[] args) {
        Animal animal = new Aquila("Pippo");
        if(animal instanceof Volante ){
            faiVolare((Volante) animal);
        }
        if(animal instanceof Nuotante){
            faiNuotare((Nuotante) animal);
        }
    }

    public  static void faiVolare(Volante animale){
        animale.vola();
    }

    public  static void faiNuotare(Nuotante animale){
        animale.nuota();
    }
}
