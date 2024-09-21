package com.dio.collections.list.operacoesbasicas.comprasonline;

import com.dio.collections.list.operacoesbasicas.ListaTarefa;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {

    private List<Item> carrinhoDeComprasList;

    public CarrinhoDeCompras() {
        carrinhoDeComprasList = new ArrayList<>();
    }

    public void adicionarItem(String nome, double preco, int quantidade) {
        Item item = new Item(nome, preco, quantidade);
        carrinhoDeComprasList.add(item);
    }

    public void removerItem(String nome) {
        List<Item> carrinhoDeComprasParaRemover = new ArrayList<Item>();
        for (Item i : carrinhoDeComprasList) {
            if (i.getNome().equalsIgnoreCase(nome)) {
                carrinhoDeComprasParaRemover.add(i);
            }
        }
        carrinhoDeComprasList.removeAll(carrinhoDeComprasParaRemover);
    }

    public double calcularValorTotal() {
        double valorTotal = 0.0;
        for (Item i : carrinhoDeComprasList) {
            valorTotal = valorTotal + i.getPreco() * i.getQuantidade();
        }
        return valorTotal;
    }

    public void exibirItens() {
        for (Item i : carrinhoDeComprasList) {
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        CarrinhoDeCompras carrinhoDeCompras = new CarrinhoDeCompras();

        System.out.println(carrinhoDeCompras.calcularValorTotal());

        carrinhoDeCompras.adicionarItem("chocolate", 2.2, 2);
        carrinhoDeCompras.adicionarItem("arroz", 1.5, 1);
        carrinhoDeCompras.adicionarItem("feijao", 1.7, 3);

        carrinhoDeCompras.exibirItens();
        carrinhoDeCompras.removerItem("chocolate");
        carrinhoDeCompras.exibirItens();

        System.out.println(carrinhoDeCompras.calcularValorTotal());

    }
}
