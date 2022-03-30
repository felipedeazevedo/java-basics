package com.felipe.cursojava.aula13.exercicios;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Informe o primeiro número: ");
		double numero1 = scan.nextDouble();
		
		System.out.println("Informe o segundo número: ");
		double numero2 = scan.nextDouble();
		
		double soma =  numero1 + numero2;
		System.out.println("Soma = " + soma);
	}

}
