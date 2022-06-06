package com.felipe.cursojava.aula34.exercicios;

public class TesteContador {
	
	public static void imprimirContador() {
		System.out.println(Contador.retornarContador());
	}

	public static void main(String[] args) {
		
		Contador.incrementar();
		
		imprimirContador();
		
		Contador.retornarContador();
		
		Contador.zerar();
		
		imprimirContador();
		
		Contador c1 = new Contador();
		
		Contador.incrementar();
		
		imprimirContador();
	}

}
