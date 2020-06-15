package br.maua.models;

import br.maua.enums.FormaPagamento;

import java.util.ArrayList;
import java.util.Scanner;

public class Sistema {
    public static void run() {

        ArrayList<Pedidos> pedidos = new ArrayList<>();

        int interacao = 1;

        Pedidos pedidos1 = new Pedidos("d",100, FormaPagamento.DEBITO);
        System.out.println(pedidos1.toString());

        do {
            System.out.println("Pizzaria o Rato que Ri: ");
            System.out.println("1 - Nova venda");
            System.out.println("2 - Verificar pedidos");
            System.out.println("3 - Alterar pedidos");
            System.out.println("0 - Sair");

            Scanner scanner = new Scanner(System.in);
            interacao = scanner.nextInt();

            switch(interacao){
                case 0:
                    break;
                case 1:
                    System.out.println("Descrição da venda: ");
                    String descricao =scanner.next();
                    System.out.println("Valor da venda: ");
                    Double valor = scanner.nextDouble();
                    System.out.println("Forma de Pagamento: ");
                    System.out.println("0 - Dinheiro");
                    System.out.println("1 - Debito");
                    System.out.println("2 - Credito");
                    System.out.println("3 - Vale Alimentação");
                    System.out.println("4 - Vale Refeição");
                    int pagamento = scanner.nextInt();
                    if (pagamento == 0){
                        pedidos.add(new Pedidos(descricao, valor, FormaPagamento.DINHEIRO));
                    }else if (pagamento == 1){
                        pedidos.add(new Pedidos(descricao, valor, FormaPagamento.DEBITO));
                    }else if (pagamento == 2){
                        pedidos.add(new Pedidos(descricao, valor, FormaPagamento.CREDITO));
                    }else if (pagamento == 3){
                        pedidos.add(new Pedidos(descricao, valor, FormaPagamento.VALE_ALIMENTACAO));
                    }else{
                        pedidos.add(new Pedidos(descricao, valor, FormaPagamento.VALE_REFEICAO));
                    }
                    break;

                case 2:

                    break;
                case 3:
                    break;
            }
        }while(interacao != 0);
    }
}

