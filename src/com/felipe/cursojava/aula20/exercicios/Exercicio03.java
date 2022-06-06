package com.felipe.cursojava.aula20.exercicios;

import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int[][] matrizA = new int[3][3];
		int qtdPares = 0;
		int qtdImpares = 0;
		
		for (int i = 0; i < matrizA.length; i++) {
			for (int j =0; j < matrizA[i].length; j++) {
				System.out.println("Informe o valor da linha " + i + " coluna " + j + ": ");
				matrizA[i][j] = scan.nextInt();
				if (matrizA[i][j] % 2 == 0) {
					qtdPares++;
				}
				else {
					qtdImpares++;
				}
			}
		}
		
		for (int i = 0; i < matrizA.length; i++) {
			for (int j = 0; j < matrizA[i].length; j++) {
				System.out.print(matrizA[i][j] + "      ");
			}
			System.out.println();
		}
		
		System.out.println("Quantidade de elementos pares: " + qtdPares);
		System.out.println("Quantidade de elementos ímpares: " + qtdImpares);
	}

}
