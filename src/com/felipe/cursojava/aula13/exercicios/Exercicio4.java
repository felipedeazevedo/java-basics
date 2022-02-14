package com.felipe.cursojava.aula13.exercicios;

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Informe a primeira nota: ");
		double nota1 = scan.nextDouble();
		
		System.out.println("Informe a primeira nota: ");
		double nota2 = scan.nextDouble();
		
		System.out.println("Informe a primeira nota: ");
		double nota3 = scan.nextDouble();
		
		System.out.println("Informe a primeira nota: ");
		double nota4 = scan.nextDouble();
		
		double mediaAritmetica = (nota1 + nota2 + nota3 + nota4) / 4;
		System.out.println("Média = " + mediaAritmetica);

	}

}
