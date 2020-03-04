package com.company;

import java.util.Objects;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Crie seu usuário: ");
        String usuario = scanner.next();
        System.out.println("Crie sua senha: ");
        String senha = scanner.next();
        System.out.println("\n Executando Programa...\n ");
        System.out.println("Entre com seu usuário: ");
        String usuario1 = scanner.next();
        System.out.println("Entre com sua senha: ");
        String senha1 = scanner.next();

        System.out.println(usuario + senha + usuario1 +senha1);

        if(usuario==usuario1){
            System.out.println("Login realizado com sucesso!");

            }/*else{while((usuario != usuario1) || (senha != senha1)){
            System.out.println("Entre com seu usuário: ");
            usuario1 = scanner.next();
            System.out.println("Entre com sua senha: ");
            senha1 = scanner.next();
        }

        }*/



    }
}
