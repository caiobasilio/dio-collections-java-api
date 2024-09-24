package com.dio.collections.set.operacoesbasicas;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoConvidados {

    private Set<Convidado> convidadosSet;

    public ConjuntoConvidados() {
        convidadosSet = new HashSet<Convidado>();
    }

    public void adicionarConvidado(String nome, int codigoConvite) {
        convidadosSet.add(new Convidado(nome, codigoConvite));
    }

    public void removerConvidadoPorCodigoConvite(int codigoConvite) {
        convidadosSet.remove(pesquisarConvidadoPorCodigoConvite(codigoConvite));
    }

    public int contarConvidados() {
        return convidadosSet.size();
    }

    public void exibirConvidados() {
        System.out.println(convidadosSet);
    }

    private Convidado pesquisarConvidadoPorCodigoConvite (int codigoConvite) {
        for (Convidado c : convidadosSet) {
            if (c.getCodigoConvite() == codigoConvite) {
                return c;
            }
        }
        return null;
    }

    public static void main(String[] args) {
        ConjuntoConvidados conjuntoConvidados = new ConjuntoConvidados();

        System.out.println(conjuntoConvidados.contarConvidados());
        conjuntoConvidados.adicionarConvidado("Caio", 001);
        conjuntoConvidados.adicionarConvidado("Carlos", 002);
        conjuntoConvidados.adicionarConvidado("John", 002);
        conjuntoConvidados.adicionarConvidado("Mathew", 003);
        conjuntoConvidados.exibirConvidados();
        System.out.println(conjuntoConvidados.contarConvidados());
        conjuntoConvidados.removerConvidadoPorCodigoConvite(001);
        System.out.println(conjuntoConvidados.contarConvidados());

        conjuntoConvidados.exibirConvidados();

    }
}
