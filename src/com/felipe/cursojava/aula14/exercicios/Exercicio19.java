package com.felipe.cursojava.aula14.exercicios;

import java.util.Scanner;

public class Exercicio19 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Informe o primeiro número:");
		int num1 = scan.nextInt();
		
		System.out.println("Informe o segundo número:");
		int num2 = scan.nextInt();
		
		System.out.println("Qual operação você deseja realizar(+ - / *):");
		String operacao = scan.next();
		
		double resultado = 0;
		boolean valida = true;
		
		switch(operacao) {
		case "+": resultado = num1 + num2; break;
		case "-": resultado = num1 - num2; break;
		case "*": resultado = num1 * num2; break;
		case "/": resultado = num1 / num2; break;
		default: 
			System.out.println("Operação inválida!"); 
			valida = false;
		}
		
		if (valida){
			System.out.println("O resultado é " + resultado);
			
			if(resultado >= 0) {
				System.out.println("Positivo");
			} else {
				System.out.println("Negativo");
			}
			
			if (resultado % 2 == 0) {
				System.out.println("Par");
			} else {
				System.out.println("Ímpar");
			}
		}
	}

}
