package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Informe o valor: ");
        String num = s.next();
        int soma = 0;

        for(int i=0; i < num.length(); i++){

            soma += Integer.parseInt(""+num.charAt(i));
            System.out.println("Somatória:" + soma);
        }



    }
}
