package com.felipe.cursojava.aula19.exercicios;

public class Exercicio05 {

	public static void main(String[] args) {
		
		int[] a = new int[10];
		
		int[] b = new int[a.length];
		
		for (int i = 0; i < a.length; i++) {
			a[i] = i + 1;
			b[i] = a[i] * i;
		}
		
		for (int valorA : a) {
			System.out.println(valorA);
		}
		
		for (int valorB : b) {
			System.out.println(valorB);
		}
	}

}
