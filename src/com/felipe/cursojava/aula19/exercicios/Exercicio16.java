package com.felipe.cursojava.aula19.exercicios;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercicio16 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int[] a = new int[10];
		int somaMenor15 = 0, igual15 = 0, qtdMaior15 = 0;
		double media = 0, somaMaior15 = 0;
		
		for (int i = 0; i < a.length; i++) {
			System.out.println("Entre com um número:");
			a[i] = scan.nextInt();
			if (a[i] < 15) {
				somaMenor15 += a[i];
			} else if (a[i] == 15) {
				igual15++;
			} else if (a[i] > 15) {
				qtdMaior15++;
				somaMaior15 += a[i];
			}
		}
		
		DecimalFormat df = new DecimalFormat("###,###.##");
		
		media = somaMaior15 / qtdMaior15;
		
		System.out.println(somaMenor15 + " é a soma dos elementos inferiores a 15.");
		System.out.println(igual15 + " é a quantidade de elementos iguais a quinze.");
		System.out.println(df.format(media) + " é a média dos elementos superiores a 15.");
	}

}
