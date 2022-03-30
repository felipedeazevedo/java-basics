package com.felipe.cursojava.aula17.exercicios;

import java.util.Scanner;

public class Exercicio15 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Entre com o n-ésimo termo da sequência de Fibonacci");
		int n = scan.nextInt();
		
		int primeiro = 1;
		int segundo = 1;
		int proximo;
		
		System.out.println(primeiro);
		System.out.println(segundo);
		
		for (int i=3; i<=n; i++) {
			proximo = primeiro + segundo;
			primeiro = segundo;
			segundo = proximo;
			
			System.out.println(proximo);
		}
	}

}
