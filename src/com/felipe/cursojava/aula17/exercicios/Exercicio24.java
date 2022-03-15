package com.felipe.cursojava.aula17.exercicios;

import java.util.Scanner;

public class Exercicio24 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Informe o preço do pão:");
		double preco = scanner.nextDouble();
		
		System.out.println("Panificadora Pão de Ontem - Tabela de preços");	
		
		for (int i = 1; i <= 50; i++) {
			System.out.println(i + " - R$ " + (i * preco));
		}
	}

}
