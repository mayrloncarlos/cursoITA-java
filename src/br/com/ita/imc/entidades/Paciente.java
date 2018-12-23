package br.com.ita.imc.entidades;

public class Paciente {

	public double altura;
	public double peso;
	
	
	public Paciente(double altura, double peso) {
		this.altura = altura;
		this.peso = peso;
	}
	
	public double calcularIMC() {
		double imc = this.peso / (this.altura * this.altura);
		return imc;
	}
	
	public String diagnostico() {
		if (this.calcularIMC() < 16) {
			return "Baixo peso muito grave"; 
		}
		if (this.calcularIMC() >= 16 && this.calcularIMC() <= 16.99)  {
			return "Baixo peso grave"; 
		} 
		if (this.calcularIMC() >= 17 && this.calcularIMC() <= 18.49)  {
			return "Baixo grave";
		}
		if (this.calcularIMC() >= 18.50 && this.calcularIMC() <= 24.99)  {
			return "Peso normal"; 
		} 
		if (this.calcularIMC() >= 25 && this.calcularIMC() <= 29.99)  {
			return "Sobrepeso"; 
		} 
		if (this.calcularIMC() >= 30 && this.calcularIMC() <= 34.99)  {
			return "Obesidade Grau I"; 
		} 
		if (this.calcularIMC() >= 35 && this.calcularIMC() <= 39.99)  {
			return "Obesidade Grau II"; 
		}
		if (this.calcularIMC() >= 40)  {
			return "Obesidade Grau III (Obesidade Mórbida)"; 
		}
		return null;
	}
	
}
