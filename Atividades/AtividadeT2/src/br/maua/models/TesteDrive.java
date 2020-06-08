package br.maua.models;

import br.maua.enumeracoes.HorarioSistema;
import br.maua.enumeracoes.TiposMembros;

public class TesteDrive {
    public static void run(){
        Funcionarios func1 = new Funcionarios("a","b", TiposMembros.MOBILEMEMBERS);
        Funcionarios func2 = new Funcionarios("b","b", TiposMembros.HEAVYLIFTERS);
        Funcionarios func3 = new Funcionarios("c","b", TiposMembros.SCRIPTGUYS);
        Funcionarios func4 = new Funcionarios("d","b", TiposMembros.BIGBROTHERS);

        System.out.println("Bem-vindo!");
        System.out.println("Horário de Trabalho: " + func1.getHorarioSistema());

    }
}
