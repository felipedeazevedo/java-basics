package com.felipe.cursojava.aula17.exercicios;

import java.util.Scanner;

public class Exercicio36 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite o valor de n:");
		int n = scan.nextInt();
		
		double h = 1;

		for (double i = 2; i <= n; i++) {
			
			h += 1/i;
			System.out.println(h);
		}
		
		System.out.print("H = " + h);
	}

}
