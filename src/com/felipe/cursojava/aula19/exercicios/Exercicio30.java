package com.felipe.cursojava.aula19.exercicios;

import java.util.Scanner;

public class Exercicio30 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int[] vetorA = new int[20];
		int[] vetorB = new int[vetorA.length];
		int[] vetorC  = new int[vetorA.length];
		
		for (int i = 0; i < vetorA.length; i++) {
			System.out.println("Informe o valor para a posição " + i + " do vetor A: ");
			vetorA[i] = scan.nextInt();
		}
		
		int indexB = 0;
		int indexC = 0;
		
		for (int i = 0; i < vetorA.length; i++) {
			if (vetorA[i] % 2 == 0) {
				vetorB[indexB] = vetorA[i];
				indexB++;
			} else {
				vetorC[indexC] = vetorA[i];
				indexC++;
			}
		}
		
		System.out.println(indexB);
		System.out.println(indexC);
		
		System.out.print("Vetor A = ");
		for (int a : vetorA) {
			System.out.print(a + " ");
		}
		System.out.println();
		System.out.print("Vetor B = ");
		for (int b : vetorB) {
			System.out.print(b + " ");
		}
		System.out.println();
		System.out.print("Vetor C = ");
		for (int c : vetorC) {
			System.out.print(c + " ");
		}
	}

}
