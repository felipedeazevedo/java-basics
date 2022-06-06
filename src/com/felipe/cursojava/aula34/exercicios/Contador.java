package com.felipe.cursojava.aula34.exercicios;

public class Contador {
	
	public static int count = 0;
	
	public Contador() {
		count++;
	}
	
	public static void zerar() {
		count = 0;
	}
	
	public static void incrementar() {
		count++;
	}
	
	public static int retornarContador() {
		return count;
	}
}
