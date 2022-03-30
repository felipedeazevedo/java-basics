package com.felipe.cursojava.aula14.exercicios;

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		System.out.println("Informe uma letra:");
		String letra = scan.next();
		
		
		if (letra.length() > 1) {
			System.out.println("Não é uma letra válida");
		} else {
			switch(letra){
			case "a": 
			case "A": 
			case "e": 
			case "E": 
			case "i": 
			case "I": 
			case "o": 
			case "O": 
			case "u": 
			case "U": System.out.println("Vogal"); break;
			default: System.out.println("Consoante");
			}
		}
	}

}
