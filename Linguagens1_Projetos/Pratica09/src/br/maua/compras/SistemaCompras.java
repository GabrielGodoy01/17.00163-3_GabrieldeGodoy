package br.maua.compras;

import br.maua.models.Produto;

import java.util.ArrayList;
import java.util.List;

public class SistemaCompras {
    private final List<Produto> produtos;
    private final ListaCompras listaCompras;

    public SistemaCompras() {
        produtos = new ArrayList<>();
        produtos.add(new Produto(1, "FF7", 299.00));
        produtos.add(new Produto(1, "Zelda", 299.00));
        produtos.add(new Produto(1, "Mario", 299.00));
        produtos.add(new Produto(1, "Animal Crossing", 399.00));

        listaCompras = new ListaCompras();
    }

    public void exibirListaProdutos(){
        System.out.println("Lista de Produtos Disponíveis: ");
        produtos.forEach(produto -> System.out.println(produto));
    }

    public void run(){
        exibirListaProdutos();
    }


}

