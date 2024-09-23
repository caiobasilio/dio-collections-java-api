package com.dio.collections.list.pesquisa.somanumeros;

import java.util.ArrayList;
import java.util.List;

public class SomaNumeros {
    private List<Integer> listaNumerosInteiros;

    public SomaNumeros() {
        listaNumerosInteiros = new ArrayList<Integer>();
    }

    public void adicionarNumero(int numero) {
        listaNumerosInteiros.add(Integer.valueOf(numero));
    }

    public int calcularSoma() {
        int somaTotal = 0;
        if (!listaNumerosInteiros.isEmpty()) {
            for (Integer i : listaNumerosInteiros) {
                somaTotal += i.intValue();
            }
        }
        return somaTotal;
    }

    public int encontrarMaiorNumero() {
        int maiorNumero = 0;
        if (!listaNumerosInteiros.isEmpty()) {
            for (Integer i : listaNumerosInteiros) {
                if (i.intValue() > maiorNumero) maiorNumero = i.intValue();
            }
        }
        return maiorNumero;
    }

    public int encontrarMenorNumero() {
        int menorNumero = 0;
        if (!listaNumerosInteiros.isEmpty()) {
            menorNumero = listaNumerosInteiros.get(0).intValue();
            for (int i = 1; i < listaNumerosInteiros.size(); i++) {
                if (listaNumerosInteiros.get(i) < menorNumero) menorNumero = listaNumerosInteiros.get(i).intValue();
            }
        }
        return menorNumero;
    }

    public List<Integer> exibirNumeros() {
        return listaNumerosInteiros;
    }

    public static void main(String[] args) {
        SomaNumeros somaNumeros = new SomaNumeros();
        somaNumeros.adicionarNumero(1);
        somaNumeros.adicionarNumero(7);
        somaNumeros.adicionarNumero(78);
        somaNumeros.adicionarNumero(22);
        somaNumeros.adicionarNumero(12);

        System.out.println(somaNumeros.calcularSoma());
        System.out.println(somaNumeros.encontrarMaiorNumero());
        System.out.println(somaNumeros.encontrarMenorNumero());
        System.out.println(somaNumeros.exibirNumeros());

    }
}
