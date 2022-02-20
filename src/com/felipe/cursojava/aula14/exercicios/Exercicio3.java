package com.felipe.cursojava.aula14.exercicios;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Informe uma letra (F ou M):");
		/*char letra = scan.next().charAt(0);
		
		switch(letra){
		case 'f': 
		case 'F': System.out.println("F - Feminino"); break;
		case 'm': 
		case 'M': System.out.println("M - Masculino"); break;
		default: System.out.println("Sexo inválido");
		}*/
		
		String input = scan.next();
		
		if (input.equalsIgnoreCase("f")){
			System.out.println("F - feminino");
		} else if (input.equalsIgnoreCase("m")){
			System.out.println("M - masculino");
		} else {
			System.out.println("Sexo inválido");
		}

	}

}
