package com.felipe.cursojava.aula19.exercicios;

import java.util.Scanner;

public class Exercicio18 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int[] idades = new int[10];
		
		for (int i = 0; i < idades.length; i++) {
			System.out.println("Informe a idade da pessoa " + (i + 1) + ": ");
			idades[i] = scan.nextInt();
		}
		
		// Outra alternativa ao uso da classe Integer. Integer.MIN_VALUE / Integer.MAX_VALUE. Atenção que primeiro todas as posições do array têm que ser preenchidas.
		
		int maior = idades[0];
		int indexMaior = 0;
		int menor = idades[0];
		int indexMenor = 0;
		
		for (int i = 1; i < idades.length; i++) {
			if (idades[i] > maior) {
				maior = idades[i];
				indexMaior = i;
			} else if (idades[i] < menor) {
				menor = idades[i];
				indexMenor = i;
			}
		}
		
		System.out.println("Menor idade: " + menor);
		System.out.println("Índice da menor idade: " + indexMenor);
		System.out.println("Maior idade: " + maior);
		System.out.println("Índice da maior idade: " + indexMaior);
	}

}
