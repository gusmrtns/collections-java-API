package set.Pesquisa;

import java.util.Objects;

public class Tarefa {

    private String descricao;
    private boolean finalizada;

    public Tarefa(String descricao) {
        this.descricao = descricao;
        this.finalizada = false;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public boolean isFinalizada() {
        return finalizada;
    }

    public void finalizar() {
        this.finalizada = true;
    }

    public void tornarPendente() {
        this.finalizada = false;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Tarefa tarefa = (Tarefa) o;
        return Objects.equals(getDescricao(), tarefa.getDescricao());
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(getDescricao());
    }

    @Override
    public String toString() {
        if(this.finalizada) {
            return "[X] " + this.descricao;
        } else {
            return "[] " + this.descricao;
        }
    }
}
