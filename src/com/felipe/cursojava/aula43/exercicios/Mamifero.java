package com.felipe.cursojava.aula43.exercicios;

public class Mamifero extends Animal {

	private String alimento;

	public Mamifero() {
		super();
		this.setCor("Castanho");
		this.alimento = "Mel";
	}

	public Mamifero(String nome, double comprimento, int numPatas, String cor, String ambiente, double velocidade,
			String alimento) {
		super(nome, comprimento, numPatas, cor, ambiente, velocidade);
		this.alimento = alimento;
	}

	public String getAlimento() {
		return alimento;
	}

	public void setAlimento(String alimento) {
		this.alimento = alimento;
	}

	@Override
	public String toString() {
		return "Mamifero [alimento=" + alimento + ", toString() = " + super.toString() + "]";
	}
}
