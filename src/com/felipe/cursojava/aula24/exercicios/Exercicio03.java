package com.felipe.cursojava.aula24.exercicios;

public class Exercicio03 {

	public static void main(String[] args) {
		
		LivroLivraria livro = new LivroLivraria();
		
		livro.nome = "Mastering ExtJS";
		livro.autor = "Loiane Groner";
		livro.anoLancamento = 2015;
		livro.preco = 63.39;
		
		String nome = livro.nome;
		
		System.out.println("Nome do livro: " + nome);
	}

}
