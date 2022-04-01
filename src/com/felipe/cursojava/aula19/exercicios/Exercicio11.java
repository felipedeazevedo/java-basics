package com.felipe.cursojava.aula19.exercicios;

import java.util.Scanner;

public class Exercicio11 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int[] a = new int[10];
		int count = 0;
		
		for (int i = 0; i < a.length; i++) {
			System.out.println("Entre com o número da posição " + (i + 1) + ": ");
			a[i] = scan.nextInt();
			if (a[i] % 2 == 0) {
				count++;
			}
		}
		
		System.out.println(count + " números pares");
	}

}
