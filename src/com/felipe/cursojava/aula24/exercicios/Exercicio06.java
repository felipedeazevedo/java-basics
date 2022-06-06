package com.felipe.cursojava.aula24.exercicios;

public class Exercicio06 {

	public static void main(String[] args) {
		
		ContatoAgenda contato1 = new ContatoAgenda();
		
		contato1.nome = "João";
		contato1.endereco = "Rua Teste, 1";
		contato1.email = "joao@gmail.com";
		contato1.telefones = new String[3];
		contato1.telefones[0] = "1234567";
		contato1.telefones[1] = "12345678";
		contato1.telefones[2] = "123456789";
	}

}
