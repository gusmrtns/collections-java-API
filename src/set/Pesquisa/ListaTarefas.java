package set.Pesquisa;

import java.util.HashSet;
import java.util.Set;

public class ListaTarefas {

    private Set<Tarefa> tarefasSet;

    public ListaTarefas() {
        this.tarefasSet = new HashSet<>();
    }

    public void adicionarTarefa(String descricao) {
        this.tarefasSet.add(new Tarefa(descricao));
    }

    public void removerTarefa(String descricao){
        for(Tarefa tarefa : this.tarefasSet) {
            if(tarefa.getDescricao().equals(descricao)) {
                this.tarefasSet.remove(tarefa);
                break;
            }
        }
    }

    public void exibirTarefas() {
        System.out.println(tarefasSet);
    }

    public int contarTarefas() {
        return this.tarefasSet.size();
    }

    public Set<Tarefa> obterTarefasConcluidas() {
        Set<Tarefa> tarefasConcluidas = new HashSet<>();
        for(Tarefa tarefa : this.tarefasSet) {
            if(tarefa.isFinalizada()) {
                tarefasConcluidas.add(tarefa);
            }
        }
        return tarefasConcluidas;
    }

    public Set<Tarefa> obterTarefasPendentes() {
        Set<Tarefa> tarefasPendentes = new HashSet<>();
        for(Tarefa tarefa : this.tarefasSet) {
            if(!tarefa.isFinalizada()) {
                tarefasPendentes.add(tarefa);
            }
        }
        return tarefasPendentes;
    }

    public void marcarTarefaComoConcluida(String descricao) {
        for(Tarefa tarefa : this.tarefasSet) {
            if(tarefa.getDescricao().equals(descricao) && !tarefa.isFinalizada()) {
                tarefa.finalizar();
                break;
            }
            }

    }

    public void marcarTarefaComoPendente(String descricao) {
        for(Tarefa tarefa : this.tarefasSet) {
            if(tarefa.getDescricao().equals(descricao) && tarefa.isFinalizada()) {
                tarefa.tornarPendente();
                break;
            }
        }
    }

    public void limparListaTarefas() {
        this.tarefasSet.clear();
    }

    public static void main(String[] args) {
        ListaTarefas listaTarefas = new ListaTarefas();

        listaTarefas.adicionarTarefa("Estudar Java");
        listaTarefas.adicionarTarefa("Estudar Python");
        listaTarefas.adicionarTarefa("Estudar JavaScript");
        listaTarefas.adicionarTarefa("Estudar HTML");
        listaTarefas.adicionarTarefa("Estudar C++");

        listaTarefas.exibirTarefas();
        System.out.println("Total de tarefas: " + listaTarefas.contarTarefas());

        listaTarefas.marcarTarefaComoConcluida("Estudar Java");
        listaTarefas.marcarTarefaComoConcluida("Estudar C++");
        listaTarefas.removerTarefa("Estudar JavaScript");

        listaTarefas.exibirTarefas();
        System.out.println("Total de tarefas: " + listaTarefas.contarTarefas());

        System.out.println("Tarefas concluídas: " + listaTarefas.obterTarefasConcluidas());
        System.out.println("Tarefas pendentes: " + listaTarefas.obterTarefasPendentes());

        listaTarefas.marcarTarefaComoPendente("Estudar C++");
        listaTarefas.marcarTarefaComoConcluida("Estudar Python");

        listaTarefas.exibirTarefas();
        listaTarefas.limparListaTarefas();
        listaTarefas.exibirTarefas();

    }


}
