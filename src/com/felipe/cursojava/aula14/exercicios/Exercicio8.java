package com.felipe.cursojava.aula14.exercicios;

import java.util.Scanner;

public class Exercicio8 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Informe os preços de três produtos: ");
		double preco1 = scan.nextDouble();
		double preco2 = scan.nextDouble();
		double preco3 = scan.nextDouble();
		
		int produdoMaisBarato = 0;
		
		if (preco1 <= preco2 && preco1 <= preco3){
			//produdoMaisBarato = 1;
			System.out.println("Você deve compar o produto 1.");
		} else if (preco2 <= preco1 && preco2 <= preco3){
			//produdoMaisBarato = 2;
			System.out.println("Você deve compar o produto 2.");
		} else if(preco3 <= preco1 && preco3 <= preco2){
			//produdoMaisBarato = 3;
			System.out.println("Você deve compar o produto 3.");
		}
		
		//System.out.println("Você deve compar o " + produdoMaisBarato + "° produto.");
	}

}
