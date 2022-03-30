package com.felipe.cursojava.aula14.exercicios;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
	
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Informe um número:");
		int numero = scan.nextInt();
		
		if (numero >= 0) {
			System.out.println("O número informado é positivo");
		} else {
			System.out.println("O número informado é negativo");
		} 
	}

}
