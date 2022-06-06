package com.felipe.cursojava.aula34.exercicios;

public class Calculadora {
	
	public static int somar(int num1, int num2) {
		return num1 + num2;
	}
	
	public static int subtrair(int num1, int num2) {
		return num1 - num2;
	}
	
	public static int multiplicar(int num1, int num2) {
		return num1 * num2;
	}
	
	public static double dividir(int num1, int num2) {
		return (double) num1 / num2;
	}
	
	public static double potencia(int num, int n) {
		
		int total = 1;
		for (int i = 1; i <= n; i++) {
			total *= num;
		}
		
		return total;
	}
	
	public static int fatorial(int num) {
		int fat = 1;
		
		if (num == 0) {
			return 1;
		}
		
		for (int i = num; i > 1; i--) {
			fat *= i;
		}
		
		/*int fat2 = 1;
		while(num > 1) {
			fat2 = fat2 * num;
			num--;
		}*/
		return fat;
	}
	
}
