package com.felipe.cursojava.aula29;

public class Carro {

	String marca;
	String modelo;
	int numPassageiros;
	double capCombustivel;
	double consumoCombustivel;
	
	Carro() {
		System.out.println("Classe carro foi instanciada.");
		numPassageiros = 4;
	}
	
	Carro(String marca_) {
		marca = marca_;
	}
	
	void exibirAutonomia() {
		System.out.println("A autonomia do carro é: " + capCombustivel * consumoCombustivel + " km");
	}
	
	double obterAutonomia() {
		
		System.out.println("Método obtertAutonimoia foi chamado");
		
		return capCombustivel * consumoCombustivel;
	}
	
	double calcularCombustivel(double km) {
		 
		double qtdCombustivel = km / consumoCombustivel;
		
		return qtdCombustivel;
	}
}
