package map.Ordenacao;

import java.util.*;

public class LivrariaOnline {

    private Map<String, Livro> livrosMap;

    public LivrariaOnline() {
        livrosMap = new HashMap<>();
    }

    public void adicionarLivro(String isbn, String titulo, String autor, double preco) {
        livrosMap.put(isbn, new Livro(titulo, autor, preco));
    }

    public void removerLivro(String titulo) {
        for(Map.Entry<String, Livro> entry : livrosMap.entrySet()) {
            if(entry.getValue().getTitulo().equals(titulo)) {
                livrosMap.remove(entry.getKey());
                break;
            }
        }
    }

    public Map<String, Livro> exibirLivrosOrdenadosPorPreco() {
        List<Map.Entry<String, Livro>> livrosParaOrdenarPorPreco = new ArrayList<>(livrosMap.entrySet());

        livrosParaOrdenarPorPreco.sort(new ComparatorPorPreco());

        Map<String, Livro> livrosOrdenadosPorPreco = new LinkedHashMap<>();

        for (Map.Entry<String, Livro> entry : livrosParaOrdenarPorPreco) {
            livrosOrdenadosPorPreco.put(entry.getKey(), entry.getValue());
        }

        return livrosOrdenadosPorPreco;
    }

    public Map<String, Livro> pesquisarLivrosPorAutor(String autor) {
        Map<String, Livro> livrosPorAutor = new HashMap<>();
        for(Map.Entry<String, Livro> entry : livrosMap.entrySet()) {
            if(entry.getValue().getAutor().equals(autor)) {
                livrosPorAutor.put(entry.getKey(), entry.getValue());
            }
        }
        return livrosPorAutor;
    }

    public Livro obterLivroMaisCaro() {
        List<Map.Entry<String, Livro>> livrosParaOrdenarPorPreco = new ArrayList<>(livrosMap.entrySet());
        livrosParaOrdenarPorPreco.sort(new ComparatorPorPreco());
        return livrosParaOrdenarPorPreco.getLast().getValue();
    }

    public Livro obterLivroMaisBarato() {
        List<Map.Entry<String, Livro>> livrosParaOrdenarPorPreco = new ArrayList<>(livrosMap.entrySet());
        livrosParaOrdenarPorPreco.sort(new ComparatorPorPreco());
        return livrosParaOrdenarPorPreco.getFirst().getValue();
    }

    public static void main(String[] args) {
        LivrariaOnline livraria = new LivrariaOnline();
        livraria.adicionarLivro("123", "Livro 1", "Autor 1", 100.0);
        livraria.adicionarLivro("456", "Livro 2", "Autor 2", 50.0);
        livraria.adicionarLivro("789", "Livro 3", "Autor 1", 200.0);
        livraria.adicionarLivro("101", "Livro 4", "Autor 3", 150.0);
        livraria.adicionarLivro("112", "Livro 5", "Autor 2", 75.0);

        System.out.println("Livros ordenados por preço:");
        for (Map.Entry<String, Livro> entry : livraria.exibirLivrosOrdenadosPorPreco().entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }

        System.out.println("\nLivros do autor Autor 1:");
        for (Map.Entry<String, Livro> entry : livraria.pesquisarLivrosPorAutor("Autor 1").entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }

        System.out.println("\nLivro mais caro:");
        System.out.println(livraria.obterLivroMaisCaro());

        System.out.println("\nLivro mais barato:");
        System.out.println(livraria.obterLivroMaisBarato());
    }


}
