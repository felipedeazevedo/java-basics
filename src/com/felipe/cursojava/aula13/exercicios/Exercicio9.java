package com.felipe.cursojava.aula13.exercicios;

import java.util.Scanner;

public class Exercicio9 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Informe uma temperatura em graus Farenheit: ");
		double tempFarenheit = scan.nextDouble();
		
		double tempCelsius = (5 * (tempFarenheit - 32) / 9);
		System.out.println("Convertendo para Celsius fica: " + tempCelsius);

	}

}
