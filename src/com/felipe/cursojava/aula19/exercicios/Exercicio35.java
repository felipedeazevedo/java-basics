package com.felipe.cursojava.aula19.exercicios;

import java.util.Scanner;

public class Exercicio35 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int[] vetorA = new int[10];
		
		for (int i = 0; i < vetorA.length; i++) {
			System.out.println("Informe o valor da posição " + i + ": ");
			vetorA[i] = scan.nextInt();
		}
		
		
		for (int i = 0; i < vetorA.length; i++) {
			System.out.println("Index [" + i + "]: " + vetorA[i]);
			for (int j = 1; j < vetorA[i]; j++) {
				if (vetorA[i] % j == 0) {
					System.out.println(j);
				}
			}
		}
	}

}
