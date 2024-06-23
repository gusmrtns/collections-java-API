package map.OperacoesBasicas;

import java.util.HashMap;
import java.util.Map;

public class Dicionario {

    private Map<String, String> dicionarioMap;

    public Dicionario(){
        this.dicionarioMap = new HashMap<>();
    }

    public void adicionarPalavra(String palavra, String significado){
        this.dicionarioMap.put(palavra, significado);
    }

    public void removerPalavra(String palavra){
        if(!dicionarioMap.isEmpty()){
            this.dicionarioMap.remove(palavra);
        }
    }

    public void exibirPalavras(){
        System.out.println(dicionarioMap);
    }

    public String buscarPorPalavra(String palavra) {
        return dicionarioMap.isEmpty() ? null : dicionarioMap.get(palavra);
    }

    public static void main(String[] args) {
        Dicionario dicionario = new Dicionario();
        dicionario.adicionarPalavra("Casa", "Lugar onde se mora");
        dicionario.adicionarPalavra("Carro", "Meio de transporte");
        dicionario.adicionarPalavra("Bola", "Objeto redondo");
        dicionario.exibirPalavras();
        dicionario.removerPalavra("Carro");
        dicionario.exibirPalavras();
        System.out.println(dicionario.buscarPorPalavra("Casa"));
    }
}
