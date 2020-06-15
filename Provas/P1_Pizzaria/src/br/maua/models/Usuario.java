package br.maua.models;

import br.maua.interfaces.ChecarUsuario;

import java.util.Scanner;

public class Usuario implements ChecarUsuario {
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

    @Override
    public boolean checkUser(Usuario usuario) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite a senha do usuário: ");
        String senha = scanner.next();
        if(senha.equals(usuario.getSenha()))
            return true;
        return false;
    }
}
