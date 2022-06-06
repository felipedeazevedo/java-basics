package com.felipe.cursojava.aula20.exercicios;

import java.util.Scanner;

public class Exercicio05 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		String[][][] datas = new String[12][31][8];
		int mes = 0, dia = 0, hora = 0;
		boolean sair = false;
		byte opcao;
		
		while (!sair) {
			
			System.out.println("Informe a opção desejada:");
			System.out.println("1) Adicionar compromisso");
			System.out.println("2) Verificar compromisso");
			System.out.println("3) Sair do menu");
			
			opcao = scan.nextByte();
			
			if (opcao == 1) {
				
				boolean mesValido = false;
				boolean diaValido = false;
				boolean horaValida = false;
				
				while (!mesValido) {
					System.out.println("Entre com o mês:");
					mes = scan.nextInt();
					
					if (mes > 0 && mes <= 12) {
						mesValido = true;
					} else {
						System.out.println("Mês inválido, digite novamente");
					}
				}
				
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
					
					if (hora >= 0 && hora <= 8) {
						horaValida = true;
					} else {
						System.out.println("Hora inválida, digite novamente");
					}
				}
				
				mes--;
				dia--;
				System.out.println("Entre com o compromisso:");
				datas[mes][dia][hora] = scan.next();
				
			} else if (opcao == 2) {
				
				boolean mesValido = false;
				boolean diaValido = false;
				boolean horaValida = false;
				
				while (!mesValido) {
					System.out.println("Entre com o mês:");
					mes = scan.nextInt();
					
					if (mes > 0 && mes <= 12) {
						mesValido = true;
					} else {
						System.out.println("Mês inválido, digite novamente");
					}
				}
				
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
				
				mes--;
				dia--;
				System.out.println("O compromisso agendado é: ");
				System.out.println(datas[mes][dia][hora]);
				
			} else if (opcao == 3) {
				sair = true;
			} else {
				System.out.println("Opção inválida, informe outra opção");
			}
		}
	}

}
