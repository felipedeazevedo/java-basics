package com.felipe.cursojava.aula24.exercicios;

import java.util.Date;

public class Exercicio04 {

	public static void main(String[] args) {
		
		LivroBiblioteca livro = new LivroBiblioteca();
		
		livro.nome = "Mastering ExtJS";
		livro.autor = "Loiane Groner";
		livro.anoLancamento = 2015;
		
		livro.emUso = true;
		livro.dataEntrega = new Date();
		livro.autorEmprestimo = "Felipe";
		
		System.out.print("Livro em uso? ");
		System.out.println(livro.emUso ? "Sim" : "Não");
		System.out.println("Emprestado a: " + livro.autorEmprestimo);
		System.out.println("Data de entrega: " + livro.dataEntrega);
	}

}
