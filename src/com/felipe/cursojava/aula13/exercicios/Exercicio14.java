package com.felipe.cursojava.aula13.exercicios;

import java.util.Scanner;

public class Exercicio14 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Informe o tamanho do arquivo (em mb): ");
		double tamanhoArquivo = scan.nextDouble();
		
		System.out.println("Informe a velocidade do link de internet (em Mbps): ");
		double velocidadeInternet = scan.nextDouble();
		
		double tempo = tamanhoArquivo / velocidadeInternet;
		
		System.out.println("Tempo de download: " + tempo);
	}

}
