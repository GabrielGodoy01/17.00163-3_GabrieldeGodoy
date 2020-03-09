package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Informe o início do intevalo: ");
        int ini = s.nextInt();

        System.out.println("Informe o final do intervalo: ");
        int fim = s.nextInt();

        int i = ini;
        int soma = ini;

        while(i<fim){
            i++;
            soma+=i;
        }
        System.out.println(soma);
    }

}