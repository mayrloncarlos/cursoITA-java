package br.com.ita.imc.teste;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import br.com.ita.imc.entidades.Paciente;

public class PacienteTest {
	
	@Test
	public void verificaSeOMetodoDoCalculoImcFunciona() {
		Paciente pacienteTestIMC = new Paciente(1.75, 57);
		
		pacienteTestIMC.calcularIMC();
		
		double valorEsperado = 18.61;
		
		assertEquals(valorEsperado, pacienteTestIMC.calcularIMC(), 0.01);
	}
	
	@Test
	public void testaBaixoPesoMuitoGrave() {
		Paciente paciente1 = new Paciente(1.90, 50);
		
		paciente1.diagnostico();
		
		String valorEsperado = "Baixo peso muito grave";

		assertEquals(valorEsperado, paciente1.diagnostico());
	}
	
	@Test
	public void testaBaixoPesoGrave() {
		Paciente paciente2 = new Paciente(1.75, 50);
		
		paciente2.diagnostico();
		
		String valorEsperado = "Baixo peso grave";

		assertEquals(valorEsperado, paciente2.diagnostico());
	}
	
	@Test
	public void testaBaixoGrave() {
		Paciente paciente3 = new Paciente(1.50, 40);
		
		paciente3.diagnostico();
		
		String valorEsperado = "Baixo grave";

		assertEquals(valorEsperado, paciente3.diagnostico());
	}
	
	@Test
	public void testaPesoNormal() {
		Paciente paciente4 = new Paciente(1.75, 70);
		
		paciente4.diagnostico();
		
		String valorEsperado = "Peso normal";

		assertEquals(valorEsperado, paciente4.diagnostico());
	}
	
	@Test
	public void testaSobrepeso() {
		Paciente paciente5 = new Paciente(1.55, 67);
		
		paciente5.diagnostico();
		
		String valorEsperado = "Sobrepeso";

		assertEquals(valorEsperado, paciente5.diagnostico());
	}
	
	@Test
	public void testaObesidadeGrauI() {
		Paciente paciente6 = new Paciente(1.55, 80);
		
		paciente6.diagnostico();
		
		String valorEsperado = "Obesidade Grau I";

		assertEquals(valorEsperado, paciente6.diagnostico());
	}
	
	@Test
	public void testaObesidadeGrauII() {
		Paciente paciente7 = new Paciente(1.55, 90);
		
		paciente7.diagnostico();
		
		String valorEsperado = "Obesidade Grau II";

		assertEquals(valorEsperado, paciente7.diagnostico());
	}
	
	@Test
	public void testaObesidadeGrauIII() {
		Paciente paciente8 = new Paciente(1.90, 150);
		
		paciente8.diagnostico();
		
		String valorEsperado = "Obesidade Grau III (Obesidade Mórbida)";

		assertEquals(valorEsperado, paciente8.diagnostico());
	}
}
