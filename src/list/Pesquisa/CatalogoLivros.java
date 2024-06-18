package list.Pesquisa;

import java.util.ArrayList;
import java.util.List;

public class CatalogoLivros {

    private List<Livro> livros;

    public CatalogoLivros(){
        this.livros = new ArrayList<>();
    }

    public void adicionarLivro(String titulo, String autor, int anoPublicacao){
        livros.add(new Livro(titulo, autor, anoPublicacao));
    }

    public List<Livro> pesquisarPorAutor(String autor){
        if(livros.isEmpty()){
            return null;
        }
        List<Livro> livrosEncontrados = new ArrayList<>();
        for(Livro livro : livros){
            if(livro.getAutor().equalsIgnoreCase(autor)){
                livrosEncontrados.add(livro);
            }
        }
        return livrosEncontrados;
    }

    public List<Livro> pesquisarPorIntervaloAnos(int anoInicio, int anoFim){
        if(livros.isEmpty()){
            return null;
        }
        List<Livro> livrosEncontrados = new ArrayList<>();
        for(Livro livro : livros){
            if(livro.getAnoPublicacao() >= anoInicio && livro.getAnoPublicacao() <= anoFim){
                livrosEncontrados.add(livro);
            }
        }
        return livrosEncontrados;
    }

    public Livro pesquisarPorTitulo(String titulo){
        if(livros.isEmpty()){
            return null;
        }

        for(Livro livro : livros){
            if(livro.getTitulo().equals(titulo)){
                return livro;
            }
        }
        return null;
    }

    public static void main(String[] args) {
        CatalogoLivros catalogoLivros = new CatalogoLivros();
        catalogoLivros.adicionarLivro("Java", "Autor1", 2000);
        catalogoLivros.adicionarLivro("Python", "Autor1", 2001);
        catalogoLivros.adicionarLivro("C++", "Autor3", 2002);
        catalogoLivros.adicionarLivro("Java", "Autor4", 2003);
        catalogoLivros.adicionarLivro("Python", "Autor5", 2004);
        catalogoLivros.adicionarLivro("C++", "Autor6", 2005);

        System.out.println("Pesquisa por autor:");
        List<Livro> livrosAutor = catalogoLivros.pesquisarPorAutor("Autor1");
        for(Livro livro : livrosAutor){
            System.out.println(livro);
        }

        System.out.println("Pesquisa por intervalo de anos:");
        List<Livro> livrosAno = catalogoLivros.pesquisarPorIntervaloAnos(2000, 2003);
        for(Livro livro : livrosAno){
            System.out.println(livro);
        }

        System.out.println("Pesquisa por titulo:");
        Livro livroTitulo = catalogoLivros.pesquisarPorTitulo("Java");
        System.out.println(livroTitulo);
    }
}
