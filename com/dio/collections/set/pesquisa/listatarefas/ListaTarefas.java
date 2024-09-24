package com.dio.collections.set.pesquisa.listatarefas;

import java.util.HashSet;
import java.util.Set;

public class ListaTarefas {

    private Set<Tarefa> tarefaSet;

    public ListaTarefas() {
        tarefaSet = new HashSet<Tarefa>();
    }

    public void adicionarTarefa(String descricao) {
        tarefaSet.add(new Tarefa(descricao, false));
    }

    public void removerTarefa(String descricao) {
        for (Tarefa t : tarefaSet) {
            if (t.getDescricao().equalsIgnoreCase(descricao)) {
                tarefaSet.remove(t);
                break;
            }
        }
    }

    public void exibirTarefas() {
        System.out.println(tarefaSet);
    }

    public int contarTarefas() {
        return tarefaSet.size();
    }

    public Set<Tarefa> obterTarefasConcluidas() {
        Set<Tarefa> tarefasSetConcluidas = new HashSet<Tarefa>();
        for (Tarefa t : tarefaSet) {
            if (t.isConcluida()) {
                tarefasSetConcluidas.add(t);
            }
        }
        return tarefasSetConcluidas;
    }

    public Set<Tarefa> obterTarefasPendentes() {
        Set<Tarefa> tarefasSetPendentes = new HashSet<Tarefa>();
        for (Tarefa t : tarefaSet) {
            if (!t.isConcluida()) {
                tarefasSetPendentes.add(t);
            }
        }
        return tarefasSetPendentes;
    }

    public void marcarTarefaConcluida(String descricao) {
        for (Tarefa t : tarefaSet) {
            if (t.getDescricao().equalsIgnoreCase(descricao)) {
                t.setConcluida(true);
            }
        }
    }

    public void marcarTarefaPendente(String descricao) {
        for (Tarefa t : tarefaSet) {
            if (t.getDescricao().equalsIgnoreCase(descricao)) {
                t.setConcluida(false);
            }
        }
    }

    public void limparListaTarefas() {
        tarefaSet.clear();
    }

    public static void main(String[] args) {

        ListaTarefas listaTarefas = new ListaTarefas();

        listaTarefas.adicionarTarefa("tarefa 1");
        listaTarefas.adicionarTarefa("tarefa 2");
        listaTarefas.adicionarTarefa("tarefa 3");
        listaTarefas.adicionarTarefa("tarefa 3");
        listaTarefas.adicionarTarefa("tarefa 4");
        listaTarefas.adicionarTarefa("tarefa 5");
        listaTarefas.exibirTarefas();
        System.out.println(listaTarefas.contarTarefas());
        listaTarefas.removerTarefa("tarefa 4");
        listaTarefas.exibirTarefas();
        System.out.println(listaTarefas.contarTarefas());
        System.out.println("Tarefas pendentes: " + listaTarefas.obterTarefasPendentes());
        System.out.println("Tarefas concluidas: " + listaTarefas.obterTarefasConcluidas());
        listaTarefas.marcarTarefaConcluida("tarefa 1");
        listaTarefas.marcarTarefaConcluida("tarefa 2");
        listaTarefas.marcarTarefaConcluida("tarefa 3");
        System.out.println("Tarefas concluidas: " + listaTarefas.obterTarefasConcluidas());
        listaTarefas.marcarTarefaPendente("tarefa 1");
        System.out.println("Tarefas pendentes: " + listaTarefas.obterTarefasPendentes());
        System.out.println("Tarefas concluidas: " + listaTarefas.obterTarefasConcluidas());
        listaTarefas.limparListaTarefas();

        listaTarefas.exibirTarefas();


    }
}
