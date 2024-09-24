package com.dio.collections.map.operacoesbasicas.dicionario;

import java.util.HashMap;
import java.util.Map;

public class Dicionario {

    private Map<String, String> palavrasMap;

    public Dicionario() {
        palavrasMap = new HashMap<String, String>();
    }

    public void adicionarPalavra(String palavra, String definicao) {
        palavrasMap.put(palavra, definicao);
    }

    public void removerPalavra(String palavra) {
        if (!palavrasMap.isEmpty()) {
            palavrasMap.remove(palavra);
        }
    }

    public void exibirPalavras() {
        System.out.println(palavrasMap);
    }

    public String pesquisarPorPalavra(String palavra) {
        if (!palavrasMap.isEmpty()) {
            return palavrasMap.get(palavra);
        }
        return null;
    }

    public static void main(String[] args) {
        Dicionario dicionario = new Dicionario();
        dicionario.adicionarPalavra("Abcd", "Definicao Abcd");
        dicionario.adicionarPalavra("Abcde", "Definicao Abcde");
        dicionario.adicionarPalavra("Abcdef", "Definicao Abcdef");
        dicionario.adicionarPalavra("Abcdefg", "Definicao Abcdefg");
        dicionario.exibirPalavras();
        dicionario.removerPalavra("Abcdef");
        dicionario.exibirPalavras();
        System.out.println(dicionario.pesquisarPorPalavra("Abcde"));


    }
}
