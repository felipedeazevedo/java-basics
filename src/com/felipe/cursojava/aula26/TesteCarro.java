package com.felipe.cursojava.aula26;

public class TesteCarro {

	public static void main(String[] args) {
		
		Carro van = new Carro();
		van.marca = "Fiat";
		van.modelo = "Ducato";
		van.numPassageiros = 10;
		van.capCombustivel = 100;
		van.consumoCombustivel = 0.2;
		
		van.exibirAutonomia();
		
		double autonomia = van.obterAutonomia();
		System.out.println("Autonomia do carro é: " + autonomia);
	}

}
