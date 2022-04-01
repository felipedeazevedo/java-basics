package com.felipe.cursojava.aula19.exercicios;

import java.util.Scanner;

public class Exercicio20 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		double cotacaoDolar;
		
		System.out.println("Informe a cotação do dólar em relação ao real: ");
		cotacaoDolar = scan.nextDouble();
		
		double[] a = new double[20];
		
		for (int i = 1; i <= 20; i++) {
				a[i-1] = cotacaoDolar * i;
		}
		
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
	}

}
