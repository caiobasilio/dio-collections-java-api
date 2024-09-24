package com.dio.collections.set.ordenacao;

import java.util.*;

public class CadastroProdutos {

    private Set<Produto> produtosSet;

    public CadastroProdutos() {
        produtosSet = new HashSet<Produto>();
    }

    public void adicionarProduto(long cod, String nome, double preco, int quantidade) {
        produtosSet.add(new Produto(cod, nome, preco, quantidade));
    }

    public Set<Produto> exibirProdutosPorNome() {
        return new TreeSet<Produto>(produtosSet);
    }

    public Set<Produto> exibirProdutosPorPreco() {
        Set<Produto> produtosPorPreco = new TreeSet<>(new ComparatorProdutoPorPreco());
        produtosPorPreco.addAll(produtosSet);
        return produtosPorPreco;
    }

    public static void main(String[] args) {
        CadastroProdutos cadastroProdutos = new CadastroProdutos();
        cadastroProdutos.adicionarProduto(1123, "produto 1", 2.2, 1);
        cadastroProdutos.adicionarProduto(1124, "produto 2", 2.4, 1);
        cadastroProdutos.adicionarProduto(1125, "aproduto 5", 1.17, 2);
        cadastroProdutos.adicionarProduto(1126, "aproduto 6", 0.7, 2);
        cadastroProdutos.adicionarProduto(1127, "aproduto 7", 6.7, 2);
        System.out.println("Por nome: " + cadastroProdutos.exibirProdutosPorNome());
        System.out.println("Por preco: " + cadastroProdutos.exibirProdutosPorPreco());

    }
}
