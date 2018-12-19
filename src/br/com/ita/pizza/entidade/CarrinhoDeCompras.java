package br.com.ita.pizza.entidade;

import java.util.ArrayList;

public class CarrinhoDeCompras {
	
	// Recebe objetos da classe Pizza
	private ArrayList<Pizza> pizzas = new ArrayList<Pizza>();
	private double precoTotal = 0;

	// O carrinho não adiciona uma pizza caso não tenha ingredientes
	public void addPizza(Pizza p) {
		if (p.getIngrediente().isEmpty()) {
		} else
			pizzas.add(p);
	}
	
	// Retorna o número de pizzas no carrinhho
	public int totalPizzas() {
		return pizzas.size();
	}

	// Retorna o valor total de todas as pizzas no carrinho
	public double getPrecoTotal() {
		for (int i = 0; i < pizzas.size(); i++) {
			precoTotal += pizzas.get(i).getPreco();
		}
		return precoTotal;
	}
}
