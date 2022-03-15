package com.felipe.cursojava.aula17.exercicios;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Informe uma nota entre 0 e 10:");
		double nota = scan.nextDouble();
		
		while (nota < 0 || nota > 10){
			System.out.println("Nota inválida! Informe outra:");
			nota = scan.nextDouble();
		}
	}

}
