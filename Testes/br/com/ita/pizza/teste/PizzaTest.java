package br.com.ita.pizza.teste;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import br.com.ita.pizza.entidade.CarrinhoDeCompras;
import br.com.ita.pizza.entidade.Pizza;

public class PizzaTest {

	private Pizza pizza1;
	private Pizza pizza2;
	private Pizza pizza3;
	private CarrinhoDeCompras cart;

	@Before
	public void criaObjetos() {
		this.pizza1 = new Pizza();
		this.pizza2 = new Pizza();
		this.pizza3 = new Pizza();
		this.cart = new CarrinhoDeCompras();
	}

	@Test
	public void verificaSeOValorDaPizzaEstaCorreto() {
		// criando o cenário
		pizza1.adicionaIngrediente("Mussarela");
		pizza1.adicionaIngrediente("Palmito");

		// realizando a ação
		cart.addPizza(pizza1);

		// validando
		double valorTotalEsperado = 15;

		assertEquals(valorTotalEsperado, pizza1.getPreco(), 0.00001);
	}

	@Test
	public void verificaSeRegistraIngrediente() {
		// criando o cenário
		pizza1.adicionaIngrediente("Mussarela");

		// realizando a ação
		cart.addPizza(pizza1);

		// validando
		Assert.assertFalse(pizza1.getIngrediente().isEmpty());
	}
	
	@Test
	public void verificaSeORegistroDeIngredienteEstaZerado() {
		
		// criando o cenário + realizando a ação
		Pizza.zeraIngredientes();

		//validando
		int valorEsperado = 0;

		Assert.assertEquals(valorEsperado, Pizza.ingredientesT, 0.00001);
	}
}
