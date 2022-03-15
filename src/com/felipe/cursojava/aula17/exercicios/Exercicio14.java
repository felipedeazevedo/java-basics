package com.felipe.cursojava.aula17.exercicios;

import java.util.Scanner;

public class Exercicio14 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int num;
		int countPar = 0;
		int countImpar = 0;
		
		for (int i=0; i<10; i++){
			
			System.out.println("Informe um número");
			num = sc.nextInt();
			
			if (num % 2 == 0){
				countPar++;
			} else {
				countImpar++;
			}
		}
		
		System.out.println("Quantidade de números pares: " + countPar);
		System.out.println("Quantidade de números ímpares: " + countImpar);
	}

}
