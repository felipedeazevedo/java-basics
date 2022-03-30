package com.felipe.cursojava.aula19.exercicios;

import java.util.Scanner;

public class Exercicio13 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int[] a = new int[10];
		int soma = 0;
		
		for (int i = 0; i < a.length; i++) {
			System.out.println("Entre com um número:");
			a[i] = scan.nextInt();
			if (a[i] % 5 == 0) {
				soma += a[i];
			}
		}
		
		System.out.println(soma + " é a soma dos números");
	}

}
