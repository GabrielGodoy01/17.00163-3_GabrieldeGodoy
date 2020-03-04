package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String nome1, nome2;
        int idade1, idade2;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o primeiro nome: ");
        nome1 = scanner.next();
        System.out.println("Digite a primeira idade: ");
        idade1 = scanner.nextInt();
        System.out.println("Digite o segundo nome: ");
        nome2 = scanner.next();
        System.out.println("Digite a segunda idade: ");
        idade2 = scanner.nextInt();
        if(idade1 > idade2) {
            System.out.println("A diferença de idade entre " + nome1 + " e " + nome2 + " é de " + (idade1 - idade2) + " anos");
        }else{
            System.out.println("A diferença de idade entre " + nome1 + " e " + nome2 + " é de " + (idade2 - idade1) + " anos");
        }
    }
}
