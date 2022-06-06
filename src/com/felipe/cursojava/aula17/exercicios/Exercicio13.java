package com.felipe.cursojava.aula17.exercicios;

import java.util.Scanner;

public class Exercicio13 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Informe a base");
		int base = scan.nextInt();
		
		System.out.println("Informe o expoente");
		int expoente = scan.nextInt();
		
		int resultado = base;
		
		for (int i=1; i<expoente; i++) {
			resultado = resultado * base;
		}
		
		System.out.println("Resultado = " + resultado);
	}

}
