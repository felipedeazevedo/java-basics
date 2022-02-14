package com.felipe.cursojava.aula13.exercicios;

import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Informe a quantidade de metros: ");
		double metros = scan.nextDouble();
		
		double centimetros = metros * 100;
		
		System.out.println("Centímetros = " + centimetros);
	}

}
