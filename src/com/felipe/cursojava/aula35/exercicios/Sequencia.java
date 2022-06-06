package com.felipe.cursojava.aula35.exercicios;

public class Sequencia {
	
	public static int somatorio(int num) {
		
		if (num == 1) {
			return 1;
		}
		
		return num + somatorio(num - 1);
	}

}
