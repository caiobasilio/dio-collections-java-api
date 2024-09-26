package com.dio.collections.map.ordenacao;

import java.time.LocalDate;
import java.time.chrono.ChronoLocalDate;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class AgendaEventos {

    private Map<LocalDate, Evento> eventosMap;

    public AgendaEventos() {
        eventosMap = new HashMap<>();
    }

    public void adicionarEvento(LocalDate data, String nome, String atracao) {
        eventosMap.put(data, new Evento(nome, atracao));
    }

    public Map<LocalDate, Evento> exibirAgenda() {
        return new TreeMap<LocalDate, Evento>(eventosMap);
    }

    public Evento obterProximoEvento() {
        Evento proximoEvento = null;
        Map<LocalDate, Evento> eventosOrdenadosMap = exibirAgenda();
        if (!eventosMap.isEmpty()) {
            LocalDate dataDeHoje = LocalDate.now();
            for (Map.Entry<LocalDate, Evento> entry : eventosOrdenadosMap.entrySet()) {
                if (entry.getKey().isEqual(dataDeHoje) || entry.getKey().isAfter(dataDeHoje)) {
                    proximoEvento = entry.getValue();
                    break;
                }
            }
        }
        return proximoEvento;
    }

    public static void main(String[] args) {
        AgendaEventos agendaEventos = new AgendaEventos();

        agendaEventos.adicionarEvento(LocalDate.MAX, "Frozen 4", "Concerto Musical 4");
        agendaEventos.adicionarEvento(LocalDate.of(2024, 9, 26), "Frozen 3", "Concerto Musical 3");
        agendaEventos.adicionarEvento(LocalDate.MIN, "Frozen", "Concerto Musical");
        agendaEventos.adicionarEvento(LocalDate.now(), "Frozen 2", "Concerto Musical 2");

        System.out.println(agendaEventos.exibirAgenda());
        System.out.println(agendaEventos.obterProximoEvento());
    }
}
