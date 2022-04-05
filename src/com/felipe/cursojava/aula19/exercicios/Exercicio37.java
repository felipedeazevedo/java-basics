package com.felipe.cursojava.aula19.exercicios;

import java.util.Scanner;

public class Exercicio37 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int[] vetorA = new int[15];
		int[] vetorB = new int[vetorA.length];
		
		for (int i = 0; i < vetorA.length; i++) {
			System.out.println("Informe o valor da posição " + i + ": ");
			vetorA[i] = scan.nextInt();
			vetorB[i] = vetorA[i];
		}
		
		
		for (int i = 0; i < vetorA.length; i++) {
			System.out.println("Index [" + i + "]: " + vetorA[i]);
			for (int j = vetorA[i] - 1; j > 0; j--) {
				vetorB[i] *= j;
			}
			System.out.println(vetorB[i]);
		}

	}

}
