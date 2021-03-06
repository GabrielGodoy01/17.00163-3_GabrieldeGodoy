package com.company;

import java.util.Scanner;

public class Jogo {
    private Jogador j1, j2;

    public void jogar(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe o nome do jogador 1: ");
        String nome = scanner.nextLine();
        System.out.println("Jogada do Jogador 1: ");
        System.out.println("1 - PEDRA");
        System.out.println("2 - TESOURA");
        System.out.println("3 - PAPEL");
        int escolha = Integer.parseInt(scanner.nextLine());
        switch (escolha){
            case 1:
                j1 = new Jogador(nome, Jogada.PEDRA); break;
            case 2:
                j1 = new Jogador(nome, Jogada.TESOURA); break;
            default:
                j1 = new Jogador(nome, Jogada.PAPEL); break;
        }
        System.out.println("Informe o nome do jogador 2: ");
        nome = scanner.nextLine();
        System.out.println("Jogada do Jogador 2: ");
        System.out.println("1 - PEDRA");
        System.out.println("2 - TESOURA");
        System.out.println("3 - PAPEL");
        escolha = Integer.parseInt(scanner.nextLine());
        switch (escolha){
            case 1:
                j2 = new Jogador(nome, Jogada.PEDRA); break;
            case 2:
                j2 = new Jogador(nome, Jogada.TESOURA); break;
            default:
                j2 = new Jogador(nome, Jogada.PAPEL); break;
        }

        System.out.println("J1 - " + j1.competicao(j2) + " - J2");

    }
}
