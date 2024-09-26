package com.dio.collections.map.ordenacao;

public class Evento {

    private String nomeDoEvento;
    private String nomeDaAtracao;

    public Evento(String nomeDoEvento, String nomeDaAtracao) {
        this.nomeDoEvento = nomeDoEvento;
        this.nomeDaAtracao = nomeDaAtracao;
    }

    public String getNomeDoEvento() {
        return nomeDoEvento;
    }

    public String getNomeDaAtracao() {
        return nomeDaAtracao;
    }

    @Override
    public String toString() {
        return "Evento{" +
                "nomeDoEvento='" + nomeDoEvento + '\'' +
                ", nomeDaAtracao='" + nomeDaAtracao + '\'' +
                '}';
    }
}
