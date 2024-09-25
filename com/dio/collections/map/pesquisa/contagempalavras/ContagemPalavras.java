package com.dio.collections.map.pesquisa.contagempalavras;

import com.dio.collections.map.pesquisa.Produto;

import java.util.HashMap;
import java.util.Map;

public class ContagemPalavras {

    private Map<String, Integer> contagemPalavrasMap;

    public ContagemPalavras() {
        contagemPalavrasMap = new HashMap<>();
    }

    public void adicionarPalavra(String palavra, Integer contagem) {
        contagemPalavrasMap.put(palavra, contagem);
    }

    public void removerPalavra(String palavra) {
        if (!contagemPalavrasMap.isEmpty())
            contagemPalavrasMap.remove(palavra);
    }

    public int exibirContagemPalavras() {
        int contagemTotal = 0;
        if (!contagemPalavrasMap.isEmpty()) {
            for (int contagem : contagemPalavrasMap.values()) {
                contagemTotal += contagem;
            }
        }
        return contagemTotal;
    }

    public String encontrarPalavraMaisFrequente() {
        String palavraComMaiorContagem = null;
        if (!contagemPalavrasMap.isEmpty()) {
            int contagemMaior = Integer.MIN_VALUE;
            for (Map.Entry<String, Integer> entry : contagemPalavrasMap.entrySet()) {
                if (entry.getValue() > contagemMaior) {
                    contagemMaior = entry.getValue();
                    palavraComMaiorContagem = entry.getKey();
                }
            }
        }
        return palavraComMaiorContagem;
    }

    public static void main(String[] args) {
        ContagemPalavras contagemLinguagens = new ContagemPalavras();

        // Adiciona linguagens e suas contagens
        contagemLinguagens.adicionarPalavra("Java", 2);
        contagemLinguagens.adicionarPalavra("Python", 8);
        contagemLinguagens.adicionarPalavra("JavaScript", 1);
        contagemLinguagens.adicionarPalavra("C#", 6);

        System.out.println(contagemLinguagens);
        // Exibe a contagem total de linguagens
        System.out.println("Existem " + contagemLinguagens.exibirContagemPalavras() + " palavras.");

        // Encontra e exibe a linguagem mais frequente
        String linguagemMaisFrequente = contagemLinguagens.encontrarPalavraMaisFrequente();
        System.out.println("A linguagem mais frequente é: " + linguagemMaisFrequente);
    }
}
