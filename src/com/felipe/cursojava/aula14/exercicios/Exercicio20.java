package com.felipe.cursojava.aula14.exercicios;

import java.util.Scanner;

public class Exercicio20 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Telefonou para a vítima?(s/n)");
		String resposta1 = scan.next();
		
		System.out.println("Esteve no local do crime?(s/n)");
		String resposta2 = scan.next();
		
		System.out.println("Mora perto da vítima?(s/n)");
		String resposta3 = scan.next();
		
		System.out.println("Devia para a vítima?(s/n)");
		String resposta4 = scan.next();
		
		System.out.println("Já trabalhou com a vítima?(s/n)");
		String resposta5 = scan.next();
		
		int contador = 0;
		
		if (resposta1.equalsIgnoreCase("s")){
			contador++;
		}
		if (resposta2.equalsIgnoreCase("s")){
			contador++;
		}
		if (resposta3.equalsIgnoreCase("s")){
			contador++;
		}
		if (resposta4.equalsIgnoreCase("s")){
			contador++;
		}
		if (resposta5.equalsIgnoreCase("s")){
			contador++;
		}
		
		switch(contador) {
		case 1: break; 
		case 2: System.out.println("Suspeita"); break;
		case 3: 
		case 4: System.out.println("Cúmplice"); break;
		case 5: System.out.println("Assasino"); break;
		default: System.out.println("Não tem envolvimento.");
		}
	}

}
