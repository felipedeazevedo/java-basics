package com.felipe.cursojava.aula43.exercicios;

public abstract class Contribuinte {
	
	private String nome;
	private double rendaBruta;
	
	public Contribuinte() {
		super();
	}
	
	public Contribuinte(String nome, double rendaBruta) {
		super();
		this.nome = nome;
		this.rendaBruta = rendaBruta;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public double getRendaBruta() {
		return rendaBruta;
	}
	
	public void setRendaBruta(double rendaBruta) {
		this.rendaBruta = rendaBruta;
	}
	
	public abstract double calcularImposto();

	@Override
	public String toString() {
		return "Contribuinte [nome=" + nome + ", rendaBruta=" + rendaBruta + "]";
	}
}
