package com.dio.collections.set.operacoesbasicas.palavrasunicas;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoPalavrasUnicas {

    private Set<String> conjuntoDePalavras;

    public ConjuntoPalavrasUnicas() {
        conjuntoDePalavras = new HashSet<String>();
    }

    public void adicionarPalavra(String palavra) {
        conjuntoDePalavras.add(palavra);
    }

    public void removerPalavra(String palavra) {
        conjuntoDePalavras.remove(pesquisarConjuntoPorPalavra(palavra));
    }

    public boolean verificarPalavra(String palavra) {
        return (pesquisarConjuntoPorPalavra(palavra) != null) ? true : false;
    }

    public void exibirPalavrasUnicas() {
        System.out.println(conjuntoDePalavras);
    }

    private String pesquisarConjuntoPorPalavra (String palavra) {
        for (String p : conjuntoDePalavras) {
            if (p == palavra) return p;
        }
        return null;
    }

    public static void main(String[] args) {
        ConjuntoPalavrasUnicas conjuntoPalavrasUnicas = new ConjuntoPalavrasUnicas();

        conjuntoPalavrasUnicas.adicionarPalavra("Primeira palavra");
        conjuntoPalavrasUnicas.adicionarPalavra("Segunda palavra");
        conjuntoPalavrasUnicas.adicionarPalavra("Terceira palavra");
        conjuntoPalavrasUnicas.adicionarPalavra("Quarta palavra");
        conjuntoPalavrasUnicas.exibirPalavrasUnicas();
        conjuntoPalavrasUnicas.removerPalavra("Segunda palavra");
        System.out.println(conjuntoPalavrasUnicas.verificarPalavra("Segunda palavra"));
        System.out.println(conjuntoPalavrasUnicas.verificarPalavra("Terceira palavra"));
        conjuntoPalavrasUnicas.exibirPalavrasUnicas();

    }

}
