package com.felipe.cursojava.aula17.exercicios;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		boolean senhaValida = false;
		
		String nomeUsuario;
		String senhaUsuario;
		
		do {
			System.out.println("Informe o nome do usuário:");
			nomeUsuario = scan.next();
			
			System.out.println("Informe a senha do usuário:");
			senhaUsuario = scan.next();
			
			if (senhaUsuario.equals(nomeUsuario)) {
				System.out.println("Senha não pode ser igual ao nome de usuário!");
			} else {
				senhaValida = true;
				System.out.println("Usuário e senha válidos!");
			}
		} while (!senhaValida);
		
		/*while (senhaUsuario.equals(nomeUsuario)) {
			System.out.println("Senha inválida! Informe outra:");
			senhaUsuario = scan.next();
		}*/

	}

}
