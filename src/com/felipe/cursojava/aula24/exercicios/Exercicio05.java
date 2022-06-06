package com.felipe.cursojava.aula24.exercicios;

public class Exercicio05 {

	public static void main(String[] args) {
		
		ContaCorrente conta = new ContaCorrente();
		
		conta.numero = "123456";
		conta.agencia = "1234";
		conta.especial = true;
		conta.limiteEspecial = 500;
		conta.saldo = 100;
		
		System.out.println("Conta: " + conta.numero);
		System.out.println("Agência: " + conta.agencia);
		System.out.println("Saldo: " + conta.saldo);
	}

}
