package com.felipe.cursojava.aula13.exercicios;

import java.util.Scanner;

public class Exercicio10 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Informe uma temperatura em Celsius: ");
		double tempCelsius = scan.nextDouble();
		
		double tempFarenheit = (tempCelsius * 1.8) + 32;
		System.out.println("A temperatura em Farenheit é: " + tempFarenheit);
	}

}
