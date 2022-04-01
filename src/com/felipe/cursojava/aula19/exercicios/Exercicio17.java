package com.felipe.cursojava.aula19.exercicios;

import java.util.Scanner;

public class Exercicio17 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int[] idades = new int[10];
		int count = 0;
		
		for (int i = 0; i < idades.length; i++) {
			System.out.println("Informe a idade da pessoa " + (i + 1) + ": ");
			idades[i] = scan.nextInt();
			
			if (idades[i] > 35) {
				count++;
			}
		}
		
		System.out.println(count + " pessoas informadas têm mais de 35 anos.");
	}

}
