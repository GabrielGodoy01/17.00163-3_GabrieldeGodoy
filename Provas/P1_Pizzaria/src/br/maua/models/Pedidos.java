package br.maua.models;

import br.maua.enums.Estado;
import br.maua.enums.FormaPagamento;

public class Pedidos {
    private String id;
    private String descricao;
    private double valor;
    private FormaPagamento formaPagamento;
    private Estado estado;

    public Pedidos(String id, String descricao, double valor, FormaPagamento formaPagamento) {
        this.id = id;
        this.descricao = descricao;
        this.valor = valor;
        this.formaPagamento = formaPagamento;
        this.estado = Estado.REALIZADO;
    }
}
