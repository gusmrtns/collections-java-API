package list.OperacoesBasicas;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;
public class ListaTarefas {
    //atributos
    private List<Tarefa> tarefaList;

    //construtor
    public ListaTarefas(){
        this.tarefaList = new ArrayList<>();
    }

    //metodos

    // Adiciona uma tarefa na lista de tarefas com a descrição fornecida
    public void adicionarTarefa(String descricao){
        tarefaList.add(new Tarefa(descricao));
    }

    // remove uma tarefa da lista de tarefas com a descrição fornecida
    public void removerTarefa(String descricao){
        //metodo alternativo da instrutora
        List<Tarefa> tarefasARemover = new ArrayList<>();
        for(Tarefa tarefa : tarefaList){
            if(tarefa.getDescricao().equals(descricao)){
                tarefasARemover.add(tarefa);
            }
        }
        tarefaList.removeAll(tarefasARemover);
    }

    // obter numero total de tarefas
    public int obterNumeroTotalDeTarefas(){
        return tarefaList.size();
    }

    // retorna uma lista contendo a descrição de todas as terefas na lista
    public void obterDescricoesTarefas(){
        System.out.println(tarefaList);
    }

    public static void main(String[] args) {

        ListaTarefas listaTarefas = new ListaTarefas();
        System.out.println("Numero total de tarefas: " + listaTarefas.obterNumeroTotalDeTarefas());

        listaTarefas.adicionarTarefa("Estudar Java");
        listaTarefas.adicionarTarefa("Estudar Python");
        listaTarefas.adicionarTarefa("Estudar Java");

        System.out.println("Numero total de tarefas: " + listaTarefas.obterNumeroTotalDeTarefas());

        listaTarefas.removerTarefa("Estudar Python");
        System.out.println("Numero total de tarefas: " + listaTarefas.obterNumeroTotalDeTarefas());

        listaTarefas.obterDescricoesTarefas();
    }

}
