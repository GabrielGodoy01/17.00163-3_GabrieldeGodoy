package br.maua.models;

public class Dog {
    private String nome;
    private String raça;
    private int peso;

    @Override
    public String toString() {
        return "Cachorro{" +
                "nome='" + getNome() + '\'' +
                ", raça='" + getRaça() + '\'' +
                ", peso=" + getPeso() +
                '}';
    }

    public Dog(String nome, String raça, int peso) {
        this.nome = nome;
        this.raça = raça;
        this.peso = peso;
    }

    public String getNome() {
        return nome;
    }

    public String getRaça() {
        return raça;
    }

    public int getPeso() {
        return peso;
    }
}
