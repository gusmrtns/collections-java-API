package list.Pesquisa;

import java.util.ArrayList;
import java.util.List;

public class SomaNumeros {

    private List<Integer> numerosList;

    public SomaNumeros() {
        this.numerosList = new ArrayList<>();
    }

    public void addNumero(int numero) {
        this.numerosList.add(numero);
    }

    public int soma() {
        int soma = 0;
        for (int numero : this.numerosList) {
            soma += numero;
        }
        return soma;
    }

    public int encontrarMaiorNumero() {
        int maiorNumero = this.numerosList.getFirst();
        for (int numero : this.numerosList) {
            if (numero > maiorNumero) {
                maiorNumero = numero;
            }
        }
        return maiorNumero;
    }

    public int encontrarMenorNumero() {
        int menorNumero = this.numerosList.getFirst();
        for (int numero : this.numerosList) {
            if (numero < menorNumero) {
                menorNumero = numero;
            }
        }
        return menorNumero;
    }

    public void exibirNumeros() {
        System.out.print("[ ");
        for (int numero : this.numerosList) {
            System.out.print(numero);
            System.out.print(" ");
        }
        System.out.println("]");
    }

    public static void main(String[] args) {
        SomaNumeros somaNumeros = new SomaNumeros();
        somaNumeros.addNumero(1);
        somaNumeros.addNumero(2);
        somaNumeros.addNumero(3);
        somaNumeros.addNumero(4);
        somaNumeros.addNumero(5);
        somaNumeros.addNumero(6);
        somaNumeros.addNumero(7);
        somaNumeros.addNumero(8);
        somaNumeros.addNumero(9);
        somaNumeros.addNumero(10);
        System.out.println(somaNumeros.soma());
        System.out.println(somaNumeros.encontrarMaiorNumero());
        System.out.println(somaNumeros.encontrarMenorNumero());
        somaNumeros.exibirNumeros();
    }
}
