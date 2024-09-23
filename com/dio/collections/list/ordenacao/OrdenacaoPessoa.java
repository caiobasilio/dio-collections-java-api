package com.dio.collections.list.ordenacao;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class OrdenacaoPessoa {

    private List<Pessoa> listaDePessoas;

    public OrdenacaoPessoa() {
        this.listaDePessoas = new ArrayList<Pessoa>();
    }

    public void adicionarPessoa(String nome, int idade, double altura) {
        listaDePessoas.add(new Pessoa(nome, idade, altura));
    }

    public List<Pessoa> ordenarPorIdade() {
        List<Pessoa> listaOrdenadaPorIdade = new ArrayList<>(listaDePessoas);
        Collections.sort(listaOrdenadaPorIdade);
        return listaOrdenadaPorIdade;
    }

    public List<Pessoa> ordenarPorAltura() {
        List<Pessoa> listaOrdenadaPorAltura = new ArrayList<>(listaDePessoas);
        Collections.sort(listaOrdenadaPorAltura, new ComparatorPorAltura());
        return listaOrdenadaPorAltura;
    }

    public static void main(String[] args) {
        OrdenacaoPessoa ordenacaoPessoa = new OrdenacaoPessoa();
        ordenacaoPessoa.adicionarPessoa("Pessoa 1", 20, 1.80);
        ordenacaoPessoa.adicionarPessoa("Pessoa 2", 22, 1.82);
        ordenacaoPessoa.adicionarPessoa("Pessoa 3", 28, 1.78);
        ordenacaoPessoa.adicionarPessoa("Pessoa 4", 16, 1.56);

        System.out.println(ordenacaoPessoa.ordenarPorIdade());
        System.out.println(ordenacaoPessoa.ordenarPorAltura());
    }

}
