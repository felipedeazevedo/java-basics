package com.felipe.cursojava.aula17.exercicios;

import java.util.Scanner;

public class Exercicio32 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		boolean pararPrograma = false;
		int codigo, quantidade;
		String encerrar;
		String output = "";
		double total = 0;
		
		do {
			System.out.println("Informe o código do produto:");
			codigo = scan.nextInt();
			
			System.out.println("Informe a quantidade do produto: ");
			quantidade = scan.nextInt();
			
			System.out.println("Deseja encerrar o programa? s/n");
			encerrar = scan.next();
			
			
			switch(codigo){
			case 100: 
				output += "Cachorro quente - 1,20 * " + quantidade; 
				output += " = " + (1.2 * quantidade) + "\n";
				total += 1.2 * quantidade;
				break;
			case 101: 
				output += "Bauru simples - 1,30 * " + quantidade; 
				output += " = " + (1.3 * quantidade) + "\n";
				total += 1.3 * quantidade;
				break;
			case 102: 
				output += "Bauru com ovo - 1,50 * " + quantidade; 
				output += " = " + (1.5 * quantidade) + "\n"; 
				total += 1.5 * quantidade;
				break;
			case 103: 
				output += "Hambúrguer - 1,20 * " + quantidade; 
				output += " = " + (1.2 * quantidade) + "\n"; 
				total += 1.2 * quantidade;
				break;
			case 104: 
				output += "Cheeseburguer - 1,30 * " + quantidade; 
				output += " = " + (1.3 * quantidade) + "\n"; 
				total += 1.3 * quantidade;
				break;
			case 105: 
				output += "Refrigerante - 1,00 * " + quantidade; 
				output += " = " + (1 * quantidade) + "\n"; 
				total += 1 * quantidade;
				break;
			}
					
			if (encerrar.equalsIgnoreCase("s")) {
				pararPrograma = true;
				output += "Total a pagar " + total;
			}
		} while (!pararPrograma);
		
		System.out.println(output);
	}

}
