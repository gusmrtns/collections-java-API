package set.Ordenacao;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class CadastroProduto {

    private Set<Produto> produtosSet;

    public CadastroProduto() {
        this.produtosSet = new HashSet<>();
    }

    public void adicionarProduto(long codigo, String nome, double preco, int quantidade) {
        this.produtosSet.add(new Produto(codigo, nome, preco, quantidade));
    }

    public Set<Produto> exibirProdutosPorNome() {
        Set<Produto> produtosOrdenadosPorNome = new TreeSet<>(produtosSet);
        return produtosOrdenadosPorNome;
    }

    public Set<Produto> exibirProdutosPorPreco() {
        Set<Produto> produtosOrdenadosPorPreco = new TreeSet<>(new comparatorPorPreco());
        produtosOrdenadosPorPreco.addAll(produtosSet);
        return produtosOrdenadosPorPreco;
    }

    public Set<Produto> exibirProdutosPorQuantidade() {
        Set<Produto> produtosOrdenadosPorQuantidade = new TreeSet<>(new comparatorPorQuantidade());
        produtosOrdenadosPorQuantidade.addAll(produtosSet);
        return produtosOrdenadosPorQuantidade;
    }

    public Set<Produto> exibirProdutosPorCodigo() {
        Set<Produto> produtosOrdenadosPorCodigo = new TreeSet<>(new comparatorPorCodigo());
        produtosOrdenadosPorCodigo.addAll(produtosSet);
        return produtosOrdenadosPorCodigo;
    }

    public static void main(String[] args) {
        CadastroProduto cadastroProduto = new CadastroProduto();
        cadastroProduto.adicionarProduto(1L, "Creme de leite", 10.0, 5);
        cadastroProduto.adicionarProduto(2L, "Leite", 5.0, 10);
        cadastroProduto.adicionarProduto(1L, "Manteiga", 7.0, 3);
        cadastroProduto.adicionarProduto(3L, "Queijo", 15.0, 2);
        cadastroProduto.adicionarProduto(6L, "Iogurte", 3.0, 7);



        System.out.println("Produtos ordenados por nome:");
        for (Produto produto : cadastroProduto.exibirProdutosPorNome()) {
            System.out.println(produto);
        }

        System.out.println("\nProdutos ordenados por preço:");
        for (Produto produto : cadastroProduto.exibirProdutosPorPreco()) {
            System.out.println(produto);
        }

        System.out.println("\nProdutos ordenados por quantidade:");
        for (Produto produto : cadastroProduto.exibirProdutosPorQuantidade()) {
            System.out.println(produto);
        }

        System.out.println("\nProdutos ordenados por código:");
        for (Produto produto : cadastroProduto.exibirProdutosPorCodigo()) {
            System.out.println(produto);
        }
    }

}
