package com.felipe.cursojava.aula14.exercicios;

import java.util.Scanner;

public class Exercicio16 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		//ax2 + bx + c
		// delta - b2 - 4ac
		System.out.println("Informe o valor de a:");
		int a = scan.nextInt();
		
		if (a != 0) {
			System.out.println("Informe o valor de b:");
			int b = scan.nextInt();
			System.out.println("Informe o valor de c:");
			int c = scan.nextInt();
			
			double delta = Math.pow(b, 2) - (4 * a * c);
			
			if (delta < 0) {
				System.out.println("A equação não possui raizes reais. Programa encerrado.");
			} else {
				double res1 = ((-b) + Math.sqrt(delta)) / (2 * a);
				double res2 = ((-b) - Math.sqrt(delta)) / (2 * a);
				if (delta == 0) {
					System.out.println("Delta = " + delta);
					System.out.println("Raizes: " + res1 + " e " + res2);
				} else {
					System.out.println("Raizes: " + res1 + " e " + res2);
				}
			}
		} else {
			System.out.println("Programa encerrado!");
		}
	}

}
