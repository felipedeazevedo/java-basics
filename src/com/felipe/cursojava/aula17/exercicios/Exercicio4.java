package com.felipe.cursojava.aula17.exercicios;

public class Exercicio4 {

	public static void main(String[] args) {
		
		int popA = 80000;
		int popB = 200000;
		int count = 0;
		
		while (popA < popB) {
			popA += popA * 0.03;
			popB += popB * 0.015;
			count++;
		}
		
		System.out.println("Quantidade de anos: " + count);
	}

}
