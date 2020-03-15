package Jogo;

import java.util.Scanner;

public class TesteDrive {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);


        Jogo c1;
        c1 = new Jogo();
        c1.jogadores = new Jogadores();
        System.out.println("Nome do jogador 1: ");
        c1.jogadores.nome = s.nextLine();
        System.out.println("Digite 'pedra' 'papel' ou 'tesoura': ");
        c1.jogadores.ppt = s.nextLine();


        Jogo c2;
        c2 = new Jogo();
        c2.jogadores = new Jogadores();
        System.out.println("Nome do jogador 2: ");
        c2.jogadores.nome = s.nextLine();
        System.out.println("Digite 'pedra' 'papel' ou 'tesoura': ");
        c2.jogadores.ppt = s.nextLine();

        c1.primeiro(c2.jogadores.ppt);



    }

}
