package com.felipe.cursojava.aula35;

public class Calculadora {
	
	public static int fatorialNaoRecursivo(int num) {
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
	
	public static int fatorial(int num) {
		
		if (num == 0) {
			return 1;
		}
		
		return num * fatorial(num - 1);
	}

}
