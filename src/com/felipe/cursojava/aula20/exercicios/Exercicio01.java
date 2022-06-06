package com.felipe.cursojava.aula20.exercicios;

import java.util.Random;

public class Exercicio01 {

	public static void main(String[] args) {
		
		int[][] numerosAleatorios = new int[4][4];
		int maior = Integer.MIN_VALUE;
		int linha = 0;
		int coluna = 0;
		
		Random numeroRandom = new Random();
		
		for (int i = 0; i < numerosAleatorios.length; i++) {
			for (int j = 0; j < numerosAleatorios[i].length; j++) {
				// Passamos como parâmetro para o nextInt() o número que será o valor máximo.
				numerosAleatorios[i][j] = numeroRandom.nextInt(100);
				if (numerosAleatorios[i][j] > maior) {
					maior = numerosAleatorios[i][j];
					linha = i;
					coluna = j;
				}
			}
		}
		
		for (int i = 0; i < numerosAleatorios.length; i++) {
			for (int j = 0; j < numerosAleatorios[i].length; j++) {
				System.out.print(numerosAleatorios[i][j] + " ");
			}
			System.out.println();
		}
		
		System.out.println("Maior valo: " + maior);
		System.out.println("Linha x coluna do maior elemento: " + linha + " x " + coluna);
	}

}
