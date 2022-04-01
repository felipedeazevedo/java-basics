package com.felipe.cursojava.aula19.exercicios;

import java.util.Scanner;

public class Exercicio19 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		double[] notas1 = new double[10];
		double[] notas2 = new double[notas1.length];
		double[] results = new double[notas1.length];
		
		for (int i = 0; i < notas1.length; i++) {
			System.out.println("Informe a nota 1 do aluno " + (i + 1) + ": ");
			notas1[i] = scan.nextDouble();
			System.out.println("Informe a nota 2 do aluno " + (i + 1) + ": ");
			notas2[i] = scan.nextDouble();
			
			results[i] = (notas1[i] + notas2[i]) / 2;
		}

		for (int i = 0; i < results.length; i++) {
			if (results[i] < 7) {
				System.out.println("Média do aluno " + (i + 1) + ": " + results[i]);
				System.out.println("Status: reprovado");
			} else {
				System.out.println("Média do aluno " + (i + 1) + ": " + results[i]);
				System.out.println("Status: aprovado");
			}
		}
	}

}
