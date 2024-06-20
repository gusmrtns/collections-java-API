package list.OperacoesBasicas;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {

    private List<Item> itensList;

    public CarrinhoDeCompras() {
        this.itensList = new ArrayList<>();
    }


    public void adicionarItem(String nome, double preco, int quantidade) {
        itensList.add(new Item(nome, preco, quantidade));
    }

    public void removerItem(String nome) {
        List<Item> itensARemover = new ArrayList<>();
        for(Item item : itensList) {
            if(item.getNome().equals(nome)) {
                itensARemover.add(item);
            }
        }
        itensList.removeAll(itensARemover);
    }

    public double obterValorTotal() {
        double valorTotal = 0;
        for(Item item : itensList) {
            valorTotal += item.getPreco() * item.getQuantidade();
        }
        return valorTotal;
    }

    public void exibirItens() {
        System.out.println(itensList);
    }

    public static void main(String[] args) {

            CarrinhoDeCompras carrinhoDeCompras = new CarrinhoDeCompras();
            carrinhoDeCompras.adicionarItem("Arroz", 10.0, 2);
            carrinhoDeCompras.adicionarItem("Feijão", 5.0, 1);
            carrinhoDeCompras.adicionarItem("Macarrão", 7.0, 3);

            carrinhoDeCompras.exibirItens();
            System.out.println("Valor total: " + carrinhoDeCompras.obterValorTotal());

            carrinhoDeCompras.removerItem("Feijão");
            carrinhoDeCompras.exibirItens();
            System.out.println("Valor total: " + carrinhoDeCompras.obterValorTotal());
    }
}
