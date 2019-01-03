package br.com.ita.formasdetratamento.teste;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import br.com.ita.formasdetratamento.entidades.Autoridade;
import br.com.ita.formasdetratamento.interfaces.ComTitulo;
import br.com.ita.formasdetratamento.interfaces.FormatadorNome;
import br.com.ita.formasdetratamento.interfaces.Informal;
import br.com.ita.formasdetratamento.interfaces.Respeitoso;

public class FormasDeTratamentoTest {

	@Test
	public void TesteInformal() {
		
		FormatadorNome formatadorNome = new Informal();
		Autoridade autoridade1 = new Autoridade("Jos�", "Costa", formatadorNome);
		assertEquals(autoridade1.getTratamento(), "Jos�");
	}

	@Test
	public void TesteRespeitosoMasculino() {
		
		FormatadorNome formatadorNome = new Respeitoso(true, false);
		Autoridade autoridade2 = new Autoridade("Jos�", "Costa", formatadorNome);
		assertEquals(autoridade2.getTratamento(), "Sr. Jos� Costa");
	}
	
	@Test
	public void TesteRespeitosoFeminino() {
		
		FormatadorNome formatadorNome = new Respeitoso(false, true);
		Autoridade autoridade3 = new Autoridade("Maria", "Costa", formatadorNome);
		assertEquals(autoridade3.getTratamento(), "Sra. Maria Costa");
	}
	
	@Test
	public void TesteComTitulo() {
		
		FormatadorNome formatadorNome = new ComTitulo("Magn�fica");
		Autoridade autoridade4 = new Autoridade("Maria", "Costa", formatadorNome);
		assertEquals(autoridade4.getTratamento(), "Magn�fica Maria Costa");
	}
}
