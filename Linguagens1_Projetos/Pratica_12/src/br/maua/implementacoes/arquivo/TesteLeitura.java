package br.maua.implementacoes.arquivo;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.sql.SQLOutput;

public class TesteLeitura {
    public static void main(String[] args) {
        File file = new File("nome.txt");
        try{
            //Cria um fluxo de leitura
            FileReader fileReader = new FileReader(file);
            //Buffer de leitura
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            bufferedReader.lines().forEach(linha -> {
                System.out.println("Linha Lida: " + linha);
            });
            
            //Feche tudo ao terminar
            bufferedReader.close();
            fileReader.close();
        }catch(Exception exception){
            System.out.println("Algo deu errado!");
            exception.printStackTrace();
        }
    }
}
