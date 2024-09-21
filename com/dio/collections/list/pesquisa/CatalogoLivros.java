package com.dio.collections.list.pesquisa;

import java.util.ArrayList;
import java.util.List;

public class CatalogoLivros {

    private List<Livro> listaDeLivros;

    public CatalogoLivros() {
        listaDeLivros = new ArrayList<>();
    }

    public void adicionarLivro(String titulo, String autor, int anoPublicacao) {
        listaDeLivros.add(new Livro(titulo, autor, anoPublicacao));
    }

    public List<Livro> pesquisarPorAutor(String autor) {
        List<Livro> listaDeLivrosDoAutor = new ArrayList<Livro>();
        if (!listaDeLivros.isEmpty()) {
            for (Livro l : listaDeLivros) {
                if (l.getAutor().equalsIgnoreCase(autor)) {
                    listaDeLivrosDoAutor.add(l);
                }
            }
        }
        return listaDeLivrosDoAutor;
    }

    public List<Livro> pesquisarPorIntervaloAnos(int anoInicial, int anoFinal) {
        List<Livro> listaDeLivrosPorIntervaloAnos = new ArrayList<Livro>();
        if (!listaDeLivros.isEmpty()) {
            for (Livro l : listaDeLivros) {
                if (l.getAnoPublicacao() >= anoInicial && l.getAnoPublicacao() <= anoFinal) {
                    listaDeLivrosPorIntervaloAnos.add(l);
                }
            }
        }
        return listaDeLivrosPorIntervaloAnos;
    }

    public Livro pesquisarPorTitulo(String titulo) {
        if (!listaDeLivros.isEmpty()) {
            for (Livro l : listaDeLivros) {
                if (l.getTitulo().equalsIgnoreCase(titulo)) {
                    return l;
                }
            }
        }
        return null;
    }

    public static void main(String[] args) {
        CatalogoLivros catalogoLivros = new CatalogoLivros();
        catalogoLivros.adicionarLivro("Livro 1", "Autor 1", 2020);
        catalogoLivros.adicionarLivro("Livro 2", "Autor 1", 2021);
        catalogoLivros.adicionarLivro("Livro 3", "Autor 2", 2022);
        catalogoLivros.adicionarLivro("Livro 4", "Autor 3", 2023);

        System.out.println(catalogoLivros.pesquisarPorAutor("Autor 1"));
        System.out.println(catalogoLivros.pesquisarPorIntervaloAnos(2021, 2023));
        System.out.println(catalogoLivros.pesquisarPorTitulo("Livro 4"));
    }
}
