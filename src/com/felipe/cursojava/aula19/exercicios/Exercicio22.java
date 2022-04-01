package com.felipe.cursojava.aula19.exercicios;

public class Exercicio22 {

	public static void main(String[] args) {
		
		int[] vetorAleatorio = new int[10];
		int qtd1 = 0, qtd0 = 0;
		double perc1, perc0;
		
		for (int i = 0; i < vetorAleatorio.length; i++) {
			vetorAleatorio[i] = (int)Math.round(Math.random() * 1);
			if (vetorAleatorio[i] == 1) {
				qtd1++;
			} else {
				qtd0++;
			}
		}
		
		perc1 = (qtd1 * 100) / vetorAleatorio.length;
		perc0 = (qtd0 * 100) / vetorAleatorio.length;
		
		System.out.print("Vetor aleatóri ogerado = ");
		for (int valorVetor : vetorAleatorio) {
			System.out.print(valorVetor + " ");
		}
		System.out.println();
		System.out.println("Percentual de números 0: " + perc0 + "%");
		System.out.println("Percentual de números 1: " + perc1+ "%");
	}

}
