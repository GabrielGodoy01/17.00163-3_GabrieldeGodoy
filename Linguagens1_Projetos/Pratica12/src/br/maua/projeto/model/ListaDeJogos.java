package br.maua.projeto.model;

import br.maua.projeto.model.Jogo;

import java.util.ArrayList;
import java.util.List;

public class ListaDeJogos {
    private List<Jogo> minhaListaDeJogos;

    public ListaDeJogos() {
        this.minhaListaDeJogos = new ArrayList<>();
    }

    public void addJogo(Jogo jogo){
        this.minhaListaDeJogos.add(jogo);
    }

    @Override
    public String toString() {
        return "ListaDeJogos{" +
                "minhaListaDeJogoa=" + minhaListaDeJogos +
                '}';
    }

    public final List<Jogo> getJogos() {
        return this.minhaListaDeJogos;
    }
}
