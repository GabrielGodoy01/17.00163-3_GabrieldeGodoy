package com.company;

public class Conta {
    private double saldo;

    public void sacar(double valor){
        if(saldo >= valor)
            saldo -= valor; //saldo = saldo - valor;
    }
    public void depositar(double valor){
        this.saldo += valor;
    }
    public double consultaSaldo(){
        return this.saldo;
    }

    public Conta(double saldoInicial){ //CONSTRUTOR PARA COMEÇAR COM UM SALDO INICIAL
        this.saldo = saldoInicial;
    }

}

