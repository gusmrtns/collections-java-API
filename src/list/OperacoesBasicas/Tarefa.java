package list.OperacoesBasicas;

public class Tarefa {
    //atributos

    private String descricao;


    //construtor
    public Tarefa(String descricao){
        this.descricao = descricao;
    }

    //metodos

    public String getDescricao(){
        return descricao;
    }

    @Override
    public String toString() {
        return "Tarefa{" +
                "descricao='" + descricao + '\'' +
                '}';
    }
}
