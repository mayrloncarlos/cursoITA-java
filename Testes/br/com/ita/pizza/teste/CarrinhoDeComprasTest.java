package br.com.ita.pizza.teste;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import br.com.ita.pizza.entidades.CarrinhoDeCompras;
import br.com.ita.pizza.entidades.Pizza;

public class CarrinhoDeComprasTest {

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
	public void verificarSomaDasPizzas() {
		
		// criando o cenário
		pizza1.adicionaIngrediente("Mussarela");
		pizza1.adicionaIngrediente("Palmito");

		pizza2.adicionaIngrediente("Frango");
		pizza2.adicionaIngrediente("Cheddar");
		pizza2.adicionaIngrediente("Mussarela");
		pizza2.adicionaIngrediente("Cebola");
		pizza2.adicionaIngrediente("Alho");
		pizza2.adicionaIngrediente("Manjericão");

		pizza3.adicionaIngrediente("Carne de Sol");
		pizza3.adicionaIngrediente("Provolone");
		pizza3.adicionaIngrediente("Cebola");

		// realizando a ação
		cart.addPizza(pizza1);
		cart.addPizza(pizza2);
		cart.addPizza(pizza3);
		
		// validando
		double valorEsperado = 58.0;
		
		assertEquals(valorEsperado, cart.getPrecoTotal(), 0.00001);
	}
	
	@Test
	public void naoDeveAdicionarPizzaSemIngredientes() {
		
		// criando cenário + realizando ação
		cart.addPizza(pizza1);
		
		// validando
		int valorEsperado = 0;
		
		assertEquals(valorEsperado, cart.totalPizzas());
	}

}
