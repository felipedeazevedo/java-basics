package com.felipe.cursojava.aula14.exercicios;

import java.util.Scanner;

public class Exercicio9 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Informe três números: ");
		int num1 = scan.nextInt();
		int num2 = scan.nextInt();
		int num3 = scan.nextInt();
		
		// abc, acb, bac, bca, cba, cab
		if (num1 <= num2 && num1 <= num3 && num2 <= num3){
			System.out.println("Ordem decrescente: " + num3 + ", " + num2 + ", " + num1);
		} else if (num1 <= num2 && num1 <= num3 && num3 <= num2){
			System.out.println("Ordem decrescente: " + num2 + ", " + num3 + ", " + num1);
		} else if (num2 <= num1 && num2 <= num3 && num1 <= num3){
			System.out.println("Ordem decrescente: " + num3 + ", " + num1 + ", " + num2);
		} else if (num2 <= num1 && num2 <= num3 && num3 <= num1){
			System.out.println("Ordem decrescente: " + num1 + ", " + num3 + ", " + num3);
		} else if (num3 <= num1 && num3 <= num2 && num1 <= num2){
			System.out.println("Ordem decrescente: " + num2 + ", " + num1 + ", " + num3);
		} else if (num3 <= num1 && num3 <= num2 && num2 <= num1){
			System.out.println("Ordem decrescente: " + num1 + ", " + num2 + ", " + num3);
		} 
	}

}
