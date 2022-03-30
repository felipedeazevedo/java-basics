package com.felipe.cursojava.aula13.exercicios;

import java.util.Scanner;

public class Exercicio6 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Informa o raio do círculo: ");
		double raio = scan.nextDouble();
		
		double areaCirculo = Math.PI * Math.pow(raio, 2);
		System.out.println("A área do círculo é: " + areaCirculo);
	}

}
