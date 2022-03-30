package com.felipe.cursojava.aula19.exercicios;

public class Exercicio04 {

	public static void main(String[] args) {
		
		int[] a = new int[15];
		
		double[] b = new double[a.length];
		
		for (int i = 0; i < a.length; i++) {
			a[i] = i + 1;
			b[i] = Math.sqrt(a[i]);
		}

		System.out.println("A");
		for (int valorA : a) {
			System.out.print(valorA + ", ");
		}
		
		System.out.println(""); 
		
//		System.out.println("B");
//		for (double valorB : b) {
//			System.out.print(valorB + ", ");
//		}
		
		System.out.println(""); 
		
		String output = "";
		
		for (int i = 0; i < b.length; i++) {
			output += b[i];
			if (i != (b.length - 1)) {
			output += ", ";	
			}
		}
		
		System.out.println(output);
	}

}
