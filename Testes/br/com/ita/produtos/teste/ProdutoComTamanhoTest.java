package br.com.ita.produtos.teste;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

import org.junit.Before;
import org.junit.Test;

import br.com.ita.produtos.entidades.ProdutoComTamanho;

public class ProdutoComTamanhoTest {

	private ProdutoComTamanho produto1;
	private ProdutoComTamanho produto2;

	@Before
	public void criarObjetos() {
		this.produto1 = new ProdutoComTamanho("Smartphone", 350, 700.0, 1);
		this.produto2 = new ProdutoComTamanho("Relógio", 350, 200.0, 2);
	}
	
	@Test
	public void verificarSeProdutosComOMesmoCodigoETamanhosDiferentesSaoDiferentes() {

		assertNotEquals(produto1.equals(produto2), produto2.equals(produto2));
	}
	
	@Test
	public void comparaOsHashcode() {
		assertNotEquals(produto1.hashCode(), produto2.hashCode());
	}
}
