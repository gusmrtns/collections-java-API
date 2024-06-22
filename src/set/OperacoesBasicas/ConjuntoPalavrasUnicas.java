package set.OperacoesBasicas;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class ConjuntoPalavrasUnicas {

    private Set<String> palavrasUnicasSet;

    public ConjuntoPalavrasUnicas() {
        this.palavrasUnicasSet = new HashSet<>();
    }

    public void adicionarPalavra(String palavra) {
        palavrasUnicasSet.add(palavra);
    }

    public void removerPalavra(String palavra) {
        palavrasUnicasSet.remove(palavra);
    }

    public boolean verificarPalavra(String palavra) {
        return palavrasUnicasSet.contains(palavra);
    }

    public void exibirPalavrasUnicas() {
        System.out.println(palavrasUnicasSet);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ConjuntoPalavrasUnicas that = (ConjuntoPalavrasUnicas) o;
        return Objects.equals(palavrasUnicasSet, that.palavrasUnicasSet);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(palavrasUnicasSet);
    }

    public static void main(String[] args) {
        ConjuntoPalavrasUnicas conjuntoPalavrasUnicas = new ConjuntoPalavrasUnicas();
        conjuntoPalavrasUnicas.adicionarPalavra("Java");
        conjuntoPalavrasUnicas.adicionarPalavra("Python");
        conjuntoPalavrasUnicas.adicionarPalavra("Java");
        conjuntoPalavrasUnicas.adicionarPalavra("C++");
        conjuntoPalavrasUnicas.adicionarPalavra("Python");

        conjuntoPalavrasUnicas.exibirPalavrasUnicas();

        System.out.println(conjuntoPalavrasUnicas.verificarPalavra("Java"));
        System.out.println(conjuntoPalavrasUnicas.verificarPalavra("C#"));

        conjuntoPalavrasUnicas.removerPalavra("Java");

        conjuntoPalavrasUnicas.exibirPalavrasUnicas();
    }
}
