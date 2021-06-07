package br.maua.repositories;

import br.maua.models.Funcionarios;

public interface IRepository {
    void removerFuncionario(Funcionarios funcionarios);
    void adicionarFuncionario(Funcionarios funcionarios);
    void mostrarFuncionarios();
    Funcionarios retornarFuncionario(String usuario);
    void alterarJornada(int alterar);
    void postarMensagens();
}
