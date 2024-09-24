package com.dio.collections.map.operacoesbasicas;

import java.util.HashMap;
import java.util.Map;

public class AgendaContatos {

    private Map<String, Integer> contatosMap;

    public AgendaContatos() {
        contatosMap = new HashMap<String, Integer>();
    }

    public void adicionarContato(String nome, Integer telefone) {
        contatosMap.put(nome, telefone);
    }

    public void removerContato(String nome) {
        if (!contatosMap.isEmpty()) {
            contatosMap.remove(nome);
        }
    }

    public void exibirContatos() {
        System.out.println(contatosMap);
    }

    public Integer pesquisarPorNome(String nome) {
        if (!contatosMap.isEmpty()) {
            return contatosMap.get(nome);
        }
        return null;
    }

    public static void main(String[] args) {
        AgendaContatos agendaContatos = new AgendaContatos();
        agendaContatos.exibirContatos();
        agendaContatos.adicionarContato("Contato 1", 12345678);
        agendaContatos.adicionarContato("Contato 2", 12345679);
        agendaContatos.adicionarContato("Contato 3", 12345680);
        agendaContatos.adicionarContato("Contato 4", 12345681);
        System.out.println(agendaContatos.pesquisarPorNome("Contato 3"));
        agendaContatos.removerContato("Contato 3");
        System.out.println(agendaContatos.pesquisarPorNome("Contato 3"));
        agendaContatos.exibirContatos();
    }

}
