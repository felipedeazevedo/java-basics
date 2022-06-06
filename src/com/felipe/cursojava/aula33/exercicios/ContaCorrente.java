package com.felipe.cursojava.aula33.exercicios;

public class ContaCorrente {
	
	private String numero;
	private boolean especial;
	private double limiteEspecial;
	private double saldo;
	
	public ContaCorrente() {}

	public ContaCorrente(String numero, boolean especial, double limiteEspecial, double saldo) {
		this.numero = numero;
		this.especial = especial;
		this.limiteEspecial = limiteEspecial;
		this.saldo = saldo;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public boolean isEspecial() {
		return especial;
	}

	public void setEspecial(boolean especial) {
		this.especial = especial;
	}

	public double getLimiteEspecial() {
		return limiteEspecial;
	}

	public void setLimiteEspecial(double limiteEspecial) {
		this.limiteEspecial = limiteEspecial;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public boolean sacar(double valorSaque) {
		
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
	
	public void depositar(double valorDeposito) {
		saldo += valorDeposito;
	}
	
	public void consultarSaldo() {
		System.out.println("O saldo atual da conta é: " + saldo);
	}
	
	public boolean verificarChequeEspecial() {
		return saldo < 0;
	}
}
