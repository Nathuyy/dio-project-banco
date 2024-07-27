package CatalogoDeLivros;

import java.util.ArrayList;
import java.util.List;

public class CatalogoLivros {
    List<Livro> listaLivros;

    public CatalogoLivros() {
        this.listaLivros = new ArrayList<>();
    }

    public void adicionarLivro(String titulo, String autor, int anoPublicacao){
        listaLivros.add(new Livro(titulo, autor, anoPublicacao));
    }

    public List<Livro> pesquisarPorAutor(String autor){
        List<Livro> livrosPorAutor = new ArrayList<>();
        if (!listaLivros.isEmpty()) {
            for (Livro i : listaLivros) {
                if (i.getAutor().equalsIgnoreCase(autor)) {
                    livrosPorAutor.add(i);
                }
            }
            return livrosPorAutor;
        } else {
            throw new RuntimeException("A lista está vazia!");
        }
    }

    public List<Livro> pesquisarPorIntervaloAnos(int anoInicial, int anoFinal){
        List<Livro> livrosPorIntervaloAnos = new ArrayList<>();
        if (!listaLivros.isEmpty()) {
            for(Livro i : listaLivros){
                if(i.getAnoPublicacao() >= anoInicial && i.getAnoPublicacao() <= anoFinal){
                    livrosPorIntervaloAnos.add(i);
                }
            }
            return livrosPorIntervaloAnos;
        } else {
            throw new RuntimeException("A lista está vazia!");
        }
    }

    public List<Livro> pesquisarPorTitulo(String titulo) {
        List<Livro> livrosPorTitulo = new ArrayList<>();
        if (!listaLivros.isEmpty()) {
            for (Livro i : listaLivros) {
                if (i.getTitulo().equalsIgnoreCase(titulo)) {
                    livrosPorTitulo.add(i);  // Corrected line
                }
            }
            return livrosPorTitulo;
        } else {
            throw new RuntimeException("A lista está vazia!");
        }
    }

    public static void main(String[] args) {
        CatalogoLivros catalogoLivros = new CatalogoLivros();

        catalogoLivros.adicionarLivro("Microsserviços Prontos Para a Produção", "Susan J. Fowler", 2017);
        catalogoLivros.adicionarLivro("Java Guia do Programador", "Peter Jandl Junior", 2021);
        catalogoLivros.adicionarLivro("Código Limpo", "Robert C. Martin", 2009);
        catalogoLivros.adicionarLivro("O Codificador Limpo", "Robert C. Martin", 2012);

        System.out.println(catalogoLivros.pesquisarPorTitulo("Código Limpo"));
        System.out.println(catalogoLivros.pesquisarPorAutor("Robert C. Martin"));
        System.out.println(catalogoLivros.pesquisarPorIntervaloAnos(2010, 2022));
    }
}
