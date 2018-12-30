package br.com.ita.produtos.entidades;

import java.util.HashMap;
import java.util.Map;

public class CarrinhoDeCompras {

	private Map<Produto, Integer> mapProdutos = new HashMap<>();
	private static double precoTotal = 0;
	private static int quantCarrinho;

	public void adicionaProduto(Produto p, int quantidade) {
		if (mapProdutos.containsKey(p)) {
			mapProdutos.put(p, quantidade += quantidade);
		} else
			mapProdutos.put(p, quantidade);
		quantCarrinho += quantidade;
	}

	public void removeProduto(Produto p, int quantidade) {
		if (mapProdutos.containsKey(p)) {
			mapProdutos.remove(p);
			quantCarrinho -= quantidade;
		}
	}

	public double getPrecoTotal() {
		for (Produto p : mapProdutos.keySet()) {
			precoTotal = p.getPreco() * quantCarrinho;
		}
		return precoTotal;
	}

	public Map<Produto, Integer> getMapProdutos() {
		return mapProdutos;
	}

	public void setMapProdutos(Map<Produto, Integer> mapProdutos) {
		this.mapProdutos = mapProdutos;
	}

	public static int getQuantCarrinho() {
		return quantCarrinho;
	}

	public static void setQuantCarrinho(int quantCarrinho) {
		CarrinhoDeCompras.quantCarrinho = quantCarrinho;
	}

}