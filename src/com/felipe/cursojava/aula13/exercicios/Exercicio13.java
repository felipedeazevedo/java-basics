package com.felipe.cursojava.aula13.exercicios;

import java.util.Scanner;

public class Exercicio13 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Informe quanto você ganha por hora: ");
		double ganhoHora = scan.nextDouble();
		
		System.out.println("Informe quantas horas foram trabalhada no mês: ");
		double horasTrabalhadas = scan.nextDouble();
		
		double salarioBruto = ganhoHora * horasTrabalhadas;
		double descontoInss = salarioBruto * 0.08;
		double descontoSindicato = salarioBruto * 0.05;
		double descontoIr = salarioBruto * 0.11;
		double totalDescontos = descontoInss + descontoSindicato + descontoIr;
		double salarioLiquido = salarioBruto - totalDescontos;
				
		System.out.println("Salário bruto: " + salarioBruto);
		System.out.println("Quanto pagou para o INSS: " + descontoInss);
		System.out.println("Quanto pagou para o Sindicato: " + descontoSindicato);
		System.out.println("Quanto pagou para o IR: " + descontoIr);
		System.out.println("Total de descontos: " + totalDescontos);
		System.out.println("Salário líquido: " + salarioLiquido);
	}

}
