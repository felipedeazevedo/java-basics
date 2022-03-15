package com.felipe.cursojava.aula17.exercicios;

import java.util.Scanner;

public class Exercicio27 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		boolean continuar = true;
		double temperatura;
		String novaEntrada;
		double maior = Double.MIN_VALUE;
		double  menor = Double.MAX_VALUE;
		double total = 0;
		int count = 0;
		
		do {
			System.out.println("Informe uma temperatura:");
			temperatura = scan.nextDouble();
			total += temperatura;
			count++;
			
			if (temperatura > maior) {
				maior = temperatura;
			}
			
			if (temperatura < menor) {
				menor = temperatura;
			}
			
			System.out.println("Deseja informar outra? S/N");
			novaEntrada = scan.next(); 
			
			if (!novaEntrada.equalsIgnoreCase("s")) {
				continuar = false;
			} 
			
		} while (continuar);
		
		double media = total / count;
		
		System.out.println("Menor temperatura: " + menor);
		System.out.println("Maior temperatura: " + maior);
		System.out.println("Média de temperaturas: " + media);
	}

}
