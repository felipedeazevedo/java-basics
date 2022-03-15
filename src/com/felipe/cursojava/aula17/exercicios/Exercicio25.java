package com.felipe.cursojava.aula17.exercicios;

import java.util.Scanner;

public class Exercicio25 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		String novaCompra;
		boolean sair = false;
		int qtdProdutos = 0;
		double preco;
		double total;
		String output;
		double valorPago;
		double troco;
		
		do {
			
			System.out.println("Deseja informar uma nova compra? S/N");
			novaCompra = scan.next();
			
			if (novaCompra.equalsIgnoreCase("s")) {
				
				output = "Lojas Tabajara\n";
				
				System.out.println("Informe a quantidade de produtos:");
				qtdProdutos = scan.nextInt();
				
				total = 0;
				
				for (int i = 1; i <= qtdProdutos; i++) {
					System.out.println("Informe o preco do produto " + i + ":");
					preco = scan.nextDouble();
					total += preco;
					output += "Produto " + i + ": R$ " + preco + "\n";
				}
				
				output = "Total: " + total + "\n";
				System.out.println("Total: " + total);
				
				System.out.println("Informe o valor pago:");
				valorPago = scan.nextDouble();
				
				output += "Dinheiro: R$" + valorPago + "\n";
				
				troco = valorPago - total;
				
				System.out.println("Troco: " + troco);
				
				System.out.println(output);
				
			} else {
				sair = true;
			}
		} while (!sair);
		
		System.out.println("Programa encerrado!");
	}

}
