package br.maua.model;

import br.maua.enumerates.AnimalClasses;

/**
 * Classe concreta que representa um cachorro. Ela define a forma que um cachorro anda e come.
 * @author Gabriel de Godoy Braz - gabriel.godoybz@hotmail.com
 * @since 01/06/2020
 * @version 1.0
 */
public class Dog extends Animal {
    public Dog(AnimalClasses animalClass, String name) {
        super(animalClass, name);
    }

    /**
     * Método implementado da interface Eat, que descreve como um animal se alimenta.
     * @param amount Quantos quilos de comida nosso cachorro comeu
     * @return um String com as informações do nome do cachorro e quantidade
     * consumida de alimento em quilogramas.
     */
    @Override
    public String eat(int amount) {
        return String.format("Dog: %s ate %d kilograms!", this.getName(), amount);
    }

    @Override
    public String walk(int distance) {
        return String.format("Dog: %s walked %d kilometers!", this.getName(), distance);
    }
}
