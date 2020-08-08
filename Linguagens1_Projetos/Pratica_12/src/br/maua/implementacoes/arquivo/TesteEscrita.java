package br.maua.implementacoes.arquivo;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;

public class TesteEscrita {
    public static void main(String[] args) {
        //Cria um arquivo
        File file = new File("nome.txt");
        try{
            //Cria uma conexão para escrever no arquivo
            FileWriter fileWriter = new FileWriter(file);
            //Cria um buffer de escrita
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            //Escrever algo no arquivo
            bufferedWriter.write("Ola Mundo arquivos\n");
            bufferedWriter.write("bom dia primo\n");
            bufferedWriter.write("Ellie vai morrer em TLOU3");

            //Força a escrita na hora
            //bufferedWriter.flush();

            //Fecha o buffer e escreve no arquivo
            bufferedWriter.close();
            //Fecha os demais fluxos
            fileWriter.close();
        }catch(Exception exception){
            System.out.println("Algo deu errado!");
            exception.printStackTrace();
        }
    }
}
