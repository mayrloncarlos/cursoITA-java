package br.com.ita.imc.programa;

import br.com.ita.imc.entidades.Paciente;

public class Principal {

	public static void main(String[] args) {

		Paciente paciente1 = new Paciente(1.75, 57);
		Paciente paciente2 = new Paciente(1.55, 67);
		Paciente paciente3 = new Paciente(1.90, 150);
		
		System.out.printf("IMC do paciente 1: %.2f", paciente1.calcularIMC());
		System.out.println();
		System.out.printf("IMC do paciente 2: %.2f", paciente2.calcularIMC());
		System.out.println();
		System.out.printf("IMC do paciente 3: %.2f", paciente3.calcularIMC());
		System.out.println();
		System.out.println();
		
		System.out.println("Diagnóstico do paciente 1: " + paciente1.diagnostico());
		System.out.println("Diagnóstico do paciente 2: " + paciente2.diagnostico());
		System.out.println("Diagnóstico do paciente 3: " + paciente3.diagnostico());
	}

}
