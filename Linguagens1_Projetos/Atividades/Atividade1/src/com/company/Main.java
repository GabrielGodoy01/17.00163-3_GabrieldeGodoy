// Gabriel de Godoy Braz 17.00163-3

package com.company;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Random gerador = new Random();
        int numeroInteiroAleatorio = gerador.nextInt(500);

        Usuarios usuario1 = new Usuarios("lulu", "","");
        Usuarios usuario3 = new Usuarios("lala", "","");
        Usuarios usuario2 = new Usuarios("lele", "","");
        Contas conta1 = new Contas(usuario1,1000, numeroInteiroAleatorio);
        Contas conta2 = new Contas(usuario2,250, numeroInteiroAleatorio);
        Contas conta3 = new Contas(usuario3, 3000, numeroInteiroAleatorio);

        System.out.println("Estado Inicial: ");
        System.out.println(String.format("Nome Usuario: %s - Saldo: %d", conta1.getUsuario().getNome(), conta1.getSaldo()));
        System.out.println(String.format("Nome Usuario: %s - Saldo: %d", conta2.getUsuario().getNome(), conta2.getSaldo()));
        System.out.println(String.format("Nome Usuario: %s - Saldo: %d", conta3.getUsuario().getNome(), conta3.getSaldo()));

        Transacoes.gerarQR(conta1, 250);
        Transacoes.transferir(conta2,conta1, 250);
        Transacoes.transferir(conta3,conta1, 250);
        Transacoes.transferir(conta2,conta1, 250);
        Transacoes.gerarQR(conta1, 1000);
        Transacoes.transferir(conta3,conta2, 1000);

        System.out.println("Estado final: ");
        System.out.println(String.format("Nome Usuario: %s - Saldo: %d", conta1.getUsuario().getNome(), conta1.getSaldo()));
        System.out.println(String.format("Nome Usuario: %s - Saldo: %d", conta2.getUsuario().getNome(), conta2.getSaldo()));
        System.out.println(String.format("Nome Usuario: %s - Saldo: %d", conta3.getUsuario().getNome(), conta3.getSaldo()));





    }
}
