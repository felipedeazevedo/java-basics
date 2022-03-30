package com.felipe.cursojava.aula14.exercicios;

import java.util.Scanner;

public class Exercicio14 {

	public static void main(String[] args) {
		 
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Informa a primeira nota: ");
		double nota1 = scan.nextDouble();
		
		System.out.println("Informa a segunda nota: ");
		double nota2 = scan.nextDouble();
		
		double media = (nota1 + nota2) / 2;
		
		String conceito = "";
		
		if (media >= 9 && media <= 10) {
			conceito = "A";
		} else if (media < 9 && media >= 7.5) {
			conceito = "B";
		} else if (media < 7.5 && media >= 6) {
			conceito = "C";
		} else if (media < 6 && media >= 4) {
			conceito = "D";
		} else if (media < 4) {
			conceito = "E";
		}
		
		String status;
		
		if (conceito.equals("A") || conceito.equals("B") || conceito.equals("C")) {
			status = "APROVADO";
		} else {
			status = "REPROVADO";
		}
		
		System.out.println("Primeira nota obtida: " + nota1);
		System.out.println("Segunda nota obtida: " + nota2);
		System.out.println("Média obtida: " + media);
		System.out.println("Conceito: " + conceito);
		System.out.println("Status: " + status);
	}

}
