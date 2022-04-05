package com.felipe.cursojava.aula19.exercicios;

import java.util.Scanner;

public class Exercicio32 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int[] vetorA = new int[5];
		
		for (int i = 0; i < vetorA.length; i++) {
			do {
				System.out.println("Informe o valor da posição " + i + " (entre 1 e 10): ");
				vetorA[i] = scan.nextInt();
			} while (vetorA[i] <= 0 || vetorA[i] > 10);
		}
		
		for (int a : vetorA) {
			for (int i = 1; i <= 10; i++) {
				System.out.println(a + " * " + i + " = " + (a * i));
			}
		}
	}

}
