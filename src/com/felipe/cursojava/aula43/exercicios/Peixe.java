package com.felipe.cursojava.aula43.exercicios;

public class Peixe extends Animal {
	
	private String caracteristicas;

	public Peixe() {
		super();
		this.setNumPatas(0);
		this.setAmbiente("Mar");
		this.setCor("Cinzenta");
		this.caracteristicas = "Barbatanas e caudas";
	}

	public Peixe(String nome, double comprimento, int numPatas, String cor, String ambiente, double velocidade,
			String caracteristicas) {
		super(nome, comprimento, numPatas, cor, ambiente, velocidade);
		this.caracteristicas = caracteristicas;
	}

	public String getCaracteristicas() {
		return caracteristicas;
	}

	public void setCaracteristicas(String caracteristicas) {
		this.caracteristicas = caracteristicas;
	}

	@Override
	public String toString() {
		return "Peixe [caracteristicas=" + caracteristicas + ", toString() = " + super.toString() + "]";
	}
}
