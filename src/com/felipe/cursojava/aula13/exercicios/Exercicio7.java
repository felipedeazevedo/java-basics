package com.felipe.cursojava.aula13.exercicios;

import java.util.Scanner;

public class Exercicio7 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Informe o tamanho do lado do quadrado: ");
		double ladoQuadrado = scan.nextDouble();
		
		double areaQuadrado = Math.pow(ladoQuadrado, 2);
		System.out.println("A área do quadrado é: " + areaQuadrado);
		System.out.println("O dobro da área do quadrado é: " + (areaQuadrado * 2));
	}

}
