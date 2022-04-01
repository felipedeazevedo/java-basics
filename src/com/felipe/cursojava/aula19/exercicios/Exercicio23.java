package com.felipe.cursojava.aula19.exercicios;

import java.util.Scanner;

public class Exercicio23 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int[] vetorA = new int[10];
		
		for (int i = 0; i < vetorA.length; i++) {
			System.out.println("Informe o valor da posição " + i + ": ");
			vetorA[i] = scan.nextInt();
		}
		
		System.out.println("Percorrendo os valores do vetor...");
		
		for (int i = 0; i < vetorA.length; i++) {
			System.out.println("Posição " + i + " = " + vetorA[i]);
			if (vetorA[i] % 2 != 0) {
				System.out.println("Valor ímpar encontrado! O programa será encerrado.");
				break;
			}
		}
	}

}
