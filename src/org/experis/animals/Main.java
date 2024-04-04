package org.experis.animals;

public class Main {
    public static void main(String[] args) {

        Animal[] animals = new Animal[4];
        animals[0] = new Cane("Bob");
        animals[1] = new Passerotto("Cip");
        animals[2] = new Delfino("Flipper");
        animals[3] = new Aquila("Bird");

        for (Animal animal : animals){

            System.out.println(animal);
            animal.dormi();
            animal.mangia();
            animal.verso();

            if(animal instanceof Volante ){
                faiVolare((Volante) animal);
            }
            if(animal instanceof Nuotante){
                faiNuotare((Nuotante) animal);
            }
        }
    }

    public  static void faiVolare(Volante animale){
        animale.vola();
    }

    public  static void faiNuotare(Nuotante animale){
        animale.nuota();
    }
}
