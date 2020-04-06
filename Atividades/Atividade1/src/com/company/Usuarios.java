// Gabriel de Godoy Braz 17.00163-3
package com.company;

public class Usuarios {
    private String nome, senha, email;

    public Usuarios(String nome, String senha, String email) {
        this.nome = nome;
        this.senha = senha;
        this.email = email;
    }

    public String getNome() {
        return nome;
    }
}
