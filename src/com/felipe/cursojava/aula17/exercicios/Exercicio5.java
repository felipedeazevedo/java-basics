package com.felipe.cursojava.aula17.exercicios;

import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {
		
		
		boolean infoValida = false;

		Scanner scan = new Scanner (System.in);
		
		int pop1, pop2;
		double percentual1, percentual2;
		
		do {
			System.out.println("Informe a populacao 1");
			pop1 = scan.nextInt();
			
			if (pop1 > 0) {
				infoValida = true;
			} else {
				System.out.println("População inválida.");
			}
		} while (!infoValida);
		
		infoValida = false;
		
		do {
			System.out.println("Informe a taxa de crescimento 1");
			percentual1 = scan.nextDouble();
			
			if (percentual1 > 0) {
				infoValida = true;
			} else {
				System.out.println("Taxa de crescimento inválida.");
			}
		} while (!infoValida);

		infoValida = false;
		
		do {
			System.out.println("Informe a populacao 2");
			pop2 = scan.nextInt();
			
			if (pop2 > 0) {
				infoValida = true;
			} else {
				System.out.println("População inválida.");
			}
		} while (!infoValida);
		
		infoValida = false;
		
		do {
			System.out.println("Informe a taxa de crescimento 2");
			percentual2 = scan.nextDouble();
			
			if (percentual2 > 0) {
				infoValida = true;
			} else {
				System.out.println("Taxa de crescimento inválida.");
			}
		} while (!infoValida);
		
		int count = 0;
		
		while (pop1 < pop2) {
			pop1 += pop1 * (percentual1 / 100);
			pop2 += pop2 * (percentual2 / 100);
			count++;
		}
		
		System.out.println("Quantidade de anos: " + count);
	}

}
