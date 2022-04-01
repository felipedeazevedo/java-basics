package com.felipe.cursojava.aula19.exercicios;

import java.util.Scanner;

public class Exercicio14 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int[] a = new int[10];
		int soma = 0, count = 0;
		double media = 0;
		
		for (int i = 0; i < a.length; i++) {
			System.out.println("Entre com um número:");
			a[i] = scan.nextInt();
			if (a[i] % 2 != 0) {
				soma += a[i];
				count++;
			}
		}
		
		media = soma / count;
		
		System.out.println("Soma: " + soma);
		System.out.println(media + " é a média dos números");
	}

}
