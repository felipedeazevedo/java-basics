package com.felipe.cursojava.aula14.exercicios;

import java.util.Scanner;

public class Exercicio15 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Informe o tamanho do primeiro lado:");
		int lado1 = scan.nextInt();
		
		System.out.println("Informe o tamanho do segundo lado:");
		int lado2 = scan.nextInt();
		
		System.out.println("Informe o tamanho do terceiro lado:");
		int lado3 = scan.nextInt();
		
		if (((lado1 + lado2) > lado3) || ((lado2 + lado3) > lado1) || ((lado1 + lado3) > lado2)) {
			if (lado1 == lado2 && lado2 == lado3 && lado1 == lado3) {
				System.out.println("É um triângulo equilátero.");
			} else if (lado1 == lado2 || lado2 == lado3 || lado3 == lado1) {
				System.out.println("É um triângulo isósceles.");
			} else if (lado1 != lado2 && lado2 != lado3 && lado3 != lado1) {
				System.out.println("É um triângulo escaleno.");
			}
		} else {
			System.out.println("Não forma um triângulo.");
		}
	}

}
