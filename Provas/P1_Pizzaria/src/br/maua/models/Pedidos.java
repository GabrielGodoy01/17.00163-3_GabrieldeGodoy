package br.maua.models;

import br.maua.enums.Estado;
import br.maua.enums.FormaPagamento;
import br.maua.interfaces.ChecarPedidos;

import java.util.ArrayList;
import java.util.Random;

public class Pedidos implements ChecarPedidos {
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

    public String getId() {
        return id;
    }

    public String getDescricao() {
        return descricao;
    }

    public double getValor() {
        return valor;
    }

    public FormaPagamento getFormaPagamento() {
        return formaPagamento;
    }

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }

    private String geradorId() {
        Random random = new Random();
        String idGerado = "";
        for (int i=0; i < 3; i++)
            idGerado += random.nextInt(10);
        return idGerado;
    }

    @Override
    public String toString() {
        return "ID: " + getId() + "  -  " +
                "Descrição: " + getDescricao() + "  -  " +
                "Valor: " + getValor() + "  -  " +
                "Forma de Pagamento: " + getFormaPagamento() + "  -  "+
                "Estado: " + getEstado() + "\n";
    }

    @Override
    public void checarPedidos(ArrayList<Pedidos> pedidos) {
        for (Pedidos item : pedidos) {
            System.out.println(item.toString());
        }
    }
}
