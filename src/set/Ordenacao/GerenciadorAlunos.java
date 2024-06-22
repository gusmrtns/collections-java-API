package set.Ordenacao;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class GerenciadorAlunos {

    private Set<Aluno> alunosSet;

    public GerenciadorAlunos() {
        this.alunosSet = new HashSet<>();
    }

    public void adicionarAluno(String nome, long matricula, double nota) {
        this.alunosSet.add(new Aluno(nome, matricula, nota));
    }

    public void removerAluno(long matricula) {
        this.alunosSet.removeIf(aluno -> aluno.getMatricula() == matricula);
    }

    public Set<Aluno> exibirAlunosPorNome() {
        Set<Aluno> alunosOrdenadosPorNome = new TreeSet<>(alunosSet);
        return alunosOrdenadosPorNome;
    }

    public Set<Aluno> exibirAlunosPorNota() {
        Set<Aluno> alunosOrdenadosPorNota = new TreeSet<>(new comparatorPorNota());
        alunosOrdenadosPorNota.addAll(alunosSet);
        return alunosOrdenadosPorNota;
    }

    public Set<Aluno> exibirAlunosPorMatricula() {
        Set<Aluno> alunosOrdenadosPorMatricula = new TreeSet<>(new comparatorPorMatricula());
        alunosOrdenadosPorMatricula.addAll(alunosSet);
        return alunosOrdenadosPorMatricula;
    }

    public void exibirAlunos() {
        System.out.println(alunosSet);
    }

    public static void main(String[] args) {
        GerenciadorAlunos gerenciadorAlunos = new GerenciadorAlunos();
        gerenciadorAlunos.adicionarAluno("João", 1L, 8.0);
        gerenciadorAlunos.adicionarAluno("Maria", 2L, 9.0);
        gerenciadorAlunos.adicionarAluno("José", 3L, 7.0);
        gerenciadorAlunos.adicionarAluno("Ana", 4L, 10.0);
        gerenciadorAlunos.adicionarAluno("Carlos", 5L, 6.0);

        System.out.println("Alunos ordenados por nome:");
        for (Aluno aluno : gerenciadorAlunos.exibirAlunosPorNome()) {
            System.out.println(aluno);
        }

        System.out.println("\nAlunos ordenados por nota:");
        for (Aluno aluno : gerenciadorAlunos.exibirAlunosPorNota()) {
            System.out.println(aluno);
        }

        System.out.println("\nAlunos ordenados por matrícula:");
        for (Aluno aluno : gerenciadorAlunos.exibirAlunosPorMatricula()) {
            System.out.println(aluno);
        }
    }
}
