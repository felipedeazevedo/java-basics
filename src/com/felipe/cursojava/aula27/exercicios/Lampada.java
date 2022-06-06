package com.felipe.cursojava.aula27.exercicios;

public class Lampada {
	
	String marca;
	String modelo;
	int potencia;
	String cor;
	String tipoLuz;
	int garantiaMeses;
	String[] tipos;
	double preco;
	boolean smart;
	boolean ligada;
	
	void ligar() {
		ligada = true;
		System.out.println("Lâmpada ligada");
	}
	
	void desligar() {
		ligada = false;
		System.out.println("Lâmpada desligada");
	}
	
	void mudarEstado() {
		if (ligada) {
			desligar();
		} else {
			ligar();
		}
	}
}
