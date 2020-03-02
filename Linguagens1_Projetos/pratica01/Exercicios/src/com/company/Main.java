package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int ra, telefone, idade;
        String nome, email;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite seu RA: ");
        ra = scanner.nextInt();
        System.out.println("Digite seu nome completo: ");
        nome = scanner.next();
        System.out.println("Digite seu telefone: ");
        telefone = scanner.nextInt();
        System.out.println("Digite seu email: ");
        email = scanner.next();
        System.out.println("Digite seu idade: ");
        idade = scanner.nextInt();


        System.out.println("{" + ra +" "+ nome + " "+ telefone +" "+ email +" "+ idade + "}");
    }
}
