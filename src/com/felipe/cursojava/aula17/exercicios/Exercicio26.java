package com.felipe.cursojava.aula17.exercicios;

import java.util.Scanner;

public class Exercicio26 {

	public static void main(String[] args) {
		
Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite um número:");
		int num = scan.nextInt();
		
		System.out.println("Fatorial de: " + num);
		
		System.out.print(num + "! = ");
		
		int fatorial = 1;
		
		for (int i=num; i > 1; i--) {
			// fatorial = fatorial * i;
			fatorial *= i;
			System.out.print(i + " . ");
		}
		
		System.out.println("1 = " + fatorial);
	}

}
