package com.felipe.cursojava.aula19.exercicios;

public class Exercicio07 {

	public static void main(String[] args) {
		
		int[] a = new int[10];
		
		int[] b = new int[10];
		
		int[] c = new int[10];
		
		for (int i = 0; i < a.length; i++) {
			System.out.println(i);
			System.out.println("2 * " + i + " + 1");
			a[i] = (2 * i) + 1;
			b[i] = i + 1;
			c[i] = a[i] - b[i];
		}
		
		for (int valorC : c) {
			System.out.println(valorC);
		}
	}

}
