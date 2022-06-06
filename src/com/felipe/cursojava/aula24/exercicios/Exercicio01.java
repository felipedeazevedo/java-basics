package com.felipe.cursojava.aula24.exercicios;

public class Exercicio01 {

	public static void main(String[] args) {
		
		Lampada lampada = new Lampada();
		lampada.marca = "";
		lampada.modelo = "A60";
		lampada.potencia = 7;
		lampada.cor = "Amarela";
		lampada.tipoLuz = "Amarela";
		lampada.garantiaMeses = 36;
		lampada.tipos = new String[5];
		
		lampada.tipos[0] = "Abajur";
		lampada.tipos[1] = "Lampeões";
		
		lampada.preco = 34.50;
		lampada.smart = false;
	}

}
