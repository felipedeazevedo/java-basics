package com.felipe.cursojava.aula19.exercicios;

import java.util.Scanner;

public class Exercicio29 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int[] vetorA = new int[10];
		int[] vetorB = new int[vetorA.length];
		int[] vetorC  = new int[20];
		
		for (int i = 0; i < vetorA.length; i++) {
			System.out.println("Informe o valor para a posição " + i + " do vetor A: ");
			vetorA[i] = scan.nextInt();
		}
		
		for (int i = 0; i < vetorA.length; i++) {
			System.out.println("Informe o valor para a posição " + i + " do vetor B: ");
			vetorB[i] = scan.nextInt();
		}
		
		for (int i = 0; i < vetorC.length; i++) {
			if (i < 10) {
				vetorC[i] = vetorA[i];
			} else {
				vetorC[i] = vetorB[i - vetorB.length];
			}
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
		System.out.println();
		System.out.print("Vetor C = ");
		for (int c : vetorC) {
			System.out.print(c + " ");
		}
	}

}
