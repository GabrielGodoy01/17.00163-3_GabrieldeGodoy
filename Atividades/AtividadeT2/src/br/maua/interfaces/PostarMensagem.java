package br.maua.interfaces;

import br.maua.models.Funcionarios;

import java.util.ArrayList;

/**
 * Interface que tem por objetivo printar mensagens de todos os funcionários da empresa.
 */

public interface PostarMensagem {
    public void mensagem(ArrayList<Funcionarios> funcionarios);
}
