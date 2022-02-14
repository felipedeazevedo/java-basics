package com.felipe.cursojava.aula13.exercicios;

import java.util.Scanner;

public class Exercicio11 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Informe o primeiro número inteiro: ");
		int int2 = scan.nextInt();
		
		System.out.println("Informe o segundo número inteiro: ");
		int int1 = scan.nextInt();
		
		System.out.println("Agora informe um número real: ");
		double numReal = scan.nextDouble();
		
		int valor1 = (2 * int1) * (int2 / 2);
		double valor2 = ((3 * int1) + numReal);
		double valor3 = Math.pow(numReal, 3);
		
		System.out.println("O produto do dobro do primeiro com metade do segundo: " + valor1);
		System.out.println("A soma do triplo do primeiro com o terceiro: " + valor2);
		System.out.println("O terceiro elevado ao cubo: " + valor3);
	}

}
