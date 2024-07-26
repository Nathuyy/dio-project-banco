package CatálogoDeLivros;

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
        }else{
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
        }else{
            throw new RuntimeException("A lista está vazia!");
        }
    }


}
