package map.Ordenacao;

import java.time.LocalDate;
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

    public void exibirEventos() {
        Map<LocalDate, Evento> eventosOrdenados = new TreeMap<>(eventosMap);
        for(Map.Entry<LocalDate, Evento> entry : eventosOrdenados.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }
    }

    public void obterProximoEvento() {
        LocalDate dataAtual = LocalDate.now();
        LocalDate proximaData = null;
        Evento proximoEvento = null;
        Map<LocalDate, Evento> eventosOrdenados = new TreeMap<>(eventosMap);
        for(Map.Entry<LocalDate, Evento> entry : eventosOrdenados.entrySet()) {
            if(entry.getKey().isEqual(dataAtual) || entry.getKey().isAfter(dataAtual)) {
                proximaData = entry.getKey();
                proximoEvento = entry.getValue();
                System.out.println("Próximo evento: " + proximaData + " - " + proximoEvento);
                break;
            }
        }
    }

    public static void main(String[] args) {
        AgendaEventos agenda = new AgendaEventos();
        agenda.adicionarEvento(LocalDate.of(2020, 10, 10), "Evento 1", "Atração 1");
        agenda.adicionarEvento(LocalDate.of(2023, 10, 15), "Evento 2", "Atração 2");
        agenda.adicionarEvento(LocalDate.of(2024, 10, 20), "Evento 3", "Atração 3");
        agenda.adicionarEvento(LocalDate.of(2025, 10, 25), "Evento 4", "Atração 4");
        agenda.exibirEventos();
        agenda.obterProximoEvento();
    }
}
