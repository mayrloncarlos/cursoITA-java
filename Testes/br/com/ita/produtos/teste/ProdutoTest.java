package br.com.ita.produtos.teste;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import br.com.ita.produtos.entidades.Produto;

public class ProdutoTest {
	
	private Produto produto1;
	private Produto produto2;

	@Before
	public void criarObjetos() {
		
		this.produto1 = new Produto("Smartphone", 354, 700.0);
		this.produto2 = new Produto("Relógio", 354, 200.0);
	}
	
	@Test
	public void veriicarSeProdutosComOMesmoCodigoSaoIguais() {
		
		assertEquals(produto1.equals(produto2), produto2.equals(produto1));
	}
	
	@Test
	public void compararHashcode() {
		
		assertEquals(produto1.hashCode(), produto2.hashCode());
	}

}
