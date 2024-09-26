package com.dio.collections.map.ordenacao.livrariaonline;

import java.util.*;

public class LivrariaOnline {

    private Map<String, Livro> livrosDisponiveisMap;

    public LivrariaOnline () {
        livrosDisponiveisMap = new HashMap<>();
    }

    public void adicionarLivro(String link, String titulo, String autor, double preco) {
        livrosDisponiveisMap.put(link, new Livro(titulo, autor, preco));
    }

    public void removerLivro(String titulo) {
        if (!livrosDisponiveisMap.isEmpty()) {
            for (Map.Entry<String, Livro> entry : livrosDisponiveisMap.entrySet()) {
                if (entry.getValue().getTitulo().equalsIgnoreCase(titulo)) {
                    livrosDisponiveisMap.remove(entry.getKey());
                    break;
                }
            }
        }
    }

    public Map<String, Livro> exibirLivrosOrdenadosPorPreco() {
        List<Map.Entry<String, Livro>> livrosParaOrdenarPorPreco = new ArrayList<>(livrosDisponiveisMap.entrySet());

        Collections.sort(livrosParaOrdenarPorPreco, new ComparatorPorPreco());

        Map<String, Livro> livrosOrdenadosPorPreco = new LinkedHashMap<>();

        for (Map.Entry<String, Livro> entry : livrosParaOrdenarPorPreco) {
            livrosOrdenadosPorPreco.put(entry.getKey(), entry.getValue());
        }

        return livrosOrdenadosPorPreco;
    }

    public Map<String, Livro> exibirLivrosOrdenadosPorAutor() {
        List<Map.Entry<String, Livro>> livrosParaOrdenarPorAutor = new ArrayList<>(livrosDisponiveisMap.entrySet());

        Collections.sort(livrosParaOrdenarPorAutor, new ComparatorPorAutor());

        Map<String, Livro> livrosOrdenadosPorAutor = new LinkedHashMap<>();

        for (Map.Entry<String, Livro> entry : livrosParaOrdenarPorAutor) {
            livrosOrdenadosPorAutor.put(entry.getKey(), entry.getValue());
        }

        return livrosOrdenadosPorAutor;
    }

    public List<Livro> pesquisarLivrosPorAutor(String autor) {
        List<Livro> livrosPorAutorList = new ArrayList<Livro>();
        if (!livrosDisponiveisMap.isEmpty()) {
            for (Livro l : livrosDisponiveisMap.values()) {
                if (l.getAutor().equalsIgnoreCase(autor)) {
                    livrosPorAutorList.add(l);
                }
            }
        }
        return livrosPorAutorList;
    }

    public Livro obterLivroMaisCaro() {
        double valorLivroMaisCaro = Double.MIN_VALUE;
        Livro livroMaisCaro = null;
        if (!livrosDisponiveisMap.isEmpty()) {
            for (Livro l : livrosDisponiveisMap.values()) {
                if (l.getPreco() > valorLivroMaisCaro) {
                    livroMaisCaro = l;
                }
            }
        }
        return livroMaisCaro;
    }

    public Livro exibirLivroMaisBarato() {
        double valorLivroMaisBarato = Double.MAX_VALUE;
        Livro livroMaisBarato = null;
        if (!livrosDisponiveisMap.isEmpty()) {
            for (Livro l : livrosDisponiveisMap.values()) {
                if (l.getPreco() < valorLivroMaisBarato) {
                    livroMaisBarato = l;
                }
            }
        }
        return livroMaisBarato;
    }

    public static void main(String[] args) {
        LivrariaOnline livrariaOnline = new LivrariaOnline();
        livrariaOnline.adicionarLivro("link1", "Titulo 1", "Autor 1", 20.5);
        livrariaOnline.adicionarLivro("link2", "Titulo 3", "Autor 2", 22.5);
        livrariaOnline.adicionarLivro("link3", "Titulo 2", "Autor 3", 12.5);
        livrariaOnline.adicionarLivro("link5", "Titulo 5", "Autor 5", 52.5);

        System.out.println(livrariaOnline.exibirLivrosOrdenadosPorPreco());
        System.out.println("---------");
        livrariaOnline.removerLivro("Titulo 2");
        System.out.println(livrariaOnline.exibirLivrosOrdenadosPorPreco());
        System.out.println(livrariaOnline.exibirLivrosOrdenadosPorAutor());
        System.out.println("---------");
        System.out.println(livrariaOnline.pesquisarLivrosPorAutor("Autor 5"));
        System.out.println(livrariaOnline.obterLivroMaisCaro());
        System.out.println(livrariaOnline.exibirLivroMaisBarato());

    }
}
