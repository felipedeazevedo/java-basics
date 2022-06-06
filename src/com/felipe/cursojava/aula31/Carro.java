package com.felipe.cursojava.aula31;

public class Carro {
	
	public String marca;
	String modelo;
	int numPassageiros;
	double capCombustivel;
	double consumoCombustivel;

	public void exibirAutonomia() {
		System.out.println("A autonomia do carro é: " + capCombustivel * consumoCombustivel + " km");
	}
	
	public double obterAutonomia() {
		
		System.out.println("Método obtertAutonimoia foi chamado");
		
		return capCombustivel * consumoCombustivel;
	}
	
	public double calcularCombustivel(double km) {
		 
		double qtdCombustivel = km / consumoCombustivel;
		
		return qtdCombustivel;
	}
}
