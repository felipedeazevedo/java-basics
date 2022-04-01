package com.felipe.cursojava.aula19.exercicios;

import java.util.Scanner;

public class Exercicio24 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int[] vetorA = new int[10];
		
		for (int i = 0; i < vetorA.length; i++) {
			System.out.println("Informe o valor da posição " + i + ": ");
			vetorA[i] = scan.nextInt();
		}
		
		boolean isPalindromo = true;
		
		for (int i = 0; i < (vetorA.length / 2); i++) {
			if (vetorA[i] != vetorA[vetorA.length - 1 - i]) {
				isPalindromo = false;
				break;
			}
		}
		
		if (isPalindromo) {
			System.out.println("É palíndromo.");
		} else {
			System.out.println("Não é palíndromo.");
		}
	}

}
