package com.felipe.cursojava.aula27.exercicios;

public class ContaCorrente {

	String numero;
	boolean especial;
	double limiteEspecial;
	double saldo;
	
	boolean sacar(double valorSaque) {
		
		if (saldo >= valorSaque) {
			saldo -= valorSaque;
			return true;
		} else { //sem saldo na conta
			if (especial) {
				double limite = limiteEspecial + saldo;
				if (limite > valorSaque) {
					saldo -= valorSaque;
					return true;
				} else {
					return false;
				}
			} else {
				return false; //não é especial e nem tem saldo suficiente
			}
		}
	}
	
	void depositar(double valorDeposito) {
		saldo += valorDeposito;
	}
	
	void consultarSaldo() {
		System.out.println("O saldo atual da conta é: " + saldo);
	}
	
	boolean verificarChequeEspecial() {
		return saldo < 0;
	}

}
