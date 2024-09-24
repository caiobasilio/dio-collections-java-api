package com.dio.collections.map.pesquisa;

import java.util.HashMap;
import java.util.Map;

public class EstoqueProdutos {

    private Map<Long, Produto> produtosMap;

    public EstoqueProdutos() {
        produtosMap = new HashMap<Long, Produto>();
    }

    public void adicionarProduto(long cod, String nome, int quantidade, double preco) {
        produtosMap.put(cod, new Produto(nome, quantidade, preco));
    }

    public void exibirProdutos() {
        System.out.println(produtosMap);
    }

    public double calcularValorTotalEstoque() {
        double valorTotal = 0.0;
        if (!produtosMap.isEmpty()) {
            for (Map.Entry<Long, Produto> entry : produtosMap.entrySet()) {
                valorTotal += entry.getValue().getPreco() * entry.getValue().getQuantidade();
            }
        }
        return valorTotal;
    }

    public Produto obterProdutoMaisCaro() {
        double valorMaisAlto = Double.MIN_VALUE;
        Produto produtoMaisCaro = null;
        if (!produtosMap.isEmpty()) {
            for (Map.Entry<Long, Produto> entry : produtosMap.entrySet()) {
                if (entry.getValue().getPreco() > valorMaisAlto) {
                    valorMaisAlto = entry.getValue().getPreco();
                    produtoMaisCaro = entry.getValue();
                }
            }
        }
        return produtoMaisCaro;
    }

    public Produto obterProdutoMaisBarato() {
        double valorMaisBaixo = Double.MAX_VALUE;
        Produto produtoMaisBarato = null;
        if (!produtosMap.isEmpty()) {
            for (Map.Entry<Long, Produto> entry : produtosMap.entrySet()) {
                if (entry.getValue().getPreco() < valorMaisBaixo) {
                    valorMaisBaixo = entry.getValue().getPreco();
                    produtoMaisBarato = entry.getValue();
                }
            }
        }
        return produtoMaisBarato;
    }

    public Produto obterProdutoMaiorQuantidadeValorTotalNoEstoque() {
        double valorMaisAlto = Double.MIN_VALUE;
        Produto produtoMaisCaroNoEstoque = null;
        if (!produtosMap.isEmpty()) {
            for (Map.Entry<Long, Produto> entry : produtosMap.entrySet()) {
                if ((entry.getValue().getPreco() * entry.getValue().getQuantidade()) > valorMaisAlto) {
                    valorMaisAlto = entry.getValue().getPreco() * entry.getValue().getQuantidade();
                    produtoMaisCaroNoEstoque = entry.getValue();
                }
            }
        }
        return produtoMaisCaroNoEstoque;
    }

    public static void main(String[] args) {
        EstoqueProdutos estoque = new EstoqueProdutos();

        // Exibe o estoque vazio
        estoque.exibirProdutos();

        // Adiciona produtos ao estoque
        estoque.adicionarProduto(1L, "Notebook", 1, 1500.0);
        estoque.adicionarProduto(2L, "Mouse", 5, 25.0);
        estoque.adicionarProduto(3L, "Monitor", 10, 400.0);
        estoque.adicionarProduto(4L, "Teclado", 2, 40.0);

        // Exibe os produtos no estoque
        estoque.exibirProdutos();

        // Calcula e exibe o valor total do estoque
        System.out.println("Valor total do estoque: R$" + estoque.calcularValorTotalEstoque());

        // Obtém e exibe o produto mais caro
        Produto produtoMaisCaro = estoque.obterProdutoMaisCaro();
        System.out.println("Produto mais caro: " + produtoMaisCaro);

        // Obtém e exibe o produto mais barato
        Produto produtoMaisBarato = estoque.obterProdutoMaisBarato();
        System.out.println("Produto mais barato: " + produtoMaisBarato);

        // Obtém e exibe o produto com a maior quantidade em valor no estoque
        Produto produtoMaiorQuantidadeValorTotal = estoque.obterProdutoMaiorQuantidadeValorTotalNoEstoque();
        System.out.println("Produto com maior quantidade em valor no estoque: " + produtoMaiorQuantidadeValorTotal);
    }
}
