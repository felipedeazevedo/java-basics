package com.felipe.cursojava.aula36.exercicios;

import java.util.Scanner;

public class TesteAgenda {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		
		System.out.println("Informe o nome da agenda:");
		String nome = scan.nextLine();
		
		Agenda agenda = new Agenda(nome);
		
		//Agenda agenda = new Agenda();
		//agenda.setNome(nome);
		
		Contato[] contatos = new Contato[3];
		
		for (int i = 0; i < contatos.length; i++) {
			Contato c = new Contato();
			
			System.out.println("Informe o nome do contato " + (i + 1));
			String nomeContato = scan.nextLine();
			c.setNome(nomeContato);
			
			System.out.println("Informe o telefone do contato " + (i + 1));
			String telefone = scan.nextLine();
			c.setTelefone(telefone);
			
			System.out.println("Informe o email do contato " + (i + 1));
			String email = scan.nextLine();
			c.setEmail(email);
			
			contatos[i] = c;
		}
		
		agenda.setContatos(contatos);
		
		if (agenda != null) {
			System.out.println(agenda.exibirTodosContatos());
		}

	}

}
