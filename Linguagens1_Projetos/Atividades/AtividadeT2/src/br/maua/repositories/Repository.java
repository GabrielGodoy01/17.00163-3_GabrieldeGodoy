package br.maua.repositories;

import java.util.ArrayList;

import br.maua.enumeracoes.HorarioSistema;
import br.maua.models.Funcionarios;

public class Repository implements IRepository{

    ArrayList<Funcionarios> funcionarios = new ArrayList<>();

    @Override
    public void removerFuncionario(Funcionarios funcionarios) {
        this.funcionarios.remove(funcionarios);
        System.out.println(funcionarios.getUsuario() + " removido do cadastro de funcionários!");
        
    }

    @Override
    public void adicionarFuncionario(Funcionarios funcionarios) {
        this.funcionarios.add(funcionarios);
        
    }

    @Override
    public void mostrarFuncionarios() {
        for(Funcionarios funcionario : funcionarios){
            funcionario.apresentarUsuario();
        }
    }

    @Override
    public Funcionarios retornarFuncionario(String usuario) {
        for(Funcionarios funcionario : funcionarios){
            if(funcionario.getUsuario().equals(usuario)){
                return funcionario;
            }
        }
        return null;
    }

    @Override
    public void alterarJornada(int alterar) {
        if(alterar == 0) {
            for(Funcionarios funcionario : funcionarios) {
                funcionario.setHorarioSistema(HorarioSistema.NORMAL);
            }
            System.out.println("A jornada esta setada em NORMAL");
        }else if(alterar == 1) {
            for(Funcionarios funcionario : funcionarios) {
                funcionario.setHorarioSistema(HorarioSistema.EXTRA);
            }
            System.out.println("A jornada esta setada em NORMAL");
        }
        
    }

    @Override
    public ArrayList<Funcionarios> getFuncionarios(){
        return funcionarios;
    }
    
}
