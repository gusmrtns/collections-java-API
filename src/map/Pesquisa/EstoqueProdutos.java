package map.Pesquisa;

import java.util.HashMap;
import java.util.Map;

public class EstoqueProdutos {

    private Map<Long, Produto> estoqueProdutos;

    public EstoqueProdutos() {
        this.estoqueProdutos = new HashMap<>();
    }

    public void adicionarProduto(Long codigo, String nome, double preco, int quantidade) {
        Produto produto = new Produto(nome, preco, quantidade);
        estoqueProdutos.put(codigo, produto);
    }

    public void exibirProdutos(){
        System.out.println(estoqueProdutos);
    }

    public double calculaValorTotal(){
        double valorTotal = 0;
        if(!estoqueProdutos.isEmpty()){
            for (Produto produto : estoqueProdutos.values()) {
                valorTotal += produto.getPreco() * produto.getQuantidade();
            }
        }
        return valorTotal;
    }

    public Produto obterProdutoMaisCaro(){
        Produto produtoMaisCaro = null;
        double preco = Double.MIN_VALUE;
        if(!estoqueProdutos.isEmpty()){
            for (Produto produto : estoqueProdutos.values()) {
                if(produto.getPreco() > preco){
                    preco = produto.getPreco();
                    produtoMaisCaro = produto;
                }
            }
        }
        return produtoMaisCaro;
    }

    public Produto obterProdutoMaisBarato(){
        Produto produtoMaisBarato = null;
        double preco = Double.MAX_VALUE;
        if(!estoqueProdutos.isEmpty()){
            for (Produto produto : estoqueProdutos.values()) {
                if(produto.getPreco() < preco){
                    preco = produto.getPreco();
                    produtoMaisBarato = produto;
                }
            }
        }
        return produtoMaisBarato;
    }

    public Produto obterProdutoMaiorQuantidadeValorTotalNoEstoque(){
        Produto produtoMaiorQuantidadeValorTotalNoEstoque = null;
        double quantidade = Integer.MIN_VALUE;
        if(!estoqueProdutos.isEmpty()){
            for (Produto produto : estoqueProdutos.values()) {
                if(produto.getQuantidade() * produto.getPreco() > quantidade){
                    quantidade = produto.getQuantidade() * produto.getPreco();
                    produtoMaiorQuantidadeValorTotalNoEstoque = produto;
                }
            }
        }
        return produtoMaiorQuantidadeValorTotalNoEstoque;
    }

    public static void main(String[] args) {
        EstoqueProdutos estoqueProdutos = new EstoqueProdutos();
        estoqueProdutos.adicionarProduto(1L, "Arroz", 10.0, 10);
        estoqueProdutos.adicionarProduto(2L, "Feijão", 5.0, 20);
        estoqueProdutos.adicionarProduto(3L, "Macarrão", 4.0, 30);
        estoqueProdutos.adicionarProduto(4L, "Óleo", 7.0, 40);
        estoqueProdutos.adicionarProduto(5L, "Sal", 2.0, 50);
        estoqueProdutos.exibirProdutos();
        System.out.println("Valor total: " + estoqueProdutos.calculaValorTotal());
        System.out.println("Produto mais caro: " + estoqueProdutos.obterProdutoMaisCaro());
        System.out.println("Produto mais barato: " + estoqueProdutos.obterProdutoMaisBarato());
        System.out.println("Produto com maior quantidade e valor total no estoque: " + estoqueProdutos.obterProdutoMaiorQuantidadeValorTotalNoEstoque());
    }

}
