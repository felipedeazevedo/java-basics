package com.felipe.cursojava.aula14.exercicios;

import java.util.Scanner;

public class Exercicio17 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Informe o ano:");
		int ano = scan.nextInt();
		
		if ((ano % 4 == 0 && ano % 100 != 0) || (ano % 400 == 0)) {
			System.out.println("É um ano bissexto.");
		} else {
			System.out.println("Não é bissexto.");
		}
	}

}
