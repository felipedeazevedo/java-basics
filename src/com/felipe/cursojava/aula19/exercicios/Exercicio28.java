package com.felipe.cursojava.aula19.exercicios;

import java.util.Scanner;

public class Exercicio28 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int[] vetorA = new int[10];
		int[] vetorB = new int[vetorA.length];
		
		for (int i = 0; i < vetorA.length; i++) {
			System.out.println("Informe o valor para a posição " + i + ": ");
			vetorA[i] = scan.nextInt();
		}

		for (int i = vetorA.length - 1, j = 0; i >= 0 || j < vetorB.length; i--, j++) {
			vetorB[j] = vetorA[i];
		}

		System.out.print("Vetor A = ");
		for (int a : vetorA) {
			System.out.print(a + " ");
		}
		System.out.println();
		System.out.print("Vetor B = ");
		for (int b : vetorB) {
			System.out.print(b + " ");
		}
	}

}
