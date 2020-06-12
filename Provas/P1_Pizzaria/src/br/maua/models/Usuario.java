package br.maua.models;

public class Usuario {
    private String nome;
    private String email;
    private String senha;

    public Usuario(String nome, String email) {
        this.nome = nome;
        this.email = email;
        this.senha = "123456";
    }

    public String getSenha() {
        return senha;
    }

}
