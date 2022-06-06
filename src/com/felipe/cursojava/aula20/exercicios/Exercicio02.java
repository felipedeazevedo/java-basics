package com.felipe.cursojava.aula20.exercicios;

public class Exercicio02 {

	public static void main(String[] args) {
		
		int[][] numerosAleatorios = new int[10][10];
		int maiorLinhaCinco = 0;
		int maiorColunaSete = 0;
		
		for (int i = 0; i < numerosAleatorios.length; i++) {
			for (int j =0; j < numerosAleatorios[i].length; j++) {
				numerosAleatorios[i][j] = (int)Math.round(Math.random() * 10);
				if (numerosAleatorios[5][j] > maiorLinhaCinco) {
					maiorLinhaCinco = numerosAleatorios[i][j];
				}
				if (numerosAleatorios[i][7] > maiorColunaSete) {
					maiorColunaSete = numerosAleatorios[i][j];
				}
			}
		}
		
		for (int i = 0; i < numerosAleatorios.length; i++) {
			for (int j = 0; j < numerosAleatorios[i].length; j++) {
				System.out.print(numerosAleatorios[i][j] + "      ");
			}
			System.out.println();
		}
		
		System.out.println("Maior elemento da linha 5: " + maiorLinhaCinco);
		System.out.println("Maior elemento da coluna 7: " + maiorColunaSete);
	}

}
