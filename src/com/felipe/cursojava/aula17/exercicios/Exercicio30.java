package com.felipe.cursojava.aula17.exercicios;

import java.util.Scanner;

public class Exercicio30 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner (System.in);
		
		System.out.println("Informe um  número:");
		int num = scan.nextInt();
		
		boolean invalido;
		int comeco, fim;
		
		do {
			System.out.print("Começar por: ");
			comeco = scan.nextInt();
			
			System.out.print("Terminar em: ");
			fim = scan.nextInt();
			
			invalido = false;
			
			if (fim < comeco) {
				invalido = true;
				System.out.println("O comeco deve ser maior que o final!");
			}
			
		} while (invalido);
		
		System.out.println("Mostrar tabuada de: " + num);
		for (int i = comeco; i <= fim; i++) {
			System.out.println(num + " x " + i + " = " + (num * i));
		}
	}

}
