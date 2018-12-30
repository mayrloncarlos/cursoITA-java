package br.com.ita.produtos.teste;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import br.com.ita.produtos.entidades.CarrinhoDeCompras;
import br.com.ita.produtos.entidades.ProdutoComTamanho;

public class CarrinhoDeComprasTest {

	private ProdutoComTamanho produto1;
	private CarrinhoDeCompras carrinho;

	@Before
	public void criarObjetos() {
		this.produto1 = new ProdutoComTamanho("Smartphone", 350, 700.0, 1);
		this.carrinho = new CarrinhoDeCompras();
	}

	@Test
	public void testeAdicionarProdutoNoCarrinho() {

		carrinho.adicionaProduto(produto1, 5);
		assertEquals(5, carrinho.getQuantCarrinho());
	}

	@Test
	public void testeRemoverProdutoNoCarrinho() {

		carrinho.adicionaProduto(produto1, 5);
		carrinho.removeProduto(produto1, 2);
		assertEquals(3, carrinho.getQuantCarrinho());
	}

	@Test
	public void testePrecoTotal() {

		carrinho.adicionaProduto(produto1, 5);
		assertEquals(3500.0, carrinho.getPrecoTotal(), 0.0001);
	}

	@After
	public void limpaObjetos() {
		carrinho.setQuantCarrinho(0);
	}

}
