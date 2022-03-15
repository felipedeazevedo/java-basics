package com.felipe.cursojava.aula17.exercicios;

import java.util.Scanner;

public class Exercicio19 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		
		System.out.println("Entre com o número de notas");
		int notas = scan.nextInt();
		
		double soma = 0;
		double nota;
		
		for (int i=0; i<notas; i++) {
			
			System.out.print("Informe a nota " + (i + 1) + ": ");
			nota = scan.nextDouble();
			
			soma += nota; 
		}
		
		double media = soma / notas;
		
		System.out.println("Média aritmética: " + media);
	}

}
