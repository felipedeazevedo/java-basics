package com.felipe.cursojava.aula14.exercicios;

import java.util.Scanner;

public class Exercicio11 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.println("Informe o salário do colaborador:");
		double salario = scan.nextDouble();
		
		int percentualAumento = 0;
		
		if (salario <= 280) {
			percentualAumento = 20;
		} else if(salario > 280 && salario < 700) {
			percentualAumento = 15;
		} else if(salario >= 700 && salario < 1500) {
			percentualAumento = 10;
		} else if(salario > 1500) {
			percentualAumento = 5;
		} 
		
		double valorAumento = (salario / 100) * percentualAumento;
		double novoSalario = salario + valorAumento;
		
		System.out.println("Salário antes do reajute: " + salario);
		System.out.println("Percentual de aumento aplicado: " + percentualAumento);
		System.out.println("Valor do aumento: " + valorAumento);
		System.out.println("Salário após aumento: " + novoSalario);
	}

}
