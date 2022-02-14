package com.felipe.cursojava.aula13.exercicios;

import java.util.Scanner;

public class Exercicio8 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Quanto você ganha por hora? ");
		double valorHora = scan.nextDouble();
		
		System.out.println("Qual a quantidade de horas trabalhadas no mês? ");
		int horasTrabalhadas = scan.nextInt();
		
		double salario = valorHora * horasTrabalhadas;
		System.out.println("Seu salário nesse mês é: " + salario);

	}

}
