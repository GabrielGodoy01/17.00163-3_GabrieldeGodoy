package br.maua.views;

import br.maua.enumeracoes.TiposMembros;
import br.maua.models.BigBrothers;
import br.maua.models.Funcionarios;
import br.maua.models.HeavyLifters;
import br.maua.models.MobileMembers;
import br.maua.models.ScriptGuys;
import br.maua.repositories.IRepository;
import br.maua.repositories.Repository;

import java.util.Scanner;

/**
 * Classe responsável pelo sistema principal do programa.
 *      Trabalha com um sistema de looping switch case no método run para intefaciar com o usuário até onde ele quiser.
 * @author Gabriel de Godoy Braz e Matheus Vivas - 17.00163-3/17.04401-4
 */

public class Sistema{

    public static void run(){

        IRepository repository = new Repository();

        int principal = 1;
        Scanner scanner = new Scanner(System.in);

        do{
            Menu();

            principal = scanner.nextInt();

            switch (principal) {
                case 0:
                    break;
                    
                case 1:
                    Funcionarios f = MenuCadastro();
                    if (f != null){
                        repository.adicionarFuncionario(f);;
                    }                    
                    break;
                    
                case 2:
                    repository.mostrarFuncionarios();
                    break;

                case 3:
                    repository.mostrarFuncionarios();
                    System.out.println("Digite o nome do usuário que deseja remover: ");
                    String remove = scanner.next();
                    Funcionarios funcionarios = repository.retornarFuncionario(remove);
                    repository.removerFuncionario(funcionarios);
                    break;

                case 4:
                    System.out.println("0 - Horário Normal");
                    System.out.println("1 - Horário EXTRA");
                    int alterar = scanner.nextInt();
                    repository.alterarJornada(alterar);
                    break;

                case 5:
                    repository.postarMensagens();
                    break;
            }
        } while(principal != 0);
    }

    public static void Menu(){
        System.out.println("1 - CADASTRAR UM NOVO MEMBRO");
        System.out.println("2 - APRESENTAÇÃO DOS MEMBROS CADASTRADOS");
        System.out.println("3 - DEIXAR UM COLABORADOR IR");
        System.out.println("4 - TROCAR A JORNADA DE TRABALHO");
        System.out.println("5 - POSTAR MENSAGENS");
        System.out.println("0 - SAIR DO SISTEMA");
    }

    public static Funcionarios MenuCadastro(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nome: ");
        String nome = scanner.next();
        System.out.println("E-mail: ");
        String email = scanner.next();
        System.out.println("Cargo: ");
        System.out.println("1 - MOBILE MEMBERS");
        System.out.println("2 - HEAVY LIFTERS");
        System.out.println("3 - SCRIPT GUYS");
        System.out.println("4 - BIG BROTHERS");
        System.out.println("0 - Sair");
        int cargo = scanner.nextInt();
        switch(cargo){
            case 1:
                return new MobileMembers(nome, email, TiposMembros.MOBILEMEMBERS);
            case 2:
                return new HeavyLifters(nome, email, TiposMembros.HEAVYLIFTERS);
            case 3:
                return new ScriptGuys(nome, email, TiposMembros.SCRIPTGUYS);
            case 4:
                return new BigBrothers(nome, email, TiposMembros.BIGBROTHERS);
            case 0:
                return null;
            default:
                return null;
        }
    }
}
