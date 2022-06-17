package com.felipe.cursojava.aula43.exercicios;

public class TestePessoa {

	public static void main(String[] args) {
		
		PessoaFisica p1 = new PessoaFisica("Pessoa 1", 1000, "11111");
		PessoaFisica p2 = new PessoaFisica("Pessoa 2", 2000, "22222");
		PessoaFisica p3 = new PessoaFisica("Pessoa 3", 3700, "33333");
		
		PessoaJuridica pj1 = new PessoaJuridica("Pj 1", 5000, "44444");
		PessoaJuridica pj2 = new PessoaJuridica("Pj 2", 3000, "55555");
		PessoaJuridica pj3 = new PessoaJuridica("Pj 3", 4000, "66666");
		
		Contribuinte[] contribuintes = new Contribuinte[6];
		contribuintes[0] = p1;
		contribuintes[1] = p2;
		contribuintes[2] = p3;
		contribuintes[3] = pj1;
		contribuintes[4] = pj2;
		contribuintes[5] = pj3;
		
		for (Contribuinte contribuinte : contribuintes) {
			System.out.println(contribuinte);
		}
	}

}
