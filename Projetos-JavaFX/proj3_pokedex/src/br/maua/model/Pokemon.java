package br.maua.model;

public class Pokemon {
    private String nome;
    private double height;
    private double weight;
    private String sprite;
    private String type;
    private int id;
    private String description;

    public Pokemon(String nome, double height, double weight, String sprite, String type, int id, String description) {
        this.nome = nome;
        this.height = height;
        this.weight = weight;
        this.sprite = sprite;
        this.type = type;
        this.id = id;
        this.description = description;
    }

    public String getNome() {
        return nome;
    }

    public double getHeight() {
        return height;
    }

    public double getWeight() {
        return weight;
    }

    public String getSprite() {
        return sprite;
    }

    public String getType() {
        return type;
    }

    public int getId() {
        return id;
    }

    public String getDescription() {
        return description;
    }

    @Override
    public String toString() {
        return "Pokemon{" +
                "nome='" + nome + '\'' +
                ", height=" + height +
                ", weight=" + weight +
                ", sprite='" + sprite + '\'' +
                ", type='" + type + '\'' +
                ", id=" + id +
                ", description='" + description + '\'' +
                '}';
    }
}
