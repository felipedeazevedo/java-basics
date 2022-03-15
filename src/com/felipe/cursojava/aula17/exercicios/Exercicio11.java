package com.felipe.cursojava.aula17.exercicios;

import java.util.Scanner;

public class Exercicio11 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Informe o primeiro número");
		int num1 = scan.nextInt();
		
		System.out.println("Informe o segundo número");
		int num2 = scan.nextInt();
		
		int soma = 0;
		
		for (int i = num1; i <= num2; soma += i++);
			
		System.out.println(soma);
	}

}