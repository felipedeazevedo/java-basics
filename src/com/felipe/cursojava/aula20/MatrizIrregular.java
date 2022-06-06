package com.felipe.cursojava.aula20;

import java.util.Scanner;

public class MatrizIrregular {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Entre com o número de pessoas que serão entrevistadas: ");
		int numEntrevistados = scan.nextInt();
		
		String[][] nomesFilhos = new String[numEntrevistados][];
		
		for (int i = 0; i < nomesFilhos.length; i++) {
			System.out.println("Entre com a quantidade de filhos da " + (i + 1) + "ª pessoa: ");
			int qtdFilhos = scan.nextInt();
			
			// Precisamos criar essa instância senão o espaço não será alocado na memória.
			nomesFilhos[i] = new String[qtdFilhos];
			
			for (int j = 0; j < nomesFilhos[i].length; j++) {
				System.out.println("Informe o nome do filho " + (j + 1) + ": ");
				nomesFilhos[i][j] = scan.next();
			}
		}
		
		for (int i = 0; i < nomesFilhos.length; i++) {
			System.out.println("A pessoa " + (i + 1) + " tem " + nomesFilhos[i].length + " filhos");
			for (int j = 0; j < nomesFilhos[i].length; j++) {
				System.out.println(nomesFilhos[i][j]);
			}
		}
	}

}
