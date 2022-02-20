package com.felipe.cursojava.aula14.exercicios;

import java.util.Scanner;

public class Exercicio22 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Informe a quantidade de morangos adquiridos (em Kg):");
		double quiloMorango = scan.nextDouble();
		
		System.out.println("Informe a quantidade de maçãs adquiridos (em Kg):");
		double quiloMaca = scan.nextDouble();
		
		double precoMorango = 0;
		double precoMaca = 0;
		
		if (quiloMorango <= 5){
			precoMorango = 2.5;
		} else {
			precoMorango = 2.2;
		}
		
		if (quiloMorango <= 5){
			precoMaca = 1.8;
		} else {
			precoMaca = 1.5;
		}
		
		double valorCompraMorango = precoMorango *  quiloMorango;
		double valorCompraMaca = precoMaca *  quiloMaca;
		double valorFinalMorango = 0;
		double valorFinalMaca = 0;
		
		if ((quiloMorango + quiloMaca > 8) || (valorCompraMorango + valorCompraMaca > 25)){
			valorFinalMorango = valorCompraMorango - (valorCompraMorango * 0.1);
			valorFinalMaca = valorCompraMaca - (valorCompraMaca * 0.1);
			System.out.println("Valor da compra: " + (valorFinalMorango + valorFinalMaca));
		} else {
			System.out.println("Valor da compra: " + (valorCompraMorango + valorCompraMaca));
		}
	}

}
