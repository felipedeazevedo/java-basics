package com.felipe.cursojava.aula19.exercicios;

public class Exercicio03 {

	public static void main(String[] args) {
		
		int[] a = new int[15];
		
		int[] b = new int[a.length];
		
		
		for (int i = 0; i < a.length; i++) {
			a[i] = i + 1;
			//System.out.println("a[i] = " + a[i]);
			b[i] = a[i] * a[i];
		}
		
		System.out.println("A");
		for (int valorA : a) {
			System.out.print(valorA + ", ");
		}
		
		System.out.println(); 
		
		System.out.println("B");
		for (int valorB : b) {
			System.out.print(valorB + ", ");
		}
	}

}
