package com.felipe.cursojava.aula20.exercicios;

import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		String[][] datas = new String[31][24];
		int dia = 0, hora = 0;
		boolean sair = false;
		byte opcao;
		
		while (!sair) {
			
			System.out.println("Informe a opção desejada:");
			System.out.println("1) Adicionar compromisso");
			System.out.println("2) Verificar compromisso");
			System.out.println("3) Sair do menu");
			
			opcao = scan.nextByte();
			
			if (opcao == 1) {
				
				boolean diaValido = false;
				boolean horaValida = false;
				
				while (!diaValido) {
					System.out.println("Entre com o dia:");
					dia = scan.nextInt();
					
					if (dia > 0 && dia <= 31) {
						diaValido = true;
					} else {
						System.out.println("Dia inválido, digite novamente");
					}
				}
				
				while (!horaValida) {
					System.out.println("Entre com a hora:");
					dia = scan.nextInt();
					
					if (hora >= 0 && hora <= 24) {
						horaValida = true;
					} else {
						System.out.println("Hora inválida, digite novamente");
					}
				}
				
				dia--;
				System.out.println("Entre com o compromisso:");
				datas[dia][hora] = scan.next();
				
			} else if (opcao == 2) {
				
				boolean diaValido = false;
				boolean horaValida = false;
				
				while (!diaValido) {
					System.out.println("Entre com o dia:");
					dia = scan.nextInt();
					
					if (dia > 0 && dia <= 31) {
						diaValido = true;
					} else {
						System.out.println("Dia inválido, digite novamente");
					}
				}
				
				while (!horaValida) {
					System.out.println("Entre com a hora:");
					dia = scan.nextInt();
					
					if (hora >= 0 && hora <= 24) {
						horaValida = true;
					} else {
						System.out.println("Hora inválida, digite novamente");
					}
				}
				
				dia--;
				System.out.println("O compromisso agendado é: ");
				System.out.println(datas[dia][hora]);
				
			} else if (opcao == 3) {
				sair = true;
			} else {
				System.out.println("Opção inválida, informe outra opção");
			}
		}
	}

}
