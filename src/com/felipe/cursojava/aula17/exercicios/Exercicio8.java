package com.felipe.cursojava.aula17.exercicios;

import java.util.Scanner;

public class Exercicio8 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int num;
		int soma = 0;
		double media;
		 
		for (int i=0; i < 5; i++) { 
			System.out.println("Informe o " + (i + 1) + "º número: "); 
			num = scan.nextInt();
			soma += num; 
		}
		
		media = soma / 5;
		
		System.out.println("Soma dos números é: " + soma);
		System.out.println("Média dos números é: " + media);
	}

}
