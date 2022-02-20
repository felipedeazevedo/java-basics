package com.felipe.cursojava.aula14.exercicios;

import java.util.Scanner;

public class Exercicio7 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Informe três números: ");
		int num1 = scan.nextInt();
		int num2 = scan.nextInt();
		int num3 = scan.nextInt();
		
		if (num1 >= num2 && num1 >= num3) {
			System.out.println("Maior número: " + num1);
		} else if (num2 >= num1 && num2 >= num3){
			System.out.println("Maior número: " + num2);
		} else if(num3 >= num1 && num3 >= num2){
			System.out.println("Maior número: " + num3);
		}
		
		if (num1 <= num2 && num1 <= num3) {
			System.out.println("Menor número: " + num1);
		} else if (num2 <= num1 && num2 <= num3){
			System.out.println("Menor número: " + num2);
		} else if(num3 <= num1 && num3 <= num2){
			System.out.println("Menor número: " + num3);
		}
	}

}
