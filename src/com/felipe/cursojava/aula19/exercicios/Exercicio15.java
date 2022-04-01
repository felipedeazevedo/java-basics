package com.felipe.cursojava.aula19.exercicios;

import java.util.Scanner;

public class Exercicio15 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int[] a = new int[10];
		int soma = 0, countPares = 0, countImpares = 0;
		double media = 0, percPares, percImpares;
		
		for (int i = 0; i < a.length; i++) {
			System.out.println("Entre com um número:");
			a[i] = scan.nextInt();
			if (a[i] % 2== 0) {
				countPares++;
			} else {
				countImpares++;
			}
		}

		percPares = 10 * countPares; 
		percImpares = 10 * countImpares; 
		
		System.out.println(percPares + "% é o percentual dos números pares.");
		System.out.println(percImpares + "% é o percentual dos números ímpares.");
	}

}
