package com.dio.collections.set.ordenacao.gerenciadoralunos;

import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class GerenciadorAlunos {

    private Set<Aluno> alunosSet;

    public GerenciadorAlunos() {
        alunosSet = new HashSet<Aluno>();
    }

    public void adicionarAluno(String nome, long matricula, double media) {
        alunosSet.add(new Aluno(nome, matricula, media));
    }

    public void removerAluno(long matricula) {
        alunosSet.remove(pesquisarAlunoPorMatricula(matricula));
    }

    public Set<Aluno> exibirAlunosPorNome() {
        return new TreeSet<Aluno>(alunosSet);
    }

    public Set<Aluno> exibirAlunosPorNota() {
        Set<Aluno> alunosPorNota = new TreeSet<>(new ComparatorAlunoPorNota());
        alunosPorNota.addAll(alunosSet);
        return alunosPorNota;
    }

    public Set<Aluno> exibirAlunos() {
        return alunosSet;
    }

    private Aluno pesquisarAlunoPorMatricula(long matricula) {
        for (Aluno a : alunosSet) {
            if(a.getMatricula() == matricula) {
                return a;
            }
        }
        return null;
    }

    public static void main(String[] args) {
        GerenciadorAlunos gerenciadorAlunos = new GerenciadorAlunos();
        gerenciadorAlunos.adicionarAluno("Aluno 1", 12345, 7.5);
        gerenciadorAlunos.adicionarAluno("Aluno 2", 12346, 7.9);
        gerenciadorAlunos.adicionarAluno("Aluno 5", 12347, 6.9);
        gerenciadorAlunos.adicionarAluno("Aluno 3", 12349, 7.3);
        gerenciadorAlunos.adicionarAluno("Aluno 13", 12350, 8.9);

        System.out.println(gerenciadorAlunos.exibirAlunos());
        System.out.println(gerenciadorAlunos.exibirAlunosPorNome());
        System.out.println(gerenciadorAlunos.exibirAlunosPorNota());

        gerenciadorAlunos.removerAluno(12347);

        System.out.println(gerenciadorAlunos.exibirAlunos());
        
    }
}
