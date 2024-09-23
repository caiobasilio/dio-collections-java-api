package com.dio.collections.list.ordenacao.numeros;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class OrdenacaoNumeros {

    List<Integer> listaDeNumerosInteiros;

    public OrdenacaoNumeros() {
        listaDeNumerosInteiros = new ArrayList<Integer>();
    }

    public void adicionarNumero(int numero) {
        listaDeNumerosInteiros.add(Integer.valueOf(numero));
    }

    public List<Integer> ordenarAscendente() {
        List<Integer> listaDeNumerosInteirosAscendente = new ArrayList<Integer>(listaDeNumerosInteiros);
        Collections.sort(listaDeNumerosInteirosAscendente);
        return listaDeNumerosInteirosAscendente;
    }

    public List<Integer> ordenarDescendente() {
        List<Integer> listaDeNumerosInteirosDescendente = new ArrayList<Integer>(listaDeNumerosInteiros);
        Collections.sort(listaDeNumerosInteirosDescendente);
        Collections.reverse(listaDeNumerosInteirosDescendente);
        return listaDeNumerosInteirosDescendente;
    }

    public static void main(String[] args) {
        OrdenacaoNumeros ordenacaoNumeros = new OrdenacaoNumeros();

        ordenacaoNumeros.adicionarNumero(3);
        ordenacaoNumeros.adicionarNumero(5);
        ordenacaoNumeros.adicionarNumero(22);
        ordenacaoNumeros.adicionarNumero(2267);
        ordenacaoNumeros.adicionarNumero(1);
        ordenacaoNumeros.adicionarNumero(8);

        System.out.println(ordenacaoNumeros.listaDeNumerosInteiros);
        System.out.println(ordenacaoNumeros.ordenarAscendente());
        System.out.println(ordenacaoNumeros.ordenarDescendente());

    }
}
