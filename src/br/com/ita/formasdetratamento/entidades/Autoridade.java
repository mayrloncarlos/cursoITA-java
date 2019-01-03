package br.com.ita.formasdetratamento.entidades;

import br.com.ita.formasdetratamento.interfaces.FormatadorNome;

public class Autoridade {

	private String nome;
	private String sobrenome;
	private FormatadorNome formatadornome;

	public Autoridade(String nome, String sobrenome, FormatadorNome formatadornome) {
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.formatadornome = formatadornome;
	}

	public String getTratamento() {
		return formatadornome.formatarNome(nome, sobrenome);
	}

}
