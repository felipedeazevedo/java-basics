package com.felipe.cursojava.aula19.exercicios;

public class Exercicio10 {

	public static void main(String[] args) {
		
		int[] a = {2, 4, 6, 8, 10, 12, 14, 16, 18, 20};
		
		int[] b = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		
		int[] c = new int[10];
		
		for (int i = 0; i < a.length; i++) {
			c[i] = a[i] % b[i];
		}

		for (int valorC : c) {
			System.out.println(valorC);
		}
	}

}
