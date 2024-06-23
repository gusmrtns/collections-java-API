package map.Pesquisa;

import java.util.HashMap;
import java.util.Map;

public class ContagemPalavras {

    private Map<String, Integer> contagemPalavrasMap;

    public ContagemPalavras() {
        this.contagemPalavrasMap = new HashMap<>();
    }

    public void adicionarPalavra(String palavra, Integer contagem){
        contagemPalavrasMap.put(palavra, contagem);
    }

    public void removerPalavra(String palavra) {
        if(!contagemPalavrasMap.isEmpty()){
            contagemPalavrasMap.remove(palavra);
        }
    }

    public void exibirContagemPalavras(){
        System.out.println(contagemPalavrasMap);
    }

    //Encontra a palavra mais frequente no texto e retorna a palavra e sua contagem.
    public Map.Entry<String, Integer> buscarPalavraMaisFrequente(){
        Map.Entry<String, Integer> palavraMaisFrequente = null;
        if(!contagemPalavrasMap.isEmpty()){
            for (Map.Entry<String, Integer> palavra : contagemPalavrasMap.entrySet()) {
                if(palavraMaisFrequente == null || palavra.getValue() > palavraMaisFrequente.getValue()){
                    palavraMaisFrequente = palavra;
                }
            }
        }
        return palavraMaisFrequente;
    }

    @Override
    public String toString() {
        return "ContagemPalavras{" +
                "contagemPalavrasMap=" + contagemPalavrasMap +
                '}';
    }

    public static void main(String[] args) {
        ContagemPalavras contagem = new ContagemPalavras();
        contagem.adicionarPalavra("Java", 10);
        contagem.adicionarPalavra("Python", 5);
        contagem.adicionarPalavra("JavaScript", 15);
        contagem.exibirContagemPalavras();
        contagem.removerPalavra("Python");
        contagem.exibirContagemPalavras();
        System.out.println(contagem.buscarPalavraMaisFrequente());
    }
}
