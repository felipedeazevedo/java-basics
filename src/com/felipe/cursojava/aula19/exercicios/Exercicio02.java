package com.felipe.cursojava.aula19.exercicios;

public class Exercicio02 {

	public static void main(String[] args) {
		
		int[] a = new int[8];
		
		int[] b = new int[a.length];
		
		
		for (int i = 0; i < a.length; i++) {
			a[i] = i + 1;
			b[i] = a[i] * 2;
		}
		
		System.out.println("A");
		for (int valorA : a) {
			System.out.println(valorA);
		}
		
		System.out.println("B");
		for (int valorB : b) {
			System.out.println(valorB);
		}
	}

}
