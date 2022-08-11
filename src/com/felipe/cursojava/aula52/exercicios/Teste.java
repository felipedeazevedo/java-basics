package com.felipe.cursojava.aula52.exercicios;

import java.util.Scanner;

public class Teste {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		Agenda agenda = new Agenda();
		
		int opcao = 0;
		
		while (opcao != 3) {
			opcao = receberOpcaoMenu(scan);
			if (opcao == 1) {
				consultarContato(scan, agenda);
			} else if (opcao == 2) {
				adicionarContato(scan, agenda);
			} else {
				System.exit(0);
			}
		}
	}
	
	public static void consultarContato(Scanner scan, Agenda agenda) {
		String nomeContato = leEntradaString(scan, "Informe o nome do contato:");
		try {
			if (agenda.consultarContato(nomeContato) >= 0) {
				System.out.println("Contato existe");
			}
		} catch (ContatoNaoExisteException e) {
			System.out.println(e.getMessage());
		}
	}
	
	public static void adicionarContato(Scanner scan, Agenda agenda) {
		
		try {
			System.out.println("Entre com as informações do contato:");
			String nomeContato = leEntradaString(scan, "Informe o nome do contato:");
			String telefone = leEntradaString(scan, "Informe o telefone do contato:");
			String email = leEntradaString(scan, "Informe o email do contato:");
			
			Contato contato = new Contato();
			contato.setNome(nomeContato);
			contato.setTelefone(telefone);
			contato.setEmail(email);
			
			System.out.println("Contato a ser criado:");
			System.out.println(contato);
			agenda.adicionarContato(contato);
		} catch (AgendaCheiaException e) {
			System.out.println(e.getMessage());
			System.out.println("Contatos da agenda:");
			System.out.println(agenda);
		}
	}
	
	public static String leEntradaString(Scanner scan, String msg) {
		System.out.println(msg);
		String entrada = scan.nextLine();
		return entrada;
	}
	
	public static int receberOpcaoMenu(Scanner scan) {
		
		boolean opcaoValida = false;
		int opcao = 3;
		String entrada = "";
		
		while (!opcaoValida) {
			System.out.println("Informe uma opção: ");
			System.out.println("1) Consultar contato");
			System.out.println("2) Adicionar contato");
			System.out.println("3) Sair");
			
			try {
				entrada = scan.nextLine();
				opcao = Integer.parseInt(entrada);
				
				if (opcao != 1 && opcao != 2 && opcao != 3) {
					throw new Exception("Entrada inválida");
				} else {
					opcaoValida = true;
				}
			} catch (Exception e){
				System.out.println("Entrada inválida, digite novamente\n");
			}
		}
		
		return opcao;
	}

}
