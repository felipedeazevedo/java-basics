package com.felipe.cursojava.aula19.exercicios;

public class Exercicio01 {

	public static void main(String[] args) {
		
		int[] a = new int[5];
		
		int[] b = new int[a.length];
		
		// a[i] += 1 ou a[i] = a[i] + 1
		// a[i] = i + 1
		// a[i] += i + 1
		
		
		for (int i = 0; i < a.length; i++) {
			//System.out.println("i - " + i);
			//System.out.println("a [" + i + "] - " + a[i]);
			//System.out.println();
			a[i] = i + 1;
			b[i] = a[i];
		}
	
		for (int valorA : a) {
			System.out.println(valorA);
		}
		
		for (int valorB : b) {
			System.out.println(valorB);
		}
	}

}
