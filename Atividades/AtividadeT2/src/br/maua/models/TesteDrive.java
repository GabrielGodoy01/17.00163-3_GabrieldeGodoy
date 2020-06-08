package br.maua.models;

import br.maua.enumeracoes.HorarioSistema;
import br.maua.enumeracoes.TiposMembros;

import java.util.ArrayList;
import java.util.Scanner;

public class TesteDrive {
    public static void run(){

        ArrayList<Funcionarios> funcionarios = new ArrayList<>();
        
        System.out.println("1 - CADASTRAR UM NOVO MEMBRO\n");
        System.out.println("2 - APRESENTAÇÃO DOS MEMBROS CADASTRADOS\n");
        System.out.println("3 - DEIXAR UM COLABORADOR IR\n");
        System.out.println("4 - TROCAR A JORNADA DE TRABALHO\n");
        System.out.println("5 - POSTAR MENSAGENS\n");
        System.out.println("0 - SAIR DO SISTEMA\n");

        Scanner scanner = new Scanner(System.in);
        int principal = scanner.nextInt();

        while(principal != 0){
            switch (principal) {
                case 0:
                    break;
                    
                case 1:
                    System.out.println("Nome: ");
                    String nome = scanner.next();
                    System.out.println("E-mail: ");
                    String email = scanner.next();
                    System.out.println("Cargo: ");
                    System.out.println("1 - MOBILE MEMBERS");
                    System.out.println("2 - HEAVY LIFTERS");
                    System.out.println("3 - SCRIPT GUYS");
                    System.out.println("4 - BIG BROTHERS");
                    int cargo = scanner.nextInt();
                    if(cargo == 1){
                        funcionarios.add(new Funcionarios(nome,email,TiposMembros.MOBILEMEMBERS));
                    }else if (cargo == 2){
                        funcionarios.add(new Funcionarios(nome,email,TiposMembros.HEAVYLIFTERS));
                    }else if (cargo == 3){
                        funcionarios.add(new Funcionarios(nome,email,TiposMembros.SCRIPTGUYS));
                    }else if (cargo == 4){
                        funcionarios.add(new Funcionarios(nome,email,TiposMembros.BIGBROTHERS));
                    }
                    break;
                    
                case 2:
                    funcionarios.forEach(f -> System.out.println(funcionarios.toString()));
                    break;
                    
                case 3:
                    for(int i = 0; i < funcionarios.size(); i++) {
                        System.out.println(i + " - " + funcionarios.get(i).getUsuario());
                    }
                    int remove = scanner.nextInt();
                    funcionarios.remove(remove);

                case 4:

            }

        }

            }
        }
    }
}
