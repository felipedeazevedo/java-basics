package com.felipe.cursojava.aula19.exercicios;

public class Exercicio09 {

	public static void main(String[] args) {
		
		int[] a = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		
		int[] b = {3, 2, 3, 2, 3, 2, 1, 2, 3, 2};
		
		double[] c = new double[10];
		
		for (int i = 0; i < a.length; i++) {
			c[i] = a[i] / b[i];
		}

		for (double valorC : c) {
			System.out.print(valorC + " ");
		}
	}

}
