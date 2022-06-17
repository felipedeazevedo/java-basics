package com.felipe.cursojava.aula45;

public class Teste {

	public static void main(String[] args) {
		
		
		Aluno aluno = new Aluno();
		Pessoa pessoaAluno = aluno; //upcasting - transformando uma classe menor em um tipo de uma classe menor
		
		Pessoa aluno2 = new Aluno(); // um tipo de upcasting
		
		Pessoa aluno3 = (Pessoa) new Aluno();
	}

}
