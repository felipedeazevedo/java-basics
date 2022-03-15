package com.felipe.cursojava.aula17.exercicios;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		
		String nome, sexo, estadoCivil;
		int idade;
		double salario;
		
		boolean infoValida = false;
		
		do {
			System.out.println("Informe seu nome:");
			nome = scan.next();
			
			if (nome.length() > 3) {
				infoValida = true;
			} else {
				System.out.println("Nome deve ter no mínimo 3 caracteres.");
			}
		} while (!infoValida);
		
		// Reaproveitando a flag enquanto o while é realizado para validação das informações
		infoValida = false;
		do {
			System.out.println("Informe sua idade:");
			idade = scan.nextInt();
			
			if (idade >= 0 && idade <= 150) {
				infoValida = true;
			} else {
				System.out.println("Idade deve ser entre 0 e 150.");
			}
		} while (!infoValida);
		
		infoValida = false;
		do {
			System.out.println("Informe seu salário:");
			salario = scan.nextDouble();
			
			if (salario > 0) {
				infoValida = true;
			} else {
				System.out.println("Salário deve ser maior que 0.");
			}
		} while (!infoValida);
		
		infoValida = false;
		do {
			System.out.println("Informe seu sexo (f/m):");
			sexo = scan.next();
			
			if (sexo.equalsIgnoreCase("f") || sexo.equalsIgnoreCase("m")) {
				infoValida = true;
			} else {
				System.out.println("Sexo inválido!");
			}
		} while (!infoValida);
		
		infoValida = false;
		do {
			System.out.println("Informe seu estado civil:");
			estadoCivil = scan.next();
			
			if (estadoCivil.equalsIgnoreCase("s") || estadoCivil.equalsIgnoreCase("c") || estadoCivil.equalsIgnoreCase("v") || estadoCivil.equalsIgnoreCase("d")) {
				infoValida = true;
			} else {
				System.out.println("Estado civil inválido!");
			}
		} while (!infoValida);
		
		System.out.println("Nome: " + nome);
		System.out.println("Idade: " + idade);
		System.out.println("Salário: " + salario);
		System.out.println("Sexo: " + sexo);
		System.out.println("Estado civil: " + estadoCivil);
		
		/*do {
			System.out.println("Informe seu nome:");
			String nome = scan.next();
			
			if (nome.length() <= 3) {
				System.out.println("Nome muito curto!");
			} else {
				nomeValido = true;
				System.out.println("Nome válido!");
			}
			
			System.out.println("Informe sua idade:");
			int idade = scan.nextInt();
			
			if (idade < 0 || idade > 150) {
				System.out.println("Idade inválida!");
			} else {
				idadeValida = true;
				System.out.println("Idade válida!");
			}
			
			System.out.println("Informe seu salário:");
			double salario = scan.nextDouble();
			
			if (salario < 0) {
				System.out.println("Salário inválido!");
			} else {
				salarioValido = true;
				System.out.println("Salário válido!");
			}
			
			System.out.println("Informe seu sexo (f/m):");
			String sexo = scan.next();
			
			if (!sexo.equalsIgnoreCase("f") || !sexo.equalsIgnoreCase("m")) {
				System.out.println("Sexo inválido!");
			} else {
				sexoValido = true;
				System.out.println("Sexo válido!");
			}
			
			System.out.println("Informe seu estado civil:");
			String estadoCivil = scan.next();
			
			if (!estadoCivil.equalsIgnoreCase("s") || !estadoCivil.equalsIgnoreCase("c") || !estadoCivil.equalsIgnoreCase("v") || !estadoCivil.equalsIgnoreCase("d")) {
				System.out.println("Estado civil inválido!");
			} else {
				estadoCivilValido = true;
				System.out.println("Estado civil válido!");
			}
		} while (!nomeValido || !idadeValida || !salarioValido || !sexoValido || !estadoCivilValido);*/
	}

}
