package br.com.ita.produtos.principal;

import br.com.ita.produtos.entidades.CarrinhoDeCompras;
import br.com.ita.produtos.entidades.ProdutoComTamanho;

public class Programa {

	public static void main(String[] args) {
		ProdutoComTamanho produto1 = new ProdutoComTamanho("Impressora HP", 12345, 300.0, 1);
		ProdutoComTamanho produto2 = new ProdutoComTamanho("Impressora HP", 12345, 300.0, 1);
		CarrinhoDeCompras cart = new CarrinhoDeCompras();

		cart.adicionaProduto(produto1, 2);
		System.out.println(cart.getPrecoTotal());
		System.out.println("Nome do produto: " + produto1.getNome() + " C�d: " + produto1.getCodigo() + " Pre�o: "
				+ produto1.getPreco() + " Quantidade: " + produto1.getTamanho());
		System.out.println("Nome do produto: " + produto2.getNome() + " C�d: " + produto2.getCodigo() + " Pre�o: "
				+ produto2.getPreco() + " Quantidade: " + produto2.getTamanho());
	}

}
