package com.felipe.cursojava.aula14.exercicios;

import java.util.Scanner;

public class Exercicio21 {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Informe a quantidade de litros vendidos:");
		double litros = scan.nextDouble();
		
		System.out.println("Informe o tipo de combustível vendido (A - álcool / G - Gasolina):");
		String tipo = scan.next();
		
		double desconto = 0;
		double precoSemDesconto = 0;
		double precoFinal = 0;
		
		if (tipo.equalsIgnoreCase("g")) {
			if (litros <= 20) {
				desconto = 3;
			} else {
				desconto = 5;
			}
		} else if (tipo.equalsIgnoreCase("a")) {
			if (litros <= 20) {
				desconto = 4;
			} else {
				desconto = 6;
			}
		} else {
			System.out.println("Tipo inválido!");
		}
		
		if (tipo.equalsIgnoreCase("g")) {
			precoSemDesconto = (2.50 * litros);
			precoFinal = precoSemDesconto - (precoSemDesconto  * (desconto / 100));
			System.out.println("Preço a ser pago pelo cliente: " + precoFinal);
		} else if (tipo.equalsIgnoreCase("a")) {
			precoSemDesconto = (1.90 * litros);
			precoFinal = precoSemDesconto - (precoSemDesconto * (desconto / 100));
			System.out.println("Preço a ser pago pelo cliente: " + precoFinal);
		} else {
			System.out.println("Incapaz de calcular o valor!");
		}

	}

}
