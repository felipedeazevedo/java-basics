package com.felipe.cursojava.aula19.exercicios;

import java.util.Scanner;

public class Exercicio33 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int[] vetorA = new int[10];
		
		for (int i = 0; i < vetorA.length; i++) {
			System.out.println("Informe o valor da posição " + i + ": ");
			vetorA[i] = scan.nextInt();
		}
		
		boolean primo = true;
		for (int i = 0; i < vetorA.length; i++) {
			primo = true;
			for (int j = 2; j < vetorA[i]; j++) {
				if (vetorA[i] % j == 0) {
					primo = false;
					break;
				} 
			}
			if (primo) {
				System.out.println(vetorA[i] + " é primo.");
			} else {
				System.out.println(vetorA[i] + " não é primo.");
			}
		}
	}

}
