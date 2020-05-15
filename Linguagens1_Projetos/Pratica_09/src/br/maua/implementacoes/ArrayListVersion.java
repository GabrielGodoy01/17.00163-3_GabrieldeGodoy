package br.maua.implementacoes;

import br.maua.models.Dog;

import java.util.ArrayList;

public class ArrayListVersion {
    public static void run(){
        ArrayList<Dog> dogs = new ArrayList<>();
        Dog dog = new Dog("d1", "Cachorro", 1);
        dogs.add(dog);
        dogs.add(dog);

        for (int i =0; i < dogs.size(); i++){
            System.out.println((dogs.get(i)));
        }

    }
}
