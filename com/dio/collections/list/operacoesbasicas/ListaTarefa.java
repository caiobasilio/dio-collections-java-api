package com.dio.collections.list.operacoesbasicas;

import java.util.ArrayList;
import java.util.List;

public class ListaTarefa {

    private List<Tarefa> tarefaList;

    public ListaTarefa() {
        this.tarefaList = new ArrayList<>();
    }

    public void adicionarTarefa(String descricao) {
        tarefaList.add(new Tarefa(descricao));
    }

    public void removerTarefa (String descricao) {
        List<Tarefa> tarefasParaRemover = new ArrayList<>();
        for (Tarefa t : tarefaList) {
            if (t.getDescricao().equalsIgnoreCase(descricao)) {
                tarefasParaRemover.add(t);
            }
        }
        tarefaList.removeAll(tarefasParaRemover);
    }

    public int obterNumeroTotalTarefas() {
        return tarefaList.size();
    }

    public List<String> obterDescricoesTarefas() {
        List<String> descricoesDaListaDeTarefas = new ArrayList<String>();
        if (!tarefaList.isEmpty()) {
            for (Tarefa t : tarefaList) {
                descricoesDaListaDeTarefas.add(t.getDescricao());
            }
        }
        return descricoesDaListaDeTarefas;
    }

    public static void main(String[] args) {
        ListaTarefa listaTarefa = new ListaTarefa();

        System.out.println("O número total de tarefas é: " + listaTarefa.obterNumeroTotalTarefas());


        listaTarefa.adicionarTarefa("Tarefa 1");
        listaTarefa.adicionarTarefa("Tarefa 2");
        listaTarefa.adicionarTarefa("Tarefa 3");
        System.out.println("O número total de tarefas é: " + listaTarefa.obterDescricoesTarefas());;

        System.out.println("O número total de tarefas é: " + listaTarefa.obterNumeroTotalTarefas());
        listaTarefa.removerTarefa("Tarefa 1");
        System.out.println("O número total de tarefas é: " + listaTarefa.obterDescricoesTarefas());;

        System.out.println("O número total de tarefas é: " + listaTarefa.obterNumeroTotalTarefas());



    }
}
