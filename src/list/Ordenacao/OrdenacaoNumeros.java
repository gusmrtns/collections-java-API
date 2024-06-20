package list.Ordenacao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoNumeros {

    private List<Integer> numerosList;

    public OrdenacaoNumeros() {
        this.numerosList = new ArrayList<>();
    }

    public void addNumero(int numero) {
        this.numerosList.add(numero);
    }

    public List<Integer> ordenarCrescente() {
        List<Integer> numerosOrdenados = new ArrayList<>(numerosList);
        if(numerosOrdenados.isEmpty()){
            return null;
        } else {
            Collections.sort(numerosOrdenados);
            return numerosOrdenados;
        }
    }

public List<Integer> ordenarDecrescente() {
        List<Integer> numerosOrdenados = new ArrayList<>(numerosList);
        if(numerosOrdenados.isEmpty()){
            return null;
        } else {
            numerosOrdenados.sort(Collections.reverseOrder());
            return numerosOrdenados;
        }
    }

    public static void main(String[] args) {
        OrdenacaoNumeros ordenacaoNumeros = new OrdenacaoNumeros();
        ordenacaoNumeros.addNumero(5);
        ordenacaoNumeros.addNumero(3);
        ordenacaoNumeros.addNumero(1);
        ordenacaoNumeros.addNumero(4);

        System.out.println("Ordenado crescente:");
        ordenacaoNumeros.ordenarCrescente().forEach(System.out::println);

        System.out.println("\nOrdenado decrescente:");
        ordenacaoNumeros.ordenarDecrescente().forEach(System.out::println);
    }   










}
