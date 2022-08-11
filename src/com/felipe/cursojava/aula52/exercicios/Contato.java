package com.felipe.cursojava.aula52.exercicios;

public class Contato {
	
	public static int contador = 0;
	
	private static int id = 1;
	private String nome;
	private String telefone;
	
	private String email;
	
	public Contato() {
		contador++;
		id = contador;
	}

	public Contato(String nome, String telefone) {
		super();
		this.nome = nome;
		this.telefone = telefone;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public int getId() {
		return id;
	}
	
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		String s = "[";
		s += "Id: " + id;
		s += ", nome: " + nome;
		s += ", telefone: " + telefone;
		s += ", email: " + email;
		s += "]";
		return s;
	}
	
}
