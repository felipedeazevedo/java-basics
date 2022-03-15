package com.felipe.cursojava.aula17.exercicios;

import java.util.Scanner;

public class Exercicio21 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Informe a quantidade de turmas:");
		int turmas = scan.nextInt();
		
		int alunos = 0;
		int totalAlunos = 0;
		
		for (int i = 0; i < turmas; i++) {
			do {
				System.out.println("Informe a quantidade de alunos para a turma " + (i + 1) + ":");
				alunos = scan.nextInt();
			} while (alunos > 40);
			totalAlunos += alunos;
		}
		
		double media = totalAlunos / turmas;
		
		System.out.println("A média de alunos por turma é: " + media);
	}

}
