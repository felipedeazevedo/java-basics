package com.felipe.cursojava.aula36.exercicios;

public class Agenda {
	
	private String nome;
	private Contato[] contatos;
	
	public Agenda() {}
	
	public Agenda(String nome) {
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Contato[] getContatos() {
		return contatos;
	}
	public void setContatos(Contato[] contatos) {
		this.contatos = contatos;
	}
	
	public String exibirTodosContatos() {
		
		String string = "Nome da agenda: " + nome + "\n";
		
		if (contatos != null) {
			for (Contato c : contatos) {
				string += c.exibirInformacoes() + "\n";
			}
		}
		
		return string;
	}

}
