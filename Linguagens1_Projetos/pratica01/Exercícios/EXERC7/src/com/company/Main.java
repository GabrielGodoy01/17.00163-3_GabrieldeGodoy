package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int i, soma;

        System.out.println("Digite o valor inicial: ");
        int valorinic = s.nextInt();
        System.out.println("Digite o valor final: ");
        int valorfim = s.nextInt();

        for(i = 1; i == valorfim; ++i){
            i = valorinic + 1;
            soma += i;
        }
    }

}