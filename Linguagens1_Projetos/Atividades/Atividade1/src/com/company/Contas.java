// Gabriel de Godoy Braz 17.00163-3
package com.company;

public class Contas {
    private Usuarios usuario;
    private double saldo;
    private int id;

    public Contas(Usuarios usuario, double saldo, int id) {
        this.usuario = usuario;
        this.saldo = saldo;
        this.id = id;
    }

    public Usuarios getUsuario() {
        return usuario;
    }

    public double getSaldo() {
        return saldo;
    }

    public int getId() {
        return id;
    }

}