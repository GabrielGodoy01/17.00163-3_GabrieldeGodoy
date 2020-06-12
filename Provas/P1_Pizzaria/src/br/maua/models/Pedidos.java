package br.maua.models;

import br.maua.enums.Estado;
import br.maua.enums.FormaPagamento;

import java.util.Random;

public class Pedidos {
    private String id;
    private String descricao;
    private double valor;
    private FormaPagamento formaPagamento;
    private Estado estado;

    public Pedidos(String descricao, double valor, FormaPagamento formaPagamento) {
        this.id = geradorId();
        this.descricao = descricao;
        this.valor = valor;
        this.formaPagamento = formaPagamento;
        this.estado = Estado.REALIZADO;
    }

    private String geradorId() {
        Random random = new Random();
        String idGerado = "";
        for (int i=0; i < 3; i++)
            idGerado += random.nextInt(10);
        return idGerado;
    }
}
