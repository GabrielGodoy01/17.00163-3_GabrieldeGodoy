// Gabriel de Godoy Braz 17.00163-3
package com.company;

import java.util.Random;

public class Transacoes {

    private static int getRandomNumberInRange(int min, int max) {
        Random r = new Random();
        return r.nextInt((max - min) + 1) + min;
    }


    public static double transferir(Contas conta, Contas conta2, double valor){
        if(conta.getId() == conta2.getId() || conta.getSaldo() < valor)
            System.out.println("Id's iguais ou saldo insuficiente, impossivel transferir!");
        else
            return (conta.getSaldo() -= valor && conta2.getSaldo() += valor);
    }



    public static String gerarQR(Contas conta, double valorTranferencia){
        return String.format("%d;%s;%f;%d", conta.getId(),conta.getUsuario().getNome(),valorTranferencia,Transacoes.getRandomNumberInRange(0,200));
        //100,00000000 por conta do double
    }

}


