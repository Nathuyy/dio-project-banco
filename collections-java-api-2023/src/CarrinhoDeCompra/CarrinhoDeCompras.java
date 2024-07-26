package CarrinhoDeCompra;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {
    List<Item> carrinho;

    public CarrinhoDeCompras() {
        this.carrinho = new ArrayList<>();
    }

    public void adicionarItem(String nome, double preco, int quantidade){
        carrinho.add(new Item(nome, preco, quantidade));
    }

    public void removerItem(String nome){
        List<Item> itensParaRemover = new ArrayList<>();
        if (!carrinho.isEmpty()) {
            for(Item i : carrinho) {
                if (i.getNome().equalsIgnoreCase(nome)){
                    itensParaRemover.add(i);
                }
            }
            carrinho.removeAll(itensParaRemover);
        } else {
            System.out.println("A lista está vazia!");
        }
    }

    public double calcularValorTotal() {
        double valorTotal = 0d;
        if(!carrinho.isEmpty()) {
            for (Item item : carrinho) {
                valorTotal += item.getPreco() * item.getQuantidade();
            }
            return valorTotal;
        }else{
            throw new RuntimeException("A lista está vazia!");
        }
    }

    public void exibirItens(){
        if (!carrinho.isEmpty()) {
            for (Item item : carrinho) {
                System.out.println(item);
            }
        } else {
            System.out.println("A lista está vazia!");
        }
    }

    @Override
    public String toString() {
        return "CarrinhoDeCompras{" + "carrinho=" + carrinho + "}";
    }

    public static void main(String[] args) {
        CarrinhoDeCompras carrinhoDeCompras = new CarrinhoDeCompras();

        carrinhoDeCompras.adicionarItem("Lápis", 2d, 3);
        carrinhoDeCompras.adicionarItem("Caderno", 20d, 3);
        carrinhoDeCompras.adicionarItem("Mochila", 67.80d, 3);

        carrinhoDeCompras.exibirItens();

        double valorTotal = carrinhoDeCompras.calcularValorTotal();
        System.out.println("Valor total: " + valorTotal);

        carrinhoDeCompras.removerItem("Caderno");
        carrinhoDeCompras.exibirItens();
    }
}
