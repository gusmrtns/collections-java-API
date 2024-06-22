package set.Pesquisa;

import java.util.HashSet;
import java.util.Set;

public class AgendaContatos {

    private Set<Contato> contatosSet;

    public AgendaContatos() {
        this.contatosSet = new HashSet<>();
    }

    public void adicionarContato(String nome, int numero) {
        contatosSet.add(new Contato(nome, numero));
    }

    public void exibirContatos() {
        System.out.println(contatosSet);
    }

    public Set<Contato> pesquisarPorNome(String nome) {
        Set<Contato> contatos = new HashSet<>();
        for (Contato contato : contatosSet) {
            if (contato.getNome().startsWith(nome)) {
                contatos.add(contato);
            }
        }
        return contatos;
    }

    public Contato atualizarNumeroContato(String nome, int numero) {
        Contato contatoAtualizado = null;
        for (Contato contato : contatosSet) {
            if (contato.getNome().equalsIgnoreCase(nome)) {
                contato.setNumero(numero);
                contatoAtualizado = contato;
            }
        }
        return contatoAtualizado;
    }

    public static void main(String[] args) {
        AgendaContatos agenda = new AgendaContatos();
        agenda.adicionarContato("João", 123456789);
        agenda.adicionarContato("Maria", 987654321);
        agenda.adicionarContato("João", 123456);
        agenda.adicionarContato("José", 456789123);
        agenda.adicionarContato("João Paulo", 12345634);
        agenda.adicionarContato("Ana", 654321987);
        agenda.exibirContatos();
        System.out.println(agenda.pesquisarPorNome("Jo"));
        System.out.println(agenda.atualizarNumeroContato("Maria", 111111111));
        agenda.exibirContatos();
    }

}
