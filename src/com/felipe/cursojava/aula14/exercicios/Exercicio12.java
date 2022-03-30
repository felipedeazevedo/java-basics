package com.felipe.cursojava.aula14.exercicios;

import java.util.Scanner;

public class Exercicio12 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Informe o valor da hora:");
		double valorHora = scan.nextDouble();
		
		System.out.println("Informe a quantidade de horas trabalhadas no mês:");
		int horasTrabalhadas = scan.nextInt();
		
		double salarioBruto = valorHora * horasTrabalhadas;
		int percentualDescontoIr = 0;
		
		
		if (salarioBruto <= 900) {
			percentualDescontoIr = 0;
		} else if (salarioBruto > 900 && salarioBruto <= 1500) {
			percentualDescontoIr = 5;
		} else if (salarioBruto > 1500 && salarioBruto <= 2500) {
			percentualDescontoIr = 10;
		} else if (salarioBruto > 2500) {
			percentualDescontoIr = 20;
		}
		
		double valorDescontoIr = (salarioBruto / 100) * percentualDescontoIr;
		double descontoInss = salarioBruto * 0.1;
		double valorFgts = salarioBruto * 0.11;
		double totalDescontos = valorDescontoIr + descontoInss;
		double salarioLiquido = salarioBruto - totalDescontos;
		
		System.out.println("Salário bruto: (" + valorHora + " * " + horasTrabalhadas + "): " + salarioBruto);
		System.out.println("(-) IR (" + percentualDescontoIr + "%): " + valorDescontoIr);
		System.out.println("(-) INSS (10%): " + descontoInss);
		System.out.println("FGTS (11%) : " + valorFgts);
		System.out.println("Total de descontos: " + totalDescontos);
		System.out.println("salário líquido: " + salarioLiquido);
	}

}
