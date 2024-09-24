package com.dio.collections.set.pesquisa;

import java.util.HashSet;
import java.util.Set;

public class AgendaContatos {

    Set<Contato> conjuntoContatos;

    public AgendaContatos() {
        conjuntoContatos = new HashSet<Contato>();
    }

    public void adicionarContato(String nome, int numero) {
        conjuntoContatos.add(new Contato(nome, numero));
    }

    public void exibirContatos() {
        System.out.println(conjuntoContatos);
    }

    public Set<Contato> pesquisarPorNome(String nome) {
        Set<Contato> conjuntoContatosPorNome = new HashSet<Contato>();
        for (Contato c : conjuntoContatos) {
            if (c.getNome().startsWith(nome)) {
                conjuntoContatosPorNome.add(c);
            }
        }
        return conjuntoContatosPorNome;
    }

    public Contato atualizarNumeroContato(String nome, int novoNumero) {
        for (Contato c : conjuntoContatos) {
            if (c.getNome().equalsIgnoreCase(nome)) {
                c.setNumeroTelefone(novoNumero);
                return c;
            }
        }
        return null;
    }

    public static void main(String[] args) {
        AgendaContatos agendaContatos = new AgendaContatos();

        agendaContatos.exibirContatos();
        agendaContatos.adicionarContato("Caio Basilio", 123123123);
        agendaContatos.adicionarContato("Caio Arthur", 123123333);
        agendaContatos.adicionarContato("Caio Moraes", 123123373);
        agendaContatos.adicionarContato("Kyle Basilio", 123123379);
        agendaContatos.exibirContatos();
        System.out.println(agendaContatos.pesquisarPorNome("Caio"));
        System.out.println(agendaContatos.pesquisarPorNome("Kyle"));
        agendaContatos.atualizarNumeroContato("Caio Basilio", 456456456);
        agendaContatos.exibirContatos();

    }
}
