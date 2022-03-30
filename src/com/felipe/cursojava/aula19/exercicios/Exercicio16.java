package com.felipe.cursojava.aula19.exercicios;

import java.util.Scanner;

public class Exercicio16 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int[] a = new int[10];
		int somaMenorQueQuinze = 0, numQuinze = 0, soma = 0, qtdElementosMaiorQueQuinze = 0;
		double media = 0;
		
		for (int i = 0; i < a.length; i++) {
			System.out.println("Entre com um número:");
			a[i] = scan.nextInt();
			if (a[i] < 15) {
				somaMenorQueQuinze += a[i];
			} else if (a[i] == 15) {
				numQuinze++;
			} else if (a[i] > 15) {
				qtdElementosMaiorQueQuinze++;
				soma += a[i];
			}
		}
		media = soma / qtdElementosMaiorQueQuinze;
		
		System.out.println(somaMenorQueQuinze + " é a soma dos elementos inferiores a 15.");
		System.out.println(numQuinze + " é a quantidade de elementos iguais a quinze.");
		System.out.println(media + " é a média dos elementos superiores a 15.");
	}

}
