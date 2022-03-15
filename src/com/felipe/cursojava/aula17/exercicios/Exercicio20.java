package com.felipe.cursojava.aula17.exercicios;

import java.util.Scanner;

public class Exercicio20 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.println("Entre com o número de pessoas");
		int pessoas = scan.nextInt();
		
		int soma = 0;
		int idade;
		
		for (int i=0; i<pessoas; i++) {
			
			System.out.print("Informe a idade da pessoa " + (i+1) + ": ");
			idade = scan.nextInt();
			
			soma += idade; 
		}
		
		double media = soma / pessoas;
		
		System.out.println("Média de idade: " + media);
		
		if (media >= 0 && media <= 25) {
			System.out.println("Turma jovem.");
		} else if (media > 25 && media <= 60) {
			System.out.println("Turma adulta.");
		} else if (media > 60) {
			System.out.println("Turma idosa.");
		}
	}

}
