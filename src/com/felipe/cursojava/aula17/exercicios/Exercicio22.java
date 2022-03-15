package com.felipe.cursojava.aula17.exercicios;

import java.util.Scanner;

public class Exercicio22 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Informe a quantidade de CD's:");
		int cds = scan.nextInt();
		
		double preco;
		double valorTotal = 0;
		
		for (int i = 0; i < cds; i++) {
			System.out.println("Informe o preço do " + (i + 1) + "º CD:");
			preco = scan.nextDouble();
			valorTotal += preco;
		}
		
		double media = valorTotal / cds;
		
		System.out.println("Total gasto: " + valorTotal);
		System.out.println("A média de valor dos CD's é: " + media);
	}

}
