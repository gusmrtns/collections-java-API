package map.OperacoesBasicas;

import java.util.Map;

public class AgendaContatos {

    private Map<String, Integer> agendaContatosMap;

    public AgendaContatos(){
        this.agendaContatosMap = new java.util.HashMap<>();
    }

    public void adicionarContato(String nome, Integer telefone){
        this.agendaContatosMap.put(nome, telefone);
    }

    public void removerContato(String nome){
        if(!agendaContatosMap.isEmpty()){
            this.agendaContatosMap.remove(nome);
        }
    }

    public void exibirContatos(){
        System.out.println(agendaContatosMap);
    }

    public Integer buscarPorNome(String nome) {
        return agendaContatosMap.isEmpty() ? null : agendaContatosMap.get(nome);
    }

    public static void main(String[] args) {
        AgendaContatos agenda = new AgendaContatos();
        agenda.adicionarContato("João", 123456789);
        agenda.adicionarContato("Maria", 987654321);
        agenda.adicionarContato("José", 456789123);
        agenda.exibirContatos();
        agenda.removerContato("Maria");
        agenda.exibirContatos();
        System.out.println(agenda.buscarPorNome("João"));
    }

}
