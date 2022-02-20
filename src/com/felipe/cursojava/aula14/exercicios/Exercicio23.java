package com.felipe.cursojava.aula14.exercicios;

import java.util.Scanner;

public class Exercicio23 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Informe o tipo de carne a ser comprado (1: Filé Duplo / 2: Alcatra / 3: Picanha):");
		int tipo = scan.nextInt();
		
		System.out.println("Informe a quantidade de carne que deseja comprar (em Kg):");
		double qtdCarne = scan.nextDouble();
		
		System.out.println("Informe se deseja pagar com o cartão Tabajara (s/n):");
		String isCartao = scan.next();
		
		double valorCompra = 0;
		
		switch(tipo) {
		case 1:
			
			System.out.println("Tipo de carne: " + tipo);
			
			if(qtdCarne <= 5) {
				valorCompra = qtdCarne * 4.90;
			} else {
				valorCompra = qtdCarne * 5.80;
			}
			break;
		case 2:
			
			System.out.println("Tipo de carne: " + tipo);
			
			if(qtdCarne <= 5) {
				valorCompra = qtdCarne * 5.90;
			} else {
				valorCompra = qtdCarne * 6.80;
			}
			break;
		case 3: 
			
			System.out.println("Tipo de carne: " + tipo);
			
			if(qtdCarne <= 5) {
				valorCompra = qtdCarne * 6.90;
			} else {
				valorCompra = qtdCarne * 7.80;
			}
			break;
		default: System.out.println("Tipo de carne inválido!");
		}
		
		double precoFinal = 0;
		
		if (isCartao.equalsIgnoreCase("s")) {
			precoFinal = valorCompra - (valorCompra * 0.05);
		} else {
			precoFinal = valorCompra;
		}
		
		System.out.println("Quantidade de carne: " + qtdCarne);
		System.out.println("Preco total: " + valorCompra);
		switch(isCartao) {
		case "s": 
		case "S": System.out.println("Tipo de pagamento: cartão Tabajara"); break;
		case "n":
		case "N": 
		default: System.out.println("Tipo de pagamento: outros");
		}
		if (isCartao.equalsIgnoreCase("s"))
			System.out.println("Valor do desconto: " + (valorCompra * 0.05));
		
		System.out.println("Valor a pagar: " + precoFinal);
	}

}
