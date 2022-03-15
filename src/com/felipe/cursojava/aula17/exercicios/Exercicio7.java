package com.felipe.cursojava.aula17.exercicios;

import java.util.Scanner;

public class Exercicio7 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		/*System.out.println("Informe o primeiro número: ");
		int num1 = scan.nextInt();

		System.out.println("Informe o segundo número: ");
		int num2 = scan.nextInt();

		System.out.println("Informe o terceiro número: ");
		int num3 = scan.nextInt();

		System.out.println("Informe o quarto número: ");
		int num4 = scan.nextInt();

		System.out.println("Informe o quinto número: ");
		int num5 = scan.nextInt();

		if (num1 > num2 && num1 > num3 && num1 > num4 && num1 > num5) {
			System.out.println("Maior número: " + num1);
		} else if (num2 > num1 && num2 > num3 && num2 > num4 && num2 > num5) {
			System.out.println("Maior número: " + num2);
		} else if (num3 > num1 && num3 > num2 && num3 > num4 && num3 > num5) {
			System.out.println("Maior número: " + num3);
		} else if (num4 > num1 && num4 > num2 && num4 > num3 && num4 > num5) {
			System.out.println("Maior número: " + num4);
		} else if (num5 > num1 && num5 > num2 && num5 > num3 && num5 > num4) {
			System.out.println("Maior número: " + num5);
		}*/
		
		int num;
		int maior = Integer.MIN_VALUE;
		 
		for (int i=0; i < 5; i++) { 
			System.out.println("Informe o " + (i + 1) + "º número: "); 
			num = scan.nextInt();
			if (num > maior) {
				maior = num;
			}
		}
		System.out.println("Maior número informado: " + maior);
	}

}
