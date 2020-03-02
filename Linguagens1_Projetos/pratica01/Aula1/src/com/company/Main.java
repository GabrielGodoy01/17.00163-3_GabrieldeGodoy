package com.company;

import com.sun.org.apache.xpath.internal.SourceTree;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    double n1,n2;
	    //sout + tab
        System.out.println("Infome 2 valores:");
        Scanner scanner =  new Scanner(System.in);

        n1 = scanner.nextDouble();
        //ctrl + d para duplicar a linha
        n2 = scanner.nextDouble();
        if(n1>n2){
            System.out.println("N1 maior!");
        }else{
            System.out.println("N2 maior!");
        }

    }
}
