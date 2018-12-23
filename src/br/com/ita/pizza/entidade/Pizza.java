package br.com.ita.pizza.entidade;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Pizza {
	public static int ingredientesT = 0;
	private ArrayList<String> ingrediente = new ArrayList<String>();
	public static Map<String, Integer> ingredientesMap = new HashMap<String, Integer>();

	public ArrayList<String> getIngrediente() {
		return ingrediente;
	}

	public static Map<String, Integer> getListaIngredientes() {
		return ingredientesMap;
	}
	
	// Método que recebe uma String com o ingrediente a ser adicionado
	public void adicionaIngrediente(String nomeIngrediente) {
		this.ingrediente.add(nomeIngrediente);
		contabilizaIngrediente(nomeIngrediente);
	}

	// Método que guarda os ingredientes em um lista e contabiliza no "ingredientesT"
	public static void contabilizaIngrediente(String nomeIngrediente) {
		if (ingredientesMap.containsKey(nomeIngrediente)) {
			int value = ingredientesMap.get(nomeIngrediente);
			ingredientesMap.put(nomeIngrediente, value + 1);
		} else {
			ingredientesMap.put(nomeIngrediente, 1);
		}
		ingredientesT++;
	}
	
	// Calcula o preço dos ingredientes
	public double getPreco() {
		double preco = 0;
		if (ingrediente.size() <= 2) {
			preco = 15;
		}
		if (ingrediente.size() >= 3 && ingrediente.size() <= 5) {
			preco = 20;
		}
		if (ingrediente.size() > 5) {
			preco = 23;
		}
		return preco;
	}
	
	public static void zeraIngredientes() {
		ingredientesT = 0;
	}
}
