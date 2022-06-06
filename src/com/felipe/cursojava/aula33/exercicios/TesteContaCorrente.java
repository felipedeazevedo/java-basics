package com.felipe.cursojava.aula33.exercicios;

public class TesteContaCorrente {

	public static void main(String[] args) {
		
		ContaCorrente conta = new ContaCorrente();
		
		conta.setSaldo(50);
		conta.setEspecial(true);
		conta.setLimiteEspecial(100);
		
		conta.sacar(50);
		conta.depositar(21.3);
		
		boolean saqueEfetuado = conta.sacar(10);
		if (saqueEfetuado) {
			System.out.println("Saque efetuado com sucesso!");
			conta.consultarSaldo();
		} else {
			System.out.println("Não foi possível realizar o saque. Saldo insuficiente!");
		}
		
		
		boolean chequeEspecial = conta.verificarChequeEspecial();
		System.out.println("Está usando cheque especial? " + (chequeEspecial? "Sim" : "Não"));
		
		conta.consultarSaldo();

		saqueEfetuado = conta.sacar(50);
		if (saqueEfetuado) {
			System.out.println("Saque efetuado com sucesso!");
			conta.consultarSaldo();
		} else {
			System.out.println("Não foi possível realizar o saque. Saldo insuficiente!");
		}
		
		chequeEspecial = conta.verificarChequeEspecial();
		System.out.println("Está usando cheque especial? " + (chequeEspecial? "Sim" : "Não"));
		
		conta.depositar(200);
		
		saqueEfetuado = conta.sacar(1000);
		System.out.println(saqueEfetuado? "Saque efetuado!" : "Saldo insuficiente!");
	}

}
